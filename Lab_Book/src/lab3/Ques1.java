package lab3;
public class Ques1 
{

	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = num1+num2;
		if(num3>0)
			System.out.println("Positive Number");
		else
			System.out.println("Negative Number");
	}

}
