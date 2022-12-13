package lesson7;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Shembull 
{   public static void main(String []args)
	{
	   Path pathiSkedarit = Paths.get("C:\\Users\\Anxhela\\info.txt");
       File skedar = new File(pathiSkedarit.toString()); 
       try
       { Scanner inputNgaSkedari = new Scanner(skedar);
         while(inputNgaSkedari.hasNext())
         {
        	 String emri=inputNgaSkedari.next();
        	 String mbiemri = inputNgaSkedari.next();
        	 int mosha = inputNgaSkedari.nextInt();
        	 System.out.println(emri+""+mbiemri+""+mosha);
         }
    	   inputNgaSkedari.close();
    	   
       }
       catch(FileNotFoundException e)
       {
    	   System.out.println("Leximi i skedarit deshtoi!");
       }
	}

}
