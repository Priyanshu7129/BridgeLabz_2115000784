import java.util.Scanner;
public class VotingCriteria{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the age of person: ");
		int age = sc.nextInt();
		if(age>=18){
			System.out.print("The person's age is " + age + " and can vote");
		}
		else{
			System.out.print("The person's age is " + age + " and cannot vote");
		}
	}
}