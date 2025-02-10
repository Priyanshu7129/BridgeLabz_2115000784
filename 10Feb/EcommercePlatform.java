abstract class Product {
    private int productId;
    private String name;
    private double price;
    
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }    
    public abstract double calculateDiscount();
    
    public double getPrice() {
        return price;
    }    
    public String getName() {
        return name;
    }
}
class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }   
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}
class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }   
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }   
    public double calculateDiscount() {
        return 0;
    }
}
interface Taxable {
    double calculateTax();
}
public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 1000);
        Product p2 = new Clothing(2, "T-Shirt", 50);
        Product p3 = new Groceries(3, "Apple", 5);
        
        System.out.println(p1.getName() + " Final Price: " + (p1.getPrice() - p1.calculateDiscount()));
        System.out.println(p2.getName() + " Final Price: " + (p2.getPrice() - p2.calculateDiscount()));
        System.out.println(p3.getName() + " Final Price: " + (p3.getPrice() - p3.calculateDiscount()));
    }
}
