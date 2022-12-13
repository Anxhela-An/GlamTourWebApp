package lesson7;
import java.util.InputMismatchException;
import lesson1.Util;
import lesson1.Email;
public class Example2 
{  public static void main(String []args)
	{
	int n=5;
	while(n>0)
	{
		System.out.print("Vendos nje email");
		String e = Util.getSystemInput().next();
		try
		{
			Email email = new Email(e);
			System.out.println(email+"u krijua.");
			n--;
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();
			System.out.println("Emaili "+ e+" ekziston!");
			
		}
		catch(InputMismatchException ex)
		{
			ex.printStackTrace();
			System.out.println("Emaili "+ e+ " eshte i pasakte!");
			
		}
	}
	}

}
