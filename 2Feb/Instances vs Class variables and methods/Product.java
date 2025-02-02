import java.util.Scanner;
public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product product = new Product(productName, price);
        product.displayProductDetails();
        Product.displayTotalProducts();
    }
}