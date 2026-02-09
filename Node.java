package Grocery_List;

public class Node {
    protected String data;
    protected Node next;

    public Node(){
        data = null;
        next = null;
    }

    public Node(String item) {
        data = item;
    }

    public Node(String item, Node after) {
        data = item;
        next = after;
    }
}
