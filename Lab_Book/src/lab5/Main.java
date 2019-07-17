package lab5;
import java.util.Random;
public class Main 
{
	public static void main(String []args)
	{
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Person person1 = new Person();
		person1.setName("Smith");
		person1.setAge(23);
		Account account1 = new Account();
		account1.setAccNum((long)rand.nextInt(9000000) + 1000000);
		//account1.setAccNum(accNum);
		account1.setBalance(2000);
		account1.setAccHolder(person1);
		account1.deposit(2000);
		
		Person person2 = new Person();
		person2.setName("Kathy");
		person2.setAge(21);
		Account account2 = new Account();
		account2.setAccNum((long)rand.nextInt(9000000) + 1000000);
		//account2.setAccNum(accNum);
		account2.setBalance(3000);
		account2.setAccHolder(person2);
		account2.withdraw(2000);
		
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();
		System.out.println("Smith Balance: "+bal1);
		System.out.println("Kathy Balance: "+bal2);
		System.out.println(account1.getAccNum());
		System.out.println(account2.getAccNum());
		System.out.println(account1);
		System.out.println(account2);
	}
}
