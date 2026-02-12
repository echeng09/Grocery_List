import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GroceryList extends Node {
    //attributes
    private Node head;

    //constructors
    public GroceryList() {
        head = null;
    }

    public GroceryList(Node incoming) {
        head = incoming;
    }


    //methods
    public void add(String item) {
        //Accepts a new grocery item, and adds it to the end of the Linked List
        Node incoming = new Node(item);
        //if list is empty, then make the new node the head
        if (head == null) {
            head = incoming;
        } else { //else, traverse through linked list
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = incoming; //then add it to the end
        }
    }

    public void add(String item, int idx) {
        //Accepts a new grocery item and an index. The function should add that item to the specified index in the linked list.
        Node incoming = new Node(item);
        //if list empty, make new node 
        if (head == null || idx>size() || idx <0) {
            return;
        } else if (idx == 0) { //insert then at the beginning
            incoming.next = head;
            head = incoming;
            return;
        } else { //then traverse through
            Node curr = head;
            for(int i=0; i < idx-1; i++) {
                curr = curr.next;

            }
            //insert new node
            incoming.next = curr.next;
            curr.next = incoming;
        }
    }

    public void remove(int idx) {
        //Removes the grocery item from the list at the specified index.
        //check if invalid then return
        if (head == null || idx >= size() || idx < 0) {
            return;
        } else if (idx == 0) { //if then removing first element
            head = head.next;
            return;
        } else { //find the node before the target one
            Node curr = head;
            for (int i = 0; i < idx - 1; i++) {
                curr = curr.next;
            }
            //then remove with next next to move over it
            curr.next=curr.next.next;
        }
    }

    public int size() {
        //Returns the number of items in the list.
        int num = 0;
        Node curr = head;
        //traverse through and add to count each time
        while (curr != null){
            curr = curr.next;
            num++;
        }
        return num;
    }


    public Map<String, Double> getGroceryMap() throws FileNotFoundException{
        //This function is a helper method that returns a Map containing each grocery item in the list (key) and its respective price (value).
        Map<String, Double> mapToRet = new HashMap<>();
        File f = new File(("/Users/echeng/Desktop/HCSS/CS_Seminar/Projects/Grocery_List/grocery-items.txt")); //can also do file name but was causing errors
        Scanner scan = new Scanner(f);
        //traverse through the txt list
        while (scan.hasNextLine()) {
            //split up by the second " and then set vals into the map
            String read = scan.nextLine();
            String[] splitted = read.split("\" ");
            String name = splitted[0].substring(1);
            double price = Double.parseDouble(splitted[1]);
            mapToRet.put(name, price);
        }
        scan.close();
        return mapToRet;
    }


    public double getCost() {
        //Returns the total cost of the grocery trip.
        double tot = 0;
        //have to do the try thing or FileNotFound exceptions kept happening throughout methods that used eachother
        try {
            //using the previous method
            Map<String, Double> map = getGroceryMap();
            Node curr = head;
            //trverse through and add all costs from the map
            while (curr != null) {
                if (map.containsKey(curr.data)) { //fix null pointer error when get returns null
                    tot += map.get(curr.data);
                }
                curr = curr.next;
            }
        } catch (FileNotFoundException e) {
        }
        return tot;
    }

    public String toString() {
        //This function returns a string containing all of the items in the grocery list and their respective costs. Each grocery item should be on a new line.
        return ("Your total is: $" + getCost());
    }

    //public one additional method ()
    //maybe can print a receipt?
    //Come up with at least one additional method to increase the overall functionality of your grocery list program. Only constraint: cannot be an indexOf() method. This method should be similar in length and robustness to either of the add() methods, remove(), or getGroceryMap().
}
