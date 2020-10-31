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
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(12233221));
    }
}

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }


  }

