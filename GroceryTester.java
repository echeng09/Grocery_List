import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        GroceryList list = new GroceryList();

        System.out.println("This is a grocery store. What would you like to do: ")
        System.out.println("1. Add item to list");
        System.out.println("2. Add item to list at a specific index");
        System.out.println("3. Remove item at a specific index");
        System.out.println("4. See list size");
        System.out.println("5. Exit");
        int chose = s.nextInt();

        if (chose == 1) {

        } else if (chose == 2) {

        } else if (chose == 3) {

        } else if (chose ==4) {

        } else if (chose == 5) {

        } else {
            System.out.println("invalid.")
        }

        /* Testing methods from earlier
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
        //test if not inside of the items list
        list.add("fruit", 2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.print(list.getCost());
        */
    }
}
