package lab7;
import java.util.Random;
import com.cg.eis.exception.EmployeeException;
public class Ques3 
{
	public static void main(String []args)
	{
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Person1 person1 = new Person1();
		person1.setName("Smith");
		person1.setAge(23);
		Account1 account1 = new Account1();
		account1.setAccNum((long)rand.nextInt(9000000) + 1000000);
		//account1.setAccNum(accNum);
		account1.setBalance(2000);
		account1.setAccHolder(person1);
		account1.deposit(2000);
		
		Person1 person2 = new Person1();
		person2.setName("Kathy");
		person2.setAge(21);
		Account1 account2 = new Account1();
		account2.setAccNum((long)rand.nextInt(9000000) + 1000000);
		//account2.setAccNum(accNum);
		account2.setBalance(3000);
		account2.setAccHolder(person2);
		account2.withdraw(2000);
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();
		try
		{
			validate(bal1);
			validate(bal2);
		}
		catch(EmployeeException m)
		{
			System.out.println("Exception occured: " +m);
			System.exit(0);
		}
		System.out.println("Smith Balance: "+bal1);
		System.out.println("Kathy Balance: "+bal2);
		System.out.println(account1.getAccNum());
		System.out.println(account2.getAccNum());
		System.out.println(account1);
		System.out.println(account2);
	}
	
	public static void validate(double sal)throws EmployeeException
	{
		if(sal<3000)
		{
			throw new EmployeeException("Salary too less!");
		}
		else
			System.out.println("Salary Validated!");
	}
}
