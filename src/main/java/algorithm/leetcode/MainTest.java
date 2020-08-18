package algorithm.leetcode;

import org.junit.Test;
import java.util.Arrays;

public class MainTest {

    // 2. 两数相加
    @Test
    public void test2() {
        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(4);
        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    // 1.两数之和
    @org.junit.Test
    public void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
