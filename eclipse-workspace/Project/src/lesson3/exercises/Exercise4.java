package lesson3.exercises;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import lesson2.Person;
import lesson3.Client;
import lesson3.Employee;
import lesson3.SecurityGuard;

public class Exercise4 {
	
	/**
	 * Ne nje liste me tipin person
	 * kemi ruajtur klientet dhe punonjesit 
	 * (te gjithe llojet e punonjesve).
	 * */

	public static void main(String[] args) {
		
		ArrayList<Person> list = getData();
		
		///gjej numrin e punonjesve
		System.out.println(getNumberOfEmployees(list));
	}

	private static int getNumberOfEmployees
				(ArrayList<Person> list) {
		int cnt = 0;
		for(Person p : list) {
			if(p instanceof Employee) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static ArrayList<Client> getClients
							(ArrayList<Person> list){
		ArrayList<Client> result = 
				new ArrayList<Client>();
		for(Person p : list) {
			if(p instanceof Client) {
				result.add((Client) p);
			}
		}
		return result;
	}
	
	public static Client get(ArrayList<Person> list) {
		Client result = null;
		ArrayList<Client> clients = getClients(list);
		if(clients.size() > 0) {
			result = clients.get(0);
			for(Client c : clients) {
				if(c.getBirthdateInMillis() < 
				   result.getBirthdateInMillis()) {
					result = c;
				}
			}
		}
		return result;
	}
	
	public static ArrayList<Client> getClients
							(ArrayList<Person> list,
							 int numberOfPurchases){
		ArrayList<Client> result = 
				new ArrayList<Client>();
		for(Person p : list) {
			if(p instanceof Client) {
				Client c = (Client)p;
				if(c.getPurchasesSize() >= numberOfPurchases) {
					result.add(c);
				}
			}
		}
		return result;
	}
	
	private static ArrayList<Person> getData() {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Employee(new GregorianCalendar()));
		list.add(new SecurityGuard(null));
		list.add(new SecurityGuard(null));
		list.add(new Client(null));
		list.add(new Client(null));
		return list;
	}
	
}