package Grocery_List;

import java.io.FileNotFoundException;

public class GroceryTester {
    public static void main(String[] args) throws FileNotFoundException {
        GroceryList list = new GroceryList();
        System.out.println(list);
        list.add("milk");
        list.add("eggs");
        list.add("bread");
        System.out.println(list);
        list.add("flour", 2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add("fruit", 2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.print(list.getCost());
    }
}
