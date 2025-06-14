package com.tmosest.competitiveprogramming.leetcode.medium;


class PartitionArrayIntoTwoEqualProductSubsets {

    public boolean checkEqualPartitions(int[] nums, long target) {
        int n=nums.length;
        int total=(1<<n);
        // System.out.println(total);
        for(int i=1;i<total;i++){
            long p1=1;
            long p2=1;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    p1=p1*nums[j];
                }
                else{
                    p2=p2*nums[j];
                }
            }
            // System.out.print(p1+":"+p2+", ");
            if(p1==p2 && p2==target){
                return true;
            }
        }
        return false;    
	}
}
