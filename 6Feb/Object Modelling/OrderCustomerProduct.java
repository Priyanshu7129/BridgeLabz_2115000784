import java.util.*;
class Order {
    int o_id;
    List<Product> p = new ArrayList<>();
    double t;

    Order(int o_id) {
        this.o_id = o_id;
    }
    void addP(Product p) {
        this.p.add(p);
        t += p.p_price;
    }
    void showOD() {
        System.out.println("O ID: " + o_id);
        for (Product p : this.p) {
            System.out.println("P: " + p.p_name + ", P: " + p.p_price);
        }
        System.out.println("T: " + t);
    }
}
class Customer {
    String c_name;
    List<Order> o = new ArrayList<>();

    Customer(String c_name) {
        this.c_name = c_name;
    }
    void placeO(Order o) {
        this.o.add(o);
    
    void showCO() {
        System.out.println("O placed by " + c_name + ":");
        for (Order o : this.o) {
            o.showOD();
        }
    }
}
class Product {
    String p_name;
    double p_price;

    Product(String p_name, double p_price) {
        this.p_name = p_name;
        this.p_price = p_price;
    }
}
class OrderCustomerProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("C N: ");
        String c_name = sc.nextLine();
        Customer c = new Customer(c_name);

        System.out.print("No of O: ");
        int o_no = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < o_no; i++) {
            System.out.print("O ID: ");
            int o_id = sc.nextInt();
            sc.nextLine();

            Order o = new Order(o_id);

            System.out.print("No of P: ");
            int p_no = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < p_no; j++) {
                System.out.print("P N: ");
                String p_name = sc.nextLine();
                System.out.print("P P: ");
                double p_price = sc.nextDouble();
                sc.nextLine();

                Product p = new Product(p_name, p_price);
                o.addP(p);
            }
            c.placeO(o);
        }
        c.showCO();
        sc.close();
    }
}