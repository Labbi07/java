package lab4;

public class Person 
{
	private String firstName;
	private String lastName;
	private char gen;
	Person()
	{
		firstName = "";
		lastName = "";
		gen = '\u0000';
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

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}
}


