package lesson12.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import lesson1.Util;

public class Exercise5 {

	/**
	 *	Klienti i ushtrimit 4 
	 **/
	
	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("localhost", 3);
			DataInputStream input = 
					new DataInputStream(client.getInputStream());
			DataOutputStream output = 
					new DataOutputStream(client.getOutputStream());
			String text = input.readUTF();
			System.out.println(text);
			text = Util.getSystemInput().nextLine();
			while(text.equals("")) {
				text = Util.getSystemInput().nextLine();
			}
			output.writeUTF(text);
			output.flush();
			text = input.readUTF();
			while(!text.equalsIgnoreCase("stop")) { 
				System.out.println(text);
				text = Util.getSystemInput().nextLine();
				while(text.equals("")) {
					text = Util.getSystemInput().nextLine();
				} 
				output.writeUTF(text);
				output.flush();
				text = input.readUTF();
			}
			//input.close();
			//output.close();
			//client.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
