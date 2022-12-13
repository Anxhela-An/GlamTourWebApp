package lesson12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import lesson1.Util;

public class Example3 {
	  
	public static void main(String[] args) {
		
		try {
			 
			Socket client = new Socket("localhost", 1);
			
			System.out.println("U lidhem me server.");
			
			DataInputStream input = 
					new DataInputStream
						(client.getInputStream());
			
			DataOutputStream output = 
					new DataOutputStream
						(client.getOutputStream());
			
			System.out.print("Vendos tekst: ");
			String text = Util.getSystemInput().nextLine();
			 
			output.writeUTF(text);
			
			output.flush();
			
			System.out.println("Serveri thote: " + input.readUTF());
			
			input.close();
			output.close();
			
			client.close();
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
