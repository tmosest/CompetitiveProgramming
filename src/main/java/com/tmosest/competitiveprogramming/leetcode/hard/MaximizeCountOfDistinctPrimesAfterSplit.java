package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class MaximizeCountOfDistinctPrimesAfterSplit {

    private static class SegmentTree {
        private int n;
        private int[] tree;
        private int[] lazy;

        public SegmentTree(int n) {
            this.n = n;
            int size = 1 << (32 - Integer.numberOfLeadingZeros(n - 1) + 1);
            tree = new int[size];
            lazy = new int[size];
        }

        public void update(int left, int right, int delta) {
            update(0, 0, n, left, right, delta);
        }

        public int query() {
            return tree[0];
        }

        private void update(int node, int begin, int end, int left, int right, int delta) {
            if (left >= end || right <= begin) return;

            if (left <= begin && end <= right) {
                tree[node] += delta;
                lazy[node] += delta;
                return;
            }

            pushDown(node, begin, end);

            int mid = begin + (end - begin) / 2;
            update(node * 2 + 1, begin, mid, left, right, delta);
            update(node * 2 + 2, mid, end, left, right, delta);
            tree[node] = Math.max(tree[node * 2 + 1], tree[node * 2 + 2]);
        }

        private void pushDown(int node, int begin, int end) {
            if (lazy[node] == 0) return;

            int leftNode = node * 2 + 1;
            int rightNode = node * 2 + 2;

            tree[leftNode] += lazy[node];
            lazy[leftNode] += lazy[node];

            tree[rightNode] += lazy[node];
            lazy[rightNode] += lazy[node];

            lazy[node] = 0;
        }
    }

    public int[] maximumCount(int[] nums, int[][] queries) {
        int n = nums.length;
        int maxNum = Math.max(
            Arrays.stream(nums).max().getAsInt(),
            Arrays.stream(queries).mapToInt(q -> q[1]).max().getAsInt()
        );

        boolean[] isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        populateIsPrime(isPrime, maxNum);

        Map<Integer, TreeSet<Integer>> primeIndices = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (isPrime[nums[i]]) {
                primeIndices.computeIfAbsent(nums[i], k -> new TreeSet<>()).add(i);
            }
        }

        SegmentTree segmentTree = new SegmentTree(n);
        for (TreeSet<Integer> indices : primeIndices.values()) {
            updateSegmentTree(segmentTree, indices, 1);
        }

        int[] ret = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            int originalValue = nums[index];

            if (originalValue != value) {
                nums[index] = value;
                if (isPrime[originalValue]) {
                    TreeSet<Integer> indices = primeIndices.get(originalValue);
                    updateSegmentTree(segmentTree, indices, -1);
                    indices.remove(index);
                    if (indices.isEmpty()) {
                        primeIndices.remove(originalValue);
                    } else {
                        updateSegmentTree(segmentTree, indices, 1);
                    }
                }
                if (isPrime[value]) {
                    TreeSet<Integer> indices = primeIndices.computeIfAbsent(value, k -> new TreeSet<>());
                    updateSegmentTree(segmentTree, indices, -1);
                    indices.add(index);
                    updateSegmentTree(segmentTree, indices, 1);
                }
            }
            ret[i] = primeIndices.size() + segmentTree.query();
        }
        return ret;
    }

    private void populateIsPrime(boolean[] isPrime, int maxNum) {
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= maxNum; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= maxNum / i; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
    }

    private void updateSegmentTree(SegmentTree segmentTree, TreeSet<Integer> indices, int delta) {
        if (indices.size() < 2) return;
        int left = indices.first();
        int right = indices.last() + 1;
        segmentTree.update(left, right, delta);
    }
}
