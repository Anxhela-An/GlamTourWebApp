package lesson12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Example2 {
	
	/**
	 *	Sherbimi i perdorur nga EmailSender
	 *  ofrohet nga nje server realisht.
	 *  Atje eshte krijuar ky sherbim.
	 *  Si mund te krijojme ne sherbime ne 
	 *  nje server?
	 *  Infrastruktura Java qe suporton krijimin
	 *  e programeve qe lidhen midis tyre bazohet
	 *  ne socket. Cfare eshte nje socket?
	 *  Nje socket eshte nje objekt qe mundeson lidhje
	 *  midis dy makinash virtuale qe jane duke punuar.
	 *  Keto makina mund te jene ne te njejten pajisje
	 *  ose ne pajisje te ndryshme por te lidhura me
	 *  njera-tjetren ne network.
	 *  Dy jane klasat kryesore qe mundesojne 
	 *  krijimin e socket:
	 *  
	 *  	1. ServerSocket		krijon socket qe ofron sherbim
	 *  	2. Socket			krijon socket qe merr sherbim
	 *  
	 *  Shembulli ne vijim, paraqet nje sherbim minimal
	 *  ku do lexohet nga server nje mesazh qe dergohet
	 *  nga klienti dhe do i kthehet klientit si pergjigje
	 *  gjatesia e mesazhit.
	 *  
	 **/
	
	public static void main(String[] args) {
		
		try {
			
			ServerSocket server = new ServerSocket(1); //server ne porten 1
			
			System.out.println("Serveri eshte ne pune.");
			
			Socket client = server.accept();
			
			System.out.println("U lidhem me klient.");
			
			DataInputStream input = 
					new DataInputStream
						(client.getInputStream());
			
			DataOutputStream output = 
					new DataOutputStream
						(client.getOutputStream());
			
			String text = input.readUTF();
			
			System.out.println("Klienti thote: " + text);
			
			output.writeUTF("Gjatesia e '" + text + 
					"' eshte " + text.length() + ".");
			output.flush();
			
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
