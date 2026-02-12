package Grocery_List;

public class GroceryList extends Node {
    private Node head;

    public GroceryList() {
        head = null;
    }

    public GroceryList(Node incoming) {
        head = incoming;
    }

    public void add(String item) {
        //Accepts a new grocery item, and adds it to the end of the Linked List
        Node newItem = new Node(item);
        if (head == null) {
            head = newItem;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newItem;
        }
    }
}
