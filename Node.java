public class Node {
    //attributes
    protected String data;
    protected Node next;

    //no param constructor
    public Node(){
        data = null;
        next = null;
    }

    //1 param constructor
    public Node(String item) {
        data = item;
    }

    //2 param constructor
    public Node(String item, Node after) {
        data = item;
        next = after;
    }
}
