package lesson12.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import lesson1.Util;

public class Exercise3 {

	/**
	 *	Klienti i ushtrimit 2 
	 **/
	
	public static void main(String[] args) {
		
		try {
			
			Socket client = new Socket("localhost", 2);

			DataInputStream input = 
					new DataInputStream(client.getInputStream());
			
			DataOutputStream output = 
					new DataOutputStream(client.getOutputStream());
			
			String o = "";
			double n1, n2;
			
			while(!o.equals("6")) {
				System.out.println(input.readUTF());
				System.out.println(input.readUTF());
				o = Util.getSystemInput().next();
				output.writeUTF(o);
				output.flush();
				if(o.equals("1") ||
				   o.equals("2")||
				   o.equals("3")||
				   o.equals("4")||
				   o.equals("5")) {
					System.out.println(input.readUTF());
					n1 = Util.getSystemInput().nextDouble();
					output.writeDouble(n1);
					output.flush();
					System.out.println(input.readUTF());
					n2 = Util.getSystemInput().nextDouble();
					output.writeDouble(n2);
					output.flush();
				}
				System.out.println(input.readUTF());
			}
			
			input.close();
			output.close();
			client.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
