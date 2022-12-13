package lesson7.exercises;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Exercise3 
{ 
	public static void Metoda(int[]a)
	{ Random r = new Random();
	  
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=r.nextInt();
	  }
		
	}
	public static void main(String []args) 
	{   Scanner sc = new Scanner(System.in);
		int []a = new int[100];
		Metoda(a);
		System.out.println("Vendos nje numer int per indeksin:");
		try {
			  int n1 = sc.nextInt();
			  System.out.println("Elementi i vektorit ne indeksin:"+n1+" eshte: "+ a[n1]);
		}
		catch(IndexOutOfBoundsException ex)
		{
		  System.out.println("Keni tejkaluar madhesine e vektorit!");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Numri nuk eshte i sakte!");
		} 
		catch(InputMismatchException em)
		{
			System.out.println("Nuk eshte numer i plote!");
		}
		
	}

}
