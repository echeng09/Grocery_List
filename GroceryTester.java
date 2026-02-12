import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        GroceryList list = new GroceryList();

        list.add("milk");
        list.add("eggs");
        list.add("bread");
        list.add("lettuce");
        list.add("salt");

        boolean loop = true;

        while (loop) {
            System.out.println("This is a grocery store. What would you like to do: ");
            System.out.println("1. Add item to list");
            System.out.println("2. Add item to list at a specific index");
            System.out.println("3. Remove item at a specific index");
            System.out.println("4. See list size");
            System.out.println("5. Print Receipt");
            System.out.println("6. Exit");
            int chose = s.nextInt();

            if (chose == 1) {
                System.out.println("Item name: ");
                String incoming = s.nextLine();
                list.add(incoming);
                System.out.println("Added.");
            } else if (chose == 2) {
                System.out.println("Item name: ");
                String incoming = s.nextLine();
                System.out.println("Index to add: ");
                int idx = s.nextInt();
                list.add(incoming, idx);
                System.out.println("Added.");
            } else if (chose == 3) {
                System.out.print("Index to remove: ");
                int idx = s.nextInt();
                list.remove(idx);
                System.out.println("Removed.");
            } else if (chose ==4) {
                System.out.println("You have " + list.size() + " things in your list.");
            } else if (chose == 5) {
                list.printReceipt();
            } else if (chose == 6) {
                System.out.println("Bye! Have a good day! :)");
                loop = false;
            } else {
                System.out.println("Invalid.");
            }

            System.out.println("Would you like to return to main menu? (yes/no) ");
            String ret = s.nextLine();
            if(ret == "no") {
                loop = false;
            }
        }
    
        //Testing methods from earlier
        /*System.out.println(list);
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
        System.out.println(list.getCost());
        list.printReceipt();
        */
    }
}
