package lesson2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import lesson1.Email;
import lesson1.Id;
import lesson1.Util;
import lesson4.Duration;
import lesson4.Identifiable;

public class Person extends Object 
				implements Identifiable, Duration {
	
	/**
	 * Id				nje vlere e gjeneruar
	 * 					nga sistemi
	 * 					id duhet te jete vlere e pandryshueshme
	 * Name
	 * Surname
	 * Gender			Male
	 * 					Female
	 * 					Other
	 * Birthdate		objekt te klases GregorianCalendar
	 * 					datelindje duhet te jete vlere e pandryshueshme
	 * Address
	 * Phone Numbers	687'878'787
	 * Emails			
	 * */
	
	public static final byte MALE_GENDER = 1,
						     FEMALE_GENDER = 2,
						     OTHER_GENDER = 3;
	
	private Id id;
	/**
	 * Marredhenia midis klases Person dhe klases Id eshte kompozimi.
	 * */
	private String name, surname;
	private byte gender;
	private GregorianCalendar birthdate;
	private GregorianCalendar deathdate;
	private Address address;						///grumbullimi
	private ArrayList<PhoneNumber> phoneNumbers;	///kompozimi
	private ArrayList<Email> emails;				///kompozimi

	public Person(GregorianCalendar birthdate) {
		this(null, null, null, OTHER_GENDER, null);
	}
	
	public Person(String surname, 
			      GregorianCalendar birthdate) {
		this(null, surname, null, OTHER_GENDER, null);
	}

	public Person(String surname, 
			      GregorianCalendar birthdate,
			      int gender) {
		this(null, surname, null, gender, null);
	}

	public Person(String name, 
			      String surname, 
			      GregorianCalendar birthdate,
			      int gender) {
		this(name, surname, birthdate, gender, null);
	}
	
	public Person(String name, 
				  String surname, 
				  GregorianCalendar birthdate,
				  int gender,
				  Address address) {
		if(birthdate == null) {
			//supozohet sikur eshte nje person
			//qe sapo lindi
			birthdate = new GregorianCalendar();
		}
		if(gender < MALE_GENDER || gender > OTHER_GENDER) {
			gender = OTHER_GENDER;
		}
		id = new Id();
		this.name = name;
		this.surname = surname;
		this.gender = (byte) gender;
		this.birthdate = new GregorianCalendar();
		this.birthdate.setTimeInMillis
				(birthdate.getTimeInMillis());
		/**
		 * Si ka mundesi qe datelindja te jete
		 * e ndryshueshme ne kete moment?
		 * Ka nje skenar te tille. A mund ta gjesh?
		 * */
		this.address = address;
		this.phoneNumbers = new ArrayList<PhoneNumber>();
		this.emails = new ArrayList<Email>();
	}
	
	/**
	 * Atributet qe sduhet te ndryshojne,
	 * duhet te jene private, sduhet te
	 * kene metode set, si dhe metodat 
	 * get te tyre te mos japin mundesi
	 * per perdorim te metodave set.
	 * */
	
	public final Id getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public byte getGender() {
		return gender;
	}
	
	public final long getBirthdateInMillis() {
		return birthdate.getTimeInMillis();
	}
	
	public final GregorianCalendar getBirthdateCopy() {
		GregorianCalendar bd = new GregorianCalendar();
		bd.setTimeInMillis(birthdate.getTimeInMillis());
		return bd;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Permbajtja e phoneNumbers dhe emails duhet te jete
	 * sa me shume e mbrojtur.
	 * Kujdes, ne lista mundesohen veprime te tille si
	 * shtimi apo heqja e elementeve.
	 * Do ishte e papelqyeshme qe nje person-i ti shtohej
	 * vlera null per ndonjeren nga keto te dhena.
	 * Kujdes, nuk te lejohet te ndertosh metoden
	 * setPhoneNumbers, sepse nje zhvillues tjeter 
	 * e perdor kete metode duke i dhene si argument
	 * nje liste ku mund te kete permbajtje me vlere null, 
	 * apo edhe disa here te ruajtur te njejtin objekt.
	 * E njejta gje mund te arrihet edhe nepermjet ndertimit
	 * te metodes getPhoneNumbers, sepse kjo metode te
	 * jep mundesi per te perdorur metodat add apo addAll.
	 * Nepermejt tyre do mund te shtoje null, apo disa here
	 * te njejtin objekt.
	 * E njejta histori per email.
	 * Ka kuptim qe dikush te mos kete email apo phoneNumber.
	 * Ka kuptim qe me kalimin e kohes te kete dhe te mos kete.
	 * */


	public void addPhoneNumber(PhoneNumber phone) {
		if(phone == null || exist(phone)) {
			return;
		}
		phoneNumbers.add(phone);
	}

	private boolean exist(PhoneNumber phone) {
		for(PhoneNumber pn : phoneNumbers) {
			if(pn.getPrefix() == phone.getPrefix() &&
			   pn.getOperator() == phone.getOperator() &&
			   pn.getSimNumber() == phone.getSimNumber()) {
				return true;
			}
		}
		return false;
	}
	
	public int getPhoneNumbersSize() {
		return phoneNumbers.size();
	}
	
	public PhoneNumber getPhoneNumber(int index) {
		if(index < 0 || index >= getPhoneNumbersSize()) {
			return null;
		}
		return phoneNumbers.get(index);
	}
	
	public void removePhoneNumber(PhoneNumber phone) {
		for (int i = 0; i < phoneNumbers.size(); i++) {
			if(phoneNumbers.get(i).getPrefix() == phone.getPrefix() &&
			   phoneNumbers.get(i).getOperator() == phone.getOperator() &&
			   phoneNumbers.get(i).getSimNumber() == phone.getSimNumber()) {
				phoneNumbers.remove(i);
				return;
			}
		}
	}
	
	public void addEmail(Email email) {
		if(email == null || exist(email)) {
			return;
		}
		emails.add(email);
	}

	private boolean exist(Email email) {
		for(Email e : emails) {
			if(e.getEmail().equalsIgnoreCase(email.getEmail())) {
				return true;
			}
		}
		return false;
	}
	
	public int getEmailsSize() {
		return emails.size();
	}
	
	public Email getEmail(int index) {
		if(index < 0 || index > getEmailsSize()) {
			return null;
		}
		return emails.get(index);
	}
	
	public void removeEmail(Email email) {
		for (int i = 0; i < emails.size(); i++) {
			if(emails.get(i).getEmail().equalsIgnoreCase(email.getEmail())) {
				emails.remove(i);
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "lesson2.Person [id=" + id + 
				", name=" + name + 
				", surname=" + surname +
				", gender=" + gender + 
				", birthdate=" + Util.getGregorianCalendarAsString(birthdate) + 
				", address=" + address + 
				", phoneNumbers=" + phoneNumbers + 
				", emails=" + emails + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((emails == null) ? 0 : emails.hashCode());
		result = prime * result + gender;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumbers == null) ? 0 : phoneNumbers.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
 
	/***
	 * hashCode eshte metode qe kthen nje numer te plote
	 * si vlere identifikuese e te dhenave qe ruan objekti
	 * i kesaj klase
	 * per objekte me permbajtje te njejte metoda kthen
	 * te njejtin numer
	 * nqs metoda equals kthen true edhe hashCode kthen
	 * te njejtin numer
	 * nqs metoda equals kthen false edhe hashCode kthen
	 * numra te ndryshem 
	 **/
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person)obj;
		if(id == null) {
			if(other.id != null) {
				return false;
			}
		}
		else if(!id.equals(other.id)) {
			return false;
		}
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}
		else if(!name.equals(other.name)) {
			return false;
		}
		if(surname == null) {
			if(other.surname != null) {
				return false;
			}
		}
		else if(!surname.equals(other.surname)) {
			return false;
		}
		if(gender != other.gender) {
			return false;
		}
		if(birthdate == null) {
			if(other.birthdate != null) {
				return false;
			}
		}
		else if(!birthdate.equals(other.birthdate)) {
			return false;
		}
		if(address == null) {
			if(other.address != null) {
				return false;
			}
		}
		else if(!address.equals(other.address)) {
			return false;
		}
		if(phoneNumbers == null) {
			if(other.phoneNumbers != null) {
				return false;
			}
		}
		else if(!phoneNumbers.equals(other.phoneNumbers)) {
			return false;
		}
		if(emails == null) {
			if(other.emails != null) {
				return false;
			}
		}
		else if(!emails.equals(other.emails)) {
			return false;
		}
		return true;
	}
	
	public void die() {
		if(deathdate == null) {
			deathdate = new GregorianCalendar();
		}
	}

	@Override
	public long getStartDateInMillis() { 
		return birthdate.getTimeInMillis();
	}

	@Override
	public long getEndDateInMillis() { 
		return deathdate.getTimeInMillis();
	}
	
}