import java.util.*;
public class UpperLowerCasee 
{ public static void main(String []args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter a character: ");
	   String str=sc.next();
	   char ch=str.charAt(0);
	   if(ch>='A'&&ch<='Z')
	   {
		   System.out.println(ch+ " is upper case");
	   }
	   else if(ch>='a'&&ch<='z')
	   {
		   System.out.println(ch+ " is lower case");
	   }
	}

}
