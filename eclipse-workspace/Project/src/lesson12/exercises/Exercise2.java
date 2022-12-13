package lesson12.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Exercise2 {

	/***
	 *	 Krijohet sherbim server qe pranon
	 *   klient dhe ofron per te sherbimet
	 *   e nje makine llogaritese.
	 *   Veprimet do ofrohen sipas nje
	 *   menuje:
	 *   
	 *   	1. Mblidh
	 *   	2. Zbrit
	 *   	3. Shumezo
	 *   	4. Pjesto
	 *   	5. Gjej Mbetjen
	 *   	6. Perfundo
	 *   
	 *   Klienti mbasi merr mesazhin e menuse
	 *   do vendose numrin qe do jete opsioni
	 *   i zgjedhur prej tij.
	 *   Per secilin opsion, serveri i 
	 *   dergon klientit mesazh qe te vendos
	 *   te dhena per dy numra.
	 *   Mbasi merr dy numrat nga klienti serveri
	 *   dergon rezultatin tek klienti dhe i 
	 *   paraqet serish menu.
	 *   Veprohet keshtu deri kur klienti te shtyp 
	 *   6 dhe te perfundoje lidhja.   
	 **/
	
	public static void main(String[] args) {
		
		try {
			
			CalculatorServer server = 
					new CalculatorServer(2);
			
			Socket client = server.accept();
			
			DataInputStream input = 
					new DataInputStream(client.getInputStream());
			
			DataOutputStream output = 
					new DataOutputStream(client.getOutputStream());
			
			String o = "";
			double n1, n2;
			
			while(!o.equals("6")) {
				
				output.writeUTF(server.menu());
				output.flush();
				output.writeUTF("Opsioni: ");
				output.flush();
				
				o = input.readUTF();
				
				switch(o) {
				
					case "1":
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n1 = input.readDouble();
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n2 = input.readDouble();
						output.writeUTF(server.calculateSum(n1, n2));
						output.flush();
						break;
						
					case "2":
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n1 = input.readDouble();
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n2 = input.readDouble();
						output.writeUTF(server.calculateDiff(n1, n2));
						output.flush();
						break;
						
					case "3":
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n1 = input.readDouble();
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n2 = input.readDouble();
						output.writeUTF(server.calculateMul(n1, n2));
						output.flush(); 
						break;
						
					case "4":
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n1 = input.readDouble();
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n2 = input.readDouble();
						output.writeUTF(server.calculateRap(n1, n2));
						output.flush();
						break;
						
					case "5":
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n1 = input.readDouble();
						output.writeUTF("Vendos nje numer: ");
						output.flush();
						n2 = input.readDouble();
						output.writeUTF(server.calculateRem(n1, n2));
						output.flush();
						break;
						
					case "6":
						output.writeUTF("Mirupafshim!");
						output.flush();
						break;
						
					default:
						output.writeUTF("Perzgjedhja eshte e gabuar!");
						output.flush();
						
				}
			}
			
			input.close();
			output.close();
			client.close();
			server.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
