public class NumerIPlote 
{ 
	private int value;            //pika 1

    public NumerIPlote(int value) //pika 2
    {
	 this.value=value;   
    }
    public NumerIPlote(NumerIPlote n)   //pika 3
    {  this.value=n.getValue();
	 
    }
   public int getValue()               //pika 4
    {
	   return value;
    } 
 public boolean isOdd()                //pika 5       
 { if(value%2!=0)
    {
	   return true;
    }
      return false; 
  }
public boolean isEven()
{
	 if(!isOdd(value))
	 {
		 return true;
	 }
	 return false;
}
public boolean isPrime()
 {   if((value==0)||(value==1))
      { return false;
	  
      }
      for(int i=2;i<=Math.sqrt(value);i++)
      {
   	   if(value%i==0)
   	   { return false;
   		   
   	   }
      }
	
	 return true;
 }
 public static boolean isOdd(int n)       //pika 6
  { if(n%2!=0)
    {
	 return true;
    }
    return false; 
    }
 public static boolean isEven(int n)
 {
	 if(!isOdd(n))
	 {
		 return true;
	 }
	 return false;
 }
 public static boolean isPrime(int n)
  {   if((n==0)||(n==1))
       { return false;
	  
       }
       for(int i=2;i<Math.sqrt(n);i++)
       {
    	   if(n%i==0)
    	   { return false;
    		   
    	   }
       }
	
	 return true;
  }
 public static boolean isOddN(NumerIPlote n)  //pika 7
 { if(n.getValue()%2!=0)
   {
	 return true;
   }
   return false; 
   }
public static boolean isEven(NumerIPlote n)
{
	 if(!isOdd(n.getValue()))
	 {
		 return true;
	 }
	 return false;
}
public static boolean isPrime(NumerIPlote n)
 {   if((n.getValue()==0)||(n.getValue()==1))
      { return false;
	  
      }
      for(int i=2;i<Math.sqrt(n.getValue());i++)
      {
   	   if(n.getValue()%i==0)
   	   { return false;
   		   
   	   }
      }
	
	 return true;
 }
 
 public boolean sameValue(int n)    //pika 8
 {
	 if( n==value)
	 {
		 return true;
	 }
	 return false;
 }
 public boolean sameValue(NumerIPlote n)
 {   if(this.value==n.getValue())
 {
	 return true;
 }
 
	 return false;
 }
 
 public static int convertInt(final char[] arr) {    //pika 9
		int result = 0;
		int length = arr.length - 1;

		for (int i = 0; i <= length; i++)
		{
			int digit = arr[i] - '0';
			result *= 10;
			result += digit;
		}
		return result;
	}
 public static int convertInt(String ns)           //pika 10
 {
	 int n = Integer.parseInt(ns);
	 return n;
 }
 
 
 
}
 