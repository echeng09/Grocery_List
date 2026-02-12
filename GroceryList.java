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

    public void add(String item, int idx) {
        //Accepts a new grocery item and an index. The function should add that item to the specified index in the linked list.
        Node newItem = new Node(item);
        if ((head == null)) {
            return;
        } else if (idx > size() || idx <0) {
            return;
        } else if (idx == 0) {
            newItem.next = head;
            head = newItem;
            return;
        } else {
            Node curr = head;
            for(int i=0; i < idx-1; i++) {
                curr = curr.next;

            }
            newItem.next = curr.next;
            curr.next = newItem;
        }
    }

    public int size() {
        //Returns the number of items in the list.
        int num = 0;
        Node curr = head;
        while (curr!= null){
            curr = curr.next;
            num++;
        }
        return num;
    }
}
