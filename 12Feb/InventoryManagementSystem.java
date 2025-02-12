import java.util.Scanner;
class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList {
    private Item head;

    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }
    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        if (position <= 1) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item newItem = new Item(itemName, itemId, quantity, price);
        Item temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            addItemAtEnd(itemName, itemId, quantity, price);
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }
    public void removeItem(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }
    public void searchItemById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println(temp.itemName + " - Quantity: " + temp.quantity + " - Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }
    public void searchItemByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equals(itemName)) {
                System.out.println(temp.itemId + " - Quantity: " + temp.quantity + " - Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }
    public void calculateTotalInventoryValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }
    public void displayItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + ": " + temp.itemName + " - Quantity: " + temp.quantity + " - Price: " + temp.price);
            temp = temp.next;
        }
    }
}
public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        Scanner scanner = new Scanner(System.in);

        inventory.addItemAtEnd("Laptop", 101, 5, 1000);
        inventory.addItemAtBeginning("Mouse", 102, 10, 25);
        inventory.addItemAtPosition("Keyboard", 103, 8, 50, 2);
        inventory.displayItems();

        System.out.println("Enter Item ID to update quantity: ");
        int itemId = scanner.nextInt();
        System.out.println("Enter new quantity: ");
        int quantity = scanner.nextInt();
        inventory.updateQuantity(itemId, quantity);
        inventory.displayItems();

        System.out.println("Enter Item ID to search: ");
        itemId = scanner.nextInt();
        inventory.searchItemById(itemId);

        inventory.calculateTotalInventoryValue();
        
        scanner.close();
    }
}
