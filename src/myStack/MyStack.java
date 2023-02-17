package myStack;

/*
 *栈是一种先进后出的一种数据结构 无论是通过数组还是队列均可实现
 */
public class MyStack<E> {
    private int size;

    private Node datas;

    public MyStack(){
        size = 0;
        datas = new Node<>();
    }

    public void push(E e){
        Node node = new Node(e);
        Node temp = datas.next;
        node.next = temp;
        datas.next = node;
        size++;

    }

    public E pop(){
        Node node = datas.next;
        datas.next = node.next;
        size--;
        return (E)node.getData();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("size:"+size+"\n");
        Node temp = datas;
        while(temp.next != null){
            if (temp.next.next != null){
                sb.append(temp.next.data+"->");
            }else {
                sb.append(temp.next.data);
            }

            temp = temp.next;
        }
        //sb.append(temp.data);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(0%10);
        MyStack<String> stack = new MyStack();
        stack.push("1");
        System.out.println(stack.toString());
        stack.push("2");
        System.out.println(stack.toString());
        stack.push("3");
        System.out.println(stack.toString());
    }


}

class Node<E>{

    protected E data;

    protected Node next;

    public Node(E e){
        data = e;
    }
    public Node(){

    }

    public E getData() {
        return data;
    }
}
