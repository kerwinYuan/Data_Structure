package leetcode.leetcode20;

public class IsValid {
    public static boolean isValid(String s) {
        ListNode list = new ListNode(0);
        list.size =0;
        for(int i = 0 ; i < s.length();i++){
            char temp = s.charAt(i);
            ListNode listTemp = list;
            if( temp == '[' || temp == '{' || temp == '('){

                ListNode tempNode = new ListNode(temp);
                tempNode.next = listTemp;
                list = tempNode;
                list.size++;
            }else if(temp == ')'){
                if(list.val != '('){
                    return false;
                }else{
                    list = list.next;
                }
            }else if(temp == ']'){
                if(list.val != '['){
                    return false;
                }else{
                    list = list.next;
                }
            }else if(temp == '}'){
                if(list.val != '{'){
                    return false;
                }else{
                    list = list.next;
                }
            }
        }
        if(list.size !=0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("["));
    }
}

class ListNode {
    int size;
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
