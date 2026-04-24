import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Add Stock");
            System.out.println("4. Remove Stock");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                inventory.addItem(new Item(id, name, qty));
            }

            else if (choice == 2) {
                inventory.showItems();
            }

            else if (choice == 3) {
                System.out.print("Enter Item ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Quantity to Add: ");
                int qty = sc.nextInt();

                Item item = inventory.findItem(id);
                if (item != null) {
                    item.addStock(qty);
                }
            }

            else if (choice == 4) {
                System.out.print("Enter Item ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Quantity to Remove: ");
                int qty = sc.nextInt();

                Item item = inventory.findItem(id);
                if (item != null) {
                    item.removeStock(qty);
                }
            }

            else if (choice == 5) {
                break;
            }
        }

        sc.close();
    }
}