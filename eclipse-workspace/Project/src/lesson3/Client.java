package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import lesson1.Util;
import lesson2.Address;
import lesson2.Person;

public class Client extends Person {

	/**
	 * date regjistrimi		e pandryshueshme
	 * liste blerjesh		mund te shtosh blerje
	 * 						nuk mund te fshish
	 * 
	 *  situate diskutimi per konstruktoret
	 *  qe krijohen ne nje nenklase
	 *  
	 *  Secili konstruktor me patjeter referon
	 *  te nje konstruktor i superklases.		
	 * 	Marreveshjet qe bejme per menyren e ndertimit
	 * te konstruktorit tek nenklasa, varen nga
	 * permbajtja e klasave, nga qellimet, por edhe
	 * nga parimet e mira te punes.
	 * Sigurohemi qe cdo atribut merr vleren e pershtatur
	 * ne varesi te konstruktorit te perdorur.
	 * 
	 * Kur bejme nje nenklse, qe ska atribute te sajat,
	 * eshte e zakonshme te krijohen te njejtet konstruktore
	 * si ato te superklases (sigurisht qe ti mund te
	 * kesh edhe rast qe te sqarohet se ke te mbash e
	 * ke jo, por ne rast se jo, beji te gjithe ...
	 * mund ti gjenerosh njesoj si ato te superklases).
	 * 
	 * Kur bejme nje nenklase, qe ka atributet e saj,
	 * nese ska asnje kusht kufizues, ath ndertojme
	 * konstruktor si ato te superklases, duke
	 * shtuar atributet e reja tek to, ose duke 
	 * gjetur menyre alternative per te dhene
	 * vlere nepermjet vlerave default.
	 * */
	
	private GregorianCalendar registrationDate;
	private ArrayList<Purchase> purchases;

	public Client(GregorianCalendar birthdate) {
		this(null, null, birthdate, OTHER_GENDER, 
				null, new GregorianCalendar(), 
				new ArrayList<Purchase>()); 
	}
	
	public Client(String surname,
				  GregorianCalendar birthdate) {
		this(null, surname, birthdate, OTHER_GENDER, 
				null, new GregorianCalendar(), 
				new ArrayList<Purchase>());
	}

	public Client(String surname, 
				  GregorianCalendar birthdate, 
				  int gender) {
		this(null, surname, birthdate, gender, 
				null, new GregorianCalendar(), 
				new ArrayList<Purchase>());
	}

	public Client(String name, 
				  String surname, 
				  GregorianCalendar birthdate,
				  int gender) {
		this(name, surname, birthdate, gender, 
				null, new GregorianCalendar(), 
				new ArrayList<Purchase>());
	}

	public Client(String name, 
				  String surname, 
				  GregorianCalendar birthdate, 
				  int gender, 
				  Address address) {
		this(name, surname, birthdate, gender, 
				address, new GregorianCalendar(), 
				new ArrayList<Purchase>());
	}
	
	public Client(String name, 
				  String surname, 
				  GregorianCalendar birthdate, 
				  int gender, 
				  Address address,
				  GregorianCalendar registrationDate) { 
		this(name, surname, birthdate, gender, 
				address, registrationDate, 
				new ArrayList<Purchase>());
	} 

	public Client(String name, 
				  String surname, 
				  GregorianCalendar birthdate, 
				  int gender, 
				  Address address, 
				  GregorianCalendar registrationDate,
				  ArrayList<Purchase> purchases) {
		super(name, surname, birthdate, gender, address);
		if(registrationDate == null) {
			//ndalo krijimin e objektit
			registrationDate = new GregorianCalendar();
		}
		if(purchases == null) {
			//ndalo krijimin e objektit
			purchases = new ArrayList<Purchase>();
		}
		this.registrationDate = new GregorianCalendar();
		this.registrationDate.setTimeInMillis(registrationDate.getTimeInMillis());
		this.purchases = new ArrayList<Purchase>();
		for(Purchase p : purchases) {
			this.purchases.add(p);
		}
	}

	public void addPurchase(Purchase p) {
		if(p != null && !purchases.contains(p)) {
			purchases.add(p);
		}
	}
	
	public Purchase getPurchase(int index) {
		if(index < 0 || index > getPurchasesSize() - 1) {
			return null;
		}
		return purchases.get(index);
	}

	public int getPurchasesSize() { 
		return purchases.size();
	}
	
	public long getRegistrationDateInMillis() {
		return registrationDate.getTimeInMillis();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((purchases == null) ? 0 : purchases.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Client)) {
			return false;
		}
		Client other = (Client) obj;
		if (purchases == null) {
			if (other.purchases != null) {
				return false;
			}
		} else if (!purchases.equals(other.purchases)) {
			return false;
		}
		if (registrationDate == null) {
			if (other.registrationDate != null) {
				return false;
			}
		} else if (!registrationDate.equals(other.registrationDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "lesson3.Client ["
				+ "registrationDate=" + 
						Util.getGregorianCalendarAsDateAndTimeString(registrationDate) + 
				", purchases=" + purchases + 
				", toString()="	+ super.toString() + "]";
	}
	
}