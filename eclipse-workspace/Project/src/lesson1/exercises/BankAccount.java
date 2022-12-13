package lesson1.exercises;
import java.util.Date;
public class BankAccount 
{ 
	private Date creationDate;
	private double balance;
	private int id;
	private static int nextId=1;
	private static double annualInterestValue;
	
	public BankAccount()
	{
		this(0,new Date());
		creationDate = new Date();
	}
	public BankAccount(double balance)
	{
		this(balance, new Date());
		{
			this.balance=balance;
			creationDate = new Date();
		}		
	}
	public BankAccount(double balance, Date creationDate)
	{
		if(balance<0)
		{
			balance=0;
		}
		if(creationDate==null)
		{
			creationDate = new Date();
		}
		this.balance = balance;
		this.creationDate = creationDate;
		id=nextId;
		nextId++;
	}
	public Date getCreationDate()
	{
		Date date = new Date();
		date.setTime(creationDate.getTime());
		return date;
	}
	public long getCreationDateInMillis()
	{
		return creationDate.getTime();
	}
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public boolean deposite(double amount)
	{
		if(amount<=0)
		{
			return false;
		}
		if(balance+amount<0)
		{
			return false;
		}
		balance = balance +amount;
		return true;
	}
	public boolean withdraw(int amount)
	{
		if(amount<=0)
		{
			return false;
		}
		if(amount>balance)
		{
			return false;
		}
		balance -=amount;
		return true;
	}
	public static void swtAnnualInterestValue(double annuaInterestValue)
	{
		BankAccount.annualInterestValue=annualInterestValue;
	}
}
