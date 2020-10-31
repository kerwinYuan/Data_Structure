package myList;

public class MyList<E> {

    private int size;

    private ListNode head;

    public MyList(){
        size = 0;
        head = new ListNode(null);
    }

    public MyList(E e){
        head = new ListNode(null);
        head.next = new ListNode(e);
        size++;
    }

    public void add(E e){
        if(head == null){
            new ListNode(null);
        }

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new ListNode(e);
        size++;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("MyList: size:"+size+"\nhead ->");
        ListNode temp = head.next;
        while(temp!= null){
            sb.append(temp.val+" ->");
            temp = temp.next;
        }
        sb.append("null");

        return sb.toString();
    }

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        System.out.println(myList.toString());

    }


}
class ListNode<E> {
    E val;
    ListNode next;
    ListNode(E x) { val = x; }



    public ListNode(E val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}
