package lesson1.exercises;
import java.util.Date;
public class Exercise8 
{ public static void main(String []args)
	{
	  BankAccount account = new BankAccount(10_000, new Date());
	  System.out.println(account.getId());
	  System.out.println(account.getBalance());
	  System.out.println(account.getCreationDate());
	  account.getCreationDate().setTime(1);
	  System.out.println(account.getCreationDate());
		
	}

}
