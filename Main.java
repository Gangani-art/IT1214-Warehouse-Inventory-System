import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String itemName;
        int quantity;

        System.out.print("Enter item name: ");
        itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Item added successfully!");
    }
}