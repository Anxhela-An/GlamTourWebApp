import java.util.Scanner;
public class IndeksiTrupor 
{ public static double indeksiMasesTrupore(double gjatesiaNeMetra, double peshaNeKg)
	{
	  if(((gjatesiaNeMetra>0.25)&&(gjatesiaNeMetra<2.8))&&(peshaNeKg>0.15)&&(peshaNeKg<600))
	  {
		  return peshaNeKg/(Math.pow(gjatesiaNeMetra, 2));
	  }
	  
	  
		  return -1;
		  
	 
	}
    public static double peshaMinimaleTrupore(double gjatesiaNeMetra)
    {
    	
		  if((gjatesiaNeMetra>0.25)&&(gjatesiaNeMetra<2.8))
		  {
			  
			  return 18.5*gjatesiaNeMetra*gjatesiaNeMetra;
		  }
		 
		  
			  return -1;
		  
		  
    }
    public static double peshaMaksimaleTrupore(double gjatesiaNeMetra)
    {if((gjatesiaNeMetra>0.25)&&(gjatesiaNeMetra<2.8))
	  {
		  
		  return 24.9*gjatesiaNeMetra*gjatesiaNeMetra;
	  }
	  
		  return -1;
	  
     	
    	
    }
			 
public static void main(String []args)
{
Scanner input = new Scanner(System.in);
double peshaNeKg, gjatesiaNeMetra;
System.out.println("Vendosni nje numer per peshen:");
peshaNeKg = input.nextDouble();
System.out.println("Vendosni nje numer per gjatesine ne metra:");
gjatesiaNeMetra = input.nextDouble();
input.close();
if(indeksiMasesTrupore(gjatesiaNeMetra,peshaNeKg)<18.5)
{  System.out.println("Pesha juaj eshte nen peshen normale trupore!");
System.out.print("Pesha juaj normale per gjatesine "+gjatesiaNeMetra+" m eshte: "+18.5*gjatesiaNeMetra*gjatesiaNeMetra);
System.out.println("- "+24.9*gjatesiaNeMetra*gjatesiaNeMetra + " kg.");
	
}
else if(indeksiMasesTrupore(gjatesiaNeMetra, peshaNeKg)<25)
{ System.out.println("Pesha juaj eshte ne peshen normale trupore!");
	
}
else if(indeksiMasesTrupore(gjatesiaNeMetra, peshaNeKg)<30)
{System.out.println("Pesha juaj eshte mbi peshen normale trupore!");
System.out.print("Pesha juaj normale per gjatesine "+gjatesiaNeMetra+" m eshte: "+18.5*gjatesiaNeMetra*gjatesiaNeMetra);
System.out.println("- "+24.9*gjatesiaNeMetra*gjatesiaNeMetra + " kg.");
	
}
else if((indeksiMasesTrupore(gjatesiaNeMetra, peshaNeKg)>30))
		{System.out.println("Pesha juaj eshte mbi peshen normale trupore dhe ju jeni obez!");
		  System.out.print("Pesha juaj normale per gjatesine "+gjatesiaNeMetra+" m eshte: "+18.5*gjatesiaNeMetra*gjatesiaNeMetra);
		  System.out.println("- "+24.9*gjatesiaNeMetra*gjatesiaNeMetra + " kg.");
	       
		}
else { 
	   System.out.println("Te dhena jo te sakta!");
}
}
}