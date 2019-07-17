package lab7;

import java.util.Scanner;

public class Ques2 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String first = sc.nextLine();
		System.out.println("Enter last name:");
		String last = sc.nextLine();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		try
		{
			validate(age);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
			System.exit(0);
		}
		System.out.println("Enter gender:");
		char gender = sc.next().charAt(0);
		Person person = new Person();
		person.setFirstName(first);
		person.setLastName(last);
		person.setGen(gender);
		person.setAge(age);
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getGen());
		sc.close();
	}
	
	static void validate(int age) throws MyException
	{
		if(age>15)
		{
			throw new MyException("Invalid age");
		}
		else
			System.out.println("Age Validated");
	}

}
