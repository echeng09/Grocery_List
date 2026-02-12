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


    public void remove(int idx) {
        //Removes the grocery item from the list at the specified index.
        if (((head== null) && idx > size()) || idx <0) {
            return;
        } else if (idx == 0) {
            head = head.next;
            return;
        } else {
            Node curr = head;
            for (int i=0; i < idx-1; i++) {
                curr = curr.next;
            }
            curr.next=curr.next.next;
        }
    }

    public Map<String, Double> getGroceryMap() throws FileNotFoundException{
        //This function is a helper method that returns a Map containing each grocery item in the list (key) and its respective price (value).
        Map<String, Double> mapToRet = new HashMap<>();
        File f = new File("/Users/echeng/Desktop/HCSS/CS_Seminar/Projects/grocery-items.txt"); //can also do just file name but doesn't work on mine for some reason
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()){
            String read = sc.nextLine();
            String[] splitted = read.split("\" ");
            String name = splitted[0];
            double price = Double.parseDouble(splitted[1]); //string->double
            mapToRet.put(name, price);
        }
        sc.close();
        return mapToRet;
    }
}
