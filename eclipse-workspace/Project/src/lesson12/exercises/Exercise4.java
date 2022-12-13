package lesson12.exercises;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.GregorianCalendar;

import lesson1.Util;

public class Exercise4 {

	/***
	 *	 Krijohet sherbim server qe pranon
	 *   shume klient ne te njejten kohe.
	 *   Pra serveri eshte multi-tasking.
	 *   Serveri te beje komunikim chat
	 *   me klientin. 
	 *   Serveri te ruaje ne file te gjithe
	 *   biseden e bere, sebashku me oren,
	 *   sipas formatit:
	 *   
	 *     	22 qershor, 2021	19:23:17	u krijua lidhje midis server dhe klientit te quajtur "Klaus"
	 *		22 qershor, 2021	19:23:20	Klaus: Pershendetje!
	 *		22 qershor, 2021	19:23:24	Server: Pershendetje Klaus!
	 *		22 qershor, 2021	19:23:29	Server: Si mund te te ndihmoj?
	 *
	 *	Qe te dy programet do duhet te menaxhohen
	 *  nga perdorues njerezor. Dmth edhe mesazhet
	 *  e Klaus edhe ato te programit te jene te marra
	 *  si inpute nga tastiera.
	 *	
	 **/
	
	public static void main(String[] args) {
		try {
			
			ChatBot server = new ChatBot(3);
			System.out.println("Serveri eshte gati!");
			/**
			 *	te pranoje klient
			 *	kur te pranoje klient qe ne fillim te kerkoje emrin e tij
			 *	madje persakohe emri ekziston mund te kerkoje emer tjeter tek klienti
			 *  Me tej, biseda vijon deri kur te shtypet nga klienti nje fraze qe i udhezohet
			 *  si fraze per perfundim bisede.
			 *  
			 **/
			
			Thread thread = new Thread() {
				@Override
				public void run() {
					
					try {
						
						while(true) {

							
							Socket client = server.accept();
							
							String clientTimeCon = getTime();
							
							DataInputStream input = 
									new DataInputStream(client.getInputStream());
							DataOutputStream output = 
									new DataOutputStream(client.getOutputStream());
							
							output.writeUTF("Mire se erdhe! Si quhesh? - ");
							output.flush();
							
							String welcomeTime = getTime();
							String clientName = input.readUTF();
							
							server.addClient(clientName);
							server.addMessage(clientName, 
									clientTimeCon + " \t\tu krijua lidhje midis "
											+ "server dhe klientit te quajtur " + 
											clientName);
							server.addMessage(clientName, 
									welcomeTime + " \t\tServer: Mire se erdhe! "
											+ "Si quhesh? - ");
							server.addMessage(clientName, 
									getTime() + " \t\t" + clientName + ": " + clientName);
							
							output.writeUTF("Pershendetje " + clientName + 
									"! Si mund te te ndihmoj? ");
							output.flush();
							
							server.addMessage(clientName, 
									getTime() + " \t\tServer: Pershendetje " +
									 clientName + "! Si mund te te ndihmoj? ");
							
							while(true) {
								String text = input.readUTF();
								server.addMessage(clientName, 
										getTime() + " \t\t" + 
										clientName + ": " + text);
								System.out.println(clientName + ": " + text);
								System.out.print("Pergjigja per klientin (vendos stop nese do perfundosh): ");
								text = Util.getSystemInput().nextLine();
								while(text.equals("")) {
									text = Util.getSystemInput().nextLine();
								}
								output.writeUTF(text);
								output.flush();
								if(text.equalsIgnoreCase("stop")) {
									break;
								}
								server.addMessage(clientName, 
										getTime() + " \t\tServer: " + text);
							}
							client.close();
							server.saveData(clientName);
						
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			};
			
			thread.start();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTime() {
		return Util.getGregorianCalendarAsDateAndTimeString(new GregorianCalendar());
	}
	
}
