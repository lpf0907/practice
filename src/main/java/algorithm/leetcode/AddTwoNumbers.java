package algorithm.leetcode;

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
        int num1=0,num2=0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        while (l1!= null){
            a.add(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            b.add(l2.val);
            l2 = l2.next;
        }

        // 转为整数后，求和
        for (int i = a.size()-1;i>=0;i--){
            num1 += (int)a.get(i) * Math.pow(10,i);
        }
        for (int j = b.size()-1;j>=0;j--){
            num2 += (int)b.get(j) * Math.pow(10,j);
        }
        Integer sum = num1 + num2;

        // 整数转node
        char[] tmp = sum.toString().toCharArray();
        int length = tmp.length;
        ListNode result = null;
        ArrayList<ListNode> tmpResult = new ArrayList<ListNode>();
        for (int k = length-1;k>=0;k--){
            ListNode node = new ListNode(tmp[k]-'0');
            tmpResult.add(node);
        }
        for (int m = 0; m<tmpResult.size()-1;m++){
            tmpResult.get(m).next = tmpResult.get(m+1);
        }
        return tmpResult.get(0);
    }
}

