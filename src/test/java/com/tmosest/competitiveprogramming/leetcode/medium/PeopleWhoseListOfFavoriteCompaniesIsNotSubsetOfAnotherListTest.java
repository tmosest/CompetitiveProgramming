package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.utils.lists.MatrixListAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc189")
@DisplayName("LeetCode: 1452. People Whose List of Favorite Companies Is Not a Subset of Another List")
class PeopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherListTest {

  private PeopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherList peopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherList =
      new PeopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherList();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(new Integer[] {0,1,4}, peopleWhoseListOfFavoriteCompaniesIsNotSubsetOfAnotherList.peopleIndexes(
        MatrixListAdapter.toList(new String[][] {
            {"leetcode","google","facebook"}, {"google","microsoft"},
            {"google","facebook"}, {"google"}, {"amazon"}
        })
    ).toArray(new Integer[0]));
  }
}
