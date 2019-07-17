package lab4;
import java.util.*;
public class Main 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String first = sc.nextLine();
		System.out.println("Enter last name:");
		String last = sc.nextLine();
		System.out.println("Enter gender:");
		char gender = sc.next().charAt(0);
		Person person = new Person();
		person.setFirstName(first);
		person.setLastName(last);
		person.setGen(gender);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getGen());
		sc.close();
	}
}
