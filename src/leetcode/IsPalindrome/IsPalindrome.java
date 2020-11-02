package leetcode.IsPalindrome;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        if(x <= 0){
            return false;
        }
        Integer num = x;

        List<Integer> temp = new ArrayList<Integer>();

        for(int i = 0;x != 0 ; i++){
            int tempNum = x % 10;
            temp.add(tempNum);
            x/=10;
        }
        for (int j = 0; j < temp.size();j++){
            if(temp.get(j).equals(temp.get(temp.size()-j-1))){
                continue;
            }else {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome2(int x) {

        if(x <= 0){
            return false;
        }
        int reverse = 0;
        int temp = x;
        while(temp !=0){
            reverse = reverse*10+temp%10;
            temp/=10;
        }
        return reverse==x;
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null ){
            return true;
        }
        ListNode temp = head;
        ListNode reverseList = new ListNode(0);

        while (temp != null){
            ListNode node = new ListNode(temp.val);
            node.next = reverseList;
            reverseList = node;

            temp = temp.next;

        }
        temp = reverseList;
        ListNode temp2 = head;
        while (temp2 != null ){
            if(temp.val != temp2.val){
                return false;
            }
            temp = temp.next;

            temp2 = temp2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(1);

        System.out.println(isPalindrome(test));
    }
}

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

