package leetcode.mergeTwoLists;

public class MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null){
            return l2;
        }else if(l1 != null && l2 == null){
            return l1;
        }else if(l1 == null && l2 == null){
            return null;
        }
        ListNode after = new ListNode();
        ListNode temp = after;
        while(l1 != null && l2 != null){
            int tempL1 = l1.val;
            int tempL2 = l2.val;
            if(tempL1 > tempL2){
                temp.next = new ListNode(tempL2,null);
                l2 = l2.next;
                if(l2 == null){
                    temp.next.next = l1;
                    return after.next;
                }
            }else {
                temp.next = new ListNode(tempL1,null);
                l1 = l1.next;
                if(l1 == null){
                    temp.next.next = l2;
                    return after.next;
                }
            }
            temp = temp.next;
        }
        return after.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,null);
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(6,null)));
//       ListNode l2 = new ListNode();
        ListNode l3 = mergeTwoLists(l1,l2);
    }
}

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
