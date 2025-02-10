abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }   
    public abstract double calculateTotalPrice();
    
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }   
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}
class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }    
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 10;
    }
}
interface Discountable {
    void applyDiscount();
    double getDiscountDetails();
}
class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Salad", 5, 2);
        FoodItem f2 = new NonVegItem("Chicken Burger", 8, 1);
        
        System.out.println(f1.getItemDetails() + ", Total Price: " + f1.calculateTotalPrice());
        System.out.println(f2.getItemDetails() + ", Total Price: " + f2.calculateTotalPrice());
    }
}
