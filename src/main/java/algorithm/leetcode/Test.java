package algorithm.leetcode;

import java.util.Arrays;

public class Test {
    // 1.两数之和
    @org.junit.Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        int[] result = TwoSum.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
