package lesson12.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatBot extends ServerSocket {
	
	/**
	 *	Per cdo klient do te ruhet komunikimi,
	 *  duke perdorur si identifikues emrin 
	 *  (key ne map eshte emri i klientit)
	 *  dhe ne liste te gjithe mesazhet e shkembyer. 
	 **/

	private Map<String, List<String>> data;
	
	public ChatBot(int port) throws IOException {
		super(port); 
		data = new HashMap<>();
	}
	
	public void addClient(String clientName) {
		data.put(clientName, new ArrayList<>());
	}
	
	public boolean existsClient(String clientName) {
		return data.containsKey(clientName);
	}
	
	public void addMessage(String clientName,
						   String text) {
		if(!existsClient(clientName)) {
			return;
		}
		data.get(clientName).add(text);
	}
	
	public void saveData() {
		for(String clientName : data.keySet()) {
			saveData(clientName);
		}
	}
	
	public void saveData(String clientName) { 
		try {
			PrintWriter output = 
					new PrintWriter
						(new File(clientName + ".chat"));
			for(String msg : data.get(clientName)) {
				output.println(msg);
			}
			output.close();
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} 
	}

}
