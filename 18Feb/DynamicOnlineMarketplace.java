interface ProductCategory {
    String getCategoryName();
}
class BookCategory implements ProductCategory {
    @Override
    public String getCategoryName() {
        return "Book";
    }
}
class ClothingCategory implements ProductCategory {
    @Override
    public String getCategoryName() {
        return "Clothing";
    }
}
class GadgetCategory implements ProductCategory {
    @Override
    public String getCategoryName() {
        return "Gadget";
    }
}
class Product<T extends ProductCategory> {
    private T category;
    private String name;
    private double price;

    public Product(T category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }
    public T getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}
public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>(new BookCategory(), "Java Programming", 500);
        Product<ClothingCategory> shirt = new Product<>(new ClothingCategory(), "T-Shirt", 300);
        Product<GadgetCategory> phone = new Product<>(new GadgetCategory(), "Smartphone", 20000);

        DiscountUtil.applyDiscount(book, 10); 
        DiscountUtil.applyDiscount(shirt, 15); 
        DiscountUtil.applyDiscount(phone, 5); 

        System.out.println(book.getName() + " new price: " + book.getPrice());
        System.out.println(shirt.getName() + " new price: " + shirt.getPrice());
        System.out.println(phone.getName() + " new price: " + phone.getPrice());
    }
}
