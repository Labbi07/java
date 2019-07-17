package lab7;

public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	private char gen;
	Person()
	{
		firstName = "";
		lastName = "";
		gen = '\u0000';
		age=0;
	}
	
	Person(String firstName, String lastName, char gen)
	{
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.gen = gen;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

}
