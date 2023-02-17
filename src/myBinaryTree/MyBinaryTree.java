package myBinaryTree;

public class MyBinaryTree {
    private int size;
    private Node root;

    public MyBinaryTree(){
        size = 0;
    }

    public void add(int value){
        if (root == null){
            root = new Node(value,null,null);
            size++;
            return;
        }
        add(root,value);
        size++;
    }

    public void add(Node node,int value){
        if (node.value > value){
            if (node.leftNode == null){
                node.leftNode = new Node(value,null,null);
            }else {
                add(node.leftNode,value);
            }

        }else if (node.value < value){
            if (node.rightNode == null){
                node.rightNode = new Node(value,null,null);
            }else {
                add(node.rightNode,value);
            }
        }
    }

    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(3);
        myBinaryTree.add(2);
        myBinaryTree.add(4);
        myBinaryTree.add(1);
        myBinaryTree.add(5);
        System.out.println(myBinaryTree.root.rightNode.value);
    }

}
class Node{
    public int value;
    public Node leftNode;
    public Node rightNode;

    public Node(int value,Node leftNode,Node rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

}
