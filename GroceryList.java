package Grocery_List;

public class GroceryList extends Node {
    private Node head;

    public GroceryList() {
        head = null;
    }

    public GroceryList(Node incoming) {
        head = incoming;
    }
}
