public class Item {
    private int id;
    private String name;
    private int quantity;

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int qty) {
        this.quantity += qty;
    }

    public void removeStock(int qty) {
        this.quantity -= qty;
    }

    public void display() {
        System.out.println(id + " - " + name + " | Qty: " + quantity);
    }
}