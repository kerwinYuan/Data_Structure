package leetcode.validParentheses;

public class ValidParentheses {

    public static boolean solution(String s){
        if (s.length()<2){
            return false;
        }
        Node node = null;
        char[] arrays = s.toCharArray();
        for (int i = 0;i < arrays.length;i++){
            char tmp = arrays[i];
            if (tmp == '(' || tmp == '[' || tmp == '{'){
                if (node == null){
                    node = new Node(tmp,null);
                }else {
                    Node tempNode = new Node(tmp,node);
                    node = tempNode;
                }
            }else {
                if (node == null){
                    return false;
                }
                if (tmp == ')'){
                    if (node.getValue() != '('){
                        return false;
                    }
                }else if(tmp == ']'){
                    if (node.getValue() != '['){
                        return false;
                    }
                }else if(tmp == '}'){
                    if (node.getValue() != '{'){
                        return false;
                    }
                }
                node = node.getNextNode();

            }
        }
        if (node!= null){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(solution(s));
    }


}
class Node{

    private char value;
    private Node nextNode;

    public Node(char value,Node nextNode){
        this.value = value;
        this.nextNode = nextNode;
    }
    public char getValue(){
        return value;
    }
    public Node getNextNode(){
        return nextNode;
    }
}
