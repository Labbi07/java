package lab2;
import java.util.Scanner;
public class Ques1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name and last name:");
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		System.out.println("Enter gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter weight");
		double weight = sc.nextDouble();
		System.out.println("Person Details:");
		System.out.println("____________");
		System.out.println("First Name: " +firstName);
		System.out.println("Last Name: " +lastName);
		System.out.println("Gender: " +gender);
		System.out.println("Weight: " +weight);
		sc.close();
	}
}
