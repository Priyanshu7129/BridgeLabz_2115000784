import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person another) {
        this.name = another.name;
        this.age = another.age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Person person1 = new Person(name, age);
        Person person2 = new Person(person1);
        System.out.println("Name: " + person2.name + ", Age: " + person2.age);
    }
}