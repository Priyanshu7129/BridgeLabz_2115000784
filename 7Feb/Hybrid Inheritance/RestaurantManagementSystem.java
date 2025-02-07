class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking delicious meals.");
    }
}
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon Ramsay", 101);
        Worker waiter = new Waiter("Ramsay Bolton", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
