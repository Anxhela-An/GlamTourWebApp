
public class TestNumerIPlote 
{   public static void main(String []args)
	{
	
	  NumerIPlote nr1 = new NumerIPlote(8);
	  System.out.println(nr1.getValue());
	  //per metodat statike
	  System.out.println("Number 5 is odd :"+ NumerIPlote.isOdd(5));
	  System.out.println("Number 5 is even: "+ NumerIPlote.isEven(5));
	  System.out.println("Number 5 is prime: "+ NumerIPlote.isPrime(5));
      //per metodat jostatike
	  System.out.println("Number 8 is odd :"+ nr1.isOdd());
	  System.out.println("Number 8 is even: "+ nr1.isEven());
	  System.out.println("Number 8 is prime: "+ nr1.isPrime());
	  
	  System.out.println("Is the argument value same as object value? "+nr1.sameValue(8));
	  
   	  char []a = {'1','2','3','4','5'};
   	  int x = NumerIPlote.convertInt(a);
   	  System.out.println("Value after convertion from char to int: "+x);
   	  
   	  String s ="1001";
   	  int y = NumerIPlote.convertInt(s);
   	  System.out.println("Value after convertion from String to int:" + y);
	  
   	  NumerIPlote nr2 = new NumerIPlote(nr1);
   	  //objektet qe jepen si argument nuk kane metoda jostatike
   	  System.out.println("Number 8 is odd :"+ nr2.isOdd());
	  System.out.println("Number 8 is even: "+ nr2.isEven());
	  System.out.println("Number 8 is prime: "+ nr2.isPrime());
	  
	  System.out.println("Is the argument value same as object value? "+nr2.sameValue(20));
	  
	
	}

}
