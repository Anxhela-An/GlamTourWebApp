package lesson7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Shembull1 
{  
	public static void main(String[]args) 
	{
		try(FileOutputStream outputBinarNeSkedar = new FileOutputStream("info.skedarBinar"))
				{
			        for(int i=1; i<=10;i++)
			        {
			        	outputBinarNeSkedar.write(i);
			        }
					
				} catch (FileNotFoundException e) {
					System.out.println("Krijimi i skedarit deshtoi!");
					
				} catch (IOException e) {
					System.out.println("Shkrimi i te dhenave ne skedar deshtoi!");
				}
		try(FileInputStream inputBinarNgaSkedari = new FileInputStream("info.skedarBinar"))
		{
			int nr;
			System.out.println("Permbajtja e skedarit eshte:");
			while((nr=inputBinarNgaSkedari.read())!=-1)
			{ System.out.print(nr+" ");
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Leximi i skedarit deshtoi!");
		} catch (IOException e) {
			System.out.println("Leximi i te dhenave ne skedar deshtoi!");
		} 
		
		
	}

}
