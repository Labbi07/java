package lab8;
import java.io.*;
public class Ques1 
{
	public static void main(String []args)throws IOException
	{
		FileReader fr = new FileReader("f1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int lines=0;
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
			lines++;
		}
		System.out.println("Number of lines: "+lines);
		String[] arr= new String(10);
		
		
		br.close();
	}
}
