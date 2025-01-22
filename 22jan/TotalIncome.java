import java.util.Scanner; 
public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary: INR ");
        double salary = input.nextDouble(); 
        System.out.print("Enter the bonus: INR ");
        double bonus = input.nextDouble(); 
		
        double totalIncome = salary + bonus;
        
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
