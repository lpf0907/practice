package algorithm.leetcode;

import sun.awt.image.IntegerComponentRaster;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 获取数字
        ArrayList<Integer> l1Array = new ArrayList<>();
        ArrayList<Integer> l2Array = new ArrayList<>();
        ArrayList<Integer> targetArray = new ArrayList<>();
        while (l1!= null){
            l1Array.add(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            l2Array.add(l2.val);
            l2 = l2.next;
        }
        // 按顺序相加，用长的循环，短的补0，进位+1
        int targetLength = l1Array.size()>l2Array.size()?l1Array.size():l2Array.size();
        int carryFlag = 0,num1=0,num2=0,sum=0;
        for (int i=0;i<targetLength;i++){
            sum = 0;
            num1 = i < l1Array.size() ? l1Array.get(i) : 0;
            num2 = i < l2Array.size() ? l2Array.get(i) : 0;
            sum = num1 + num2 + carryFlag;
            targetArray.add((sum)%10);
            carryFlag = sum >= 10 ? 1 : 0;
        }
        if (carryFlag == 1){
            targetArray.add(1);
        }
        // 整数转node
        ListNode result = null;
        ArrayList<ListNode> tmpResult = new ArrayList<ListNode>();
        for (int k = 0;k<targetArray.size();k++){
            ListNode node = new ListNode(targetArray.get(k));
            tmpResult.add(node);
        }
        for (int m = 0; m<tmpResult.size()-1;m++){
            tmpResult.get(m).next = tmpResult.get(m+1);
        }
        return tmpResult.get(0);
    }
}

