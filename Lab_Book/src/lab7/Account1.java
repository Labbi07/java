package lab7;


public class Account1 
{
	public long accNum = 2010001;
	private double balance;
	private Person1 accHolder;
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdraw(double amt)
	{
		balance -= amt;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum+1;
	}

	public Person1 getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person1 accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
}
