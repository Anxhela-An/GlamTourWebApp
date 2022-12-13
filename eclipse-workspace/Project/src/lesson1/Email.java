package lesson1;

import java.util.ArrayList;

public class Email {

	/**
	 * Klasa Email do sherbeje per te 
	 * krijuar objekte per email.
	 * Email-et qe do perdoren ne sistemin
	 * tone duhet me patjeter te jene unik.
	 * Nese tentohet te krijohet dy here
	 * i njejti email (dmth dy objekte me
	 * te njejten permbajtje), objekti i dyte
	 * do krijohet duke shtuar nje numer
	 * me vlere nje njesi me te madhe.
	 * Psh:
	 * 		nese ekziston denisballa@tiranait.com
	 * 		dhe tentohet te krijohet serish, do
	 * 		krijohet si denisballa1@tiranait.com
	 * 		apo nqs tentohet serish, do krijohet
	 * 		si denisballa2@tiranait.com ose
	 * 		si denisballa11@tiranait.com.
	 * 
	 * Theksojme qe cdo Email formohet nga
	 * pjesa lokale (denisballa) dhe pjesa e
	 * domain (tiranait.com).
	 * Pjesa lokal-e dhe pjesa e domain-it
	 * jane te pandryshueshme ne vazhdim, dmth
	 * qe pasi te krijohet objekti, informacionin
	 * do e kete te njejte deri ne fund.
	 * Local dhe Domain jane info te pandryshueshme.
	 **/
	
	private String local, domain;
	private static ArrayList<Email> emails = 
						new ArrayList<Email>();
	
	public String getLocal() {
		return local;
	}
	//getLocal
	
	public String getDomain() {
		return domain;
	}
	//getDomain
	
	/***
	 * Nese ne nje klase nuk krijohet constructor
	 * ath, ekziston nje konstruktor i paracaktuar
	 * i cili, nuk ka asnje parameter, dhe nuk
	 * ben asnje veprim, ne kuptimin qe atributeve
	 * nuk ju vendos vlera. Atributet ne raste te 
	 * tille ruajne vleren e paracaktuar te tyre.
	 * Nese ne krijojme konstruktor, ai i paracaktuari
	 * nuk ekziston me. Nese eshte i nevojshem ath
	 * ne duhet ta zhvillojme vete.
	 * 
	 * Firma e metodes (method signature) formohet
	 * nga emri i metodes bashkangjitur me tipet
	 * e variablave ne listen e saj te parametrave.
	 * 
	 * Firma e metodes sherben si identifikuese e 
	 * saj ne nje klase. Eshte e pamundur qe ne 
	 * nje klase dy metoda te ndryshme te kene
	 * te njejten firme.
	 * 
	 * int getA()				getA
	 * int getA(int a)			getAint
	 * int getA(int a, int b)	getAintint
	 * 
	 * Meqenese konstruktoret jane metoda, dhe
	 * meqenese metodat me te enjten emer mund
	 * te krijohen ne te njejten klase, arrijme
	 * ne konkluzionin qe ne nje klase mund
	 * te krijojme shume konstruktore.
	 * Te gjithe konstruktoret kane lista parametrash
	 * te ndryshme.
	 * 
	 * Sa konstruktore duhet te krijoj ne nje klase?
	 * Si ta kuptoj?
	 * 
	 * Gjithcka varet nga rregullat e sjelljes qe ka 
	 * klasa. 
	 * Medoemos ne konstruktor duhet te marrin vlera
	 * te gjithe ato atribute te cilet nuk kan metoda
	 * set.
	 * Nese atributi nuk ka metode set, pas krijimit 
	 * te objektit vlera e tij nuk mund te ndryshohet.
	 * Nese ne konstruktor nuk i eshte vendosur vlere
	 * atehere gjithmone do mbetet ne perdorim vetem
	 * vlera default. Rrjedhimisht atributi eshte
	 * i pavlefshem.
	 * Nuk eshte ide e mire qe te lesh ne perdorim
	 * vleren default qe ka tipi.
	 * Ne konstruktor, duhet me patjeter te japesh
	 * vlere fillestare per cdo atribut qe nuk kuptim
	 * te kete vleren default te mbajtur shenim.
	 * Per shembull, nese nje rrethi i vendosim vleren 0
	 * per rrezen a ka kuptim? Jo.
	 * 
	 * Ne kete klase, minimalisht duhet te krijoj 
	 * nje konstruktor qe vendos vlera te vlefshme
	 * per te dy atributet.
	 * 
	 * 
	 * */
	
	/***
	 * denisballa, tiranait.com
	 * */
	//public Email(String initialLocalValue, 
	//		 String initialDomainValue) { 
	//	this(initialLocalValue + "@" + 
	//			initialDomainValue);
	public Email(String local, String domain) { 
			this(local + "@" + domain);
		/**
		 * rreshti i mesiperm therret konstruktorin
		 * tjeter te klases, ate qe merr si argument
		 * nje string
		 * Instruksioni this kur perdoret
		 * per te therritur nje konstruktor tjeter
		 * duhet me patjeter te perdoret si 
		 * instruksion i pare i koduar brenda konstruktorit
		 * */
		//local = initialLocalValue;	//denisballa
		//domain = initialDomainValue;	//tiranait.com
		//while(exists(local, domain)) { 
		//	local = getString(local) + 
		//			(getNumber(local) + 1);
		//}
		//emails.add(this);
		/**
		 * this -> fjale kyce
		 * 		   identifikon objektin e klases
		 * 					   objektin qe po perdoret
		 * 					   ne kete rast, objektin
		 * 					   qe sapo u krijua nga konstruktori
		 * 
		 * 		   	sherben gjithashtu per te referuar antaret
		 * 		    e objektit, ato jo static
		 * 			this.emerAntari
		 * 			this.local
		 * 
		 * 		    sherben per te referuar perdorimin e nje konstruktori
		 * 			tjeter te klases gjate zhvillimit te
		 * 			konstruktorit aktual
		 * */
		
	}
	//EmailStringString
	
	private String getString(String str) {
		int index = str.length() - 1;
		while(index >= 0 && 
			  Character.isDigit(str.charAt(index))) {
			index--;
		}
		index++; 
		return str.substring(0, index);
	}

	private static int getNumber(String str) {
		int index = str.length() - 1;
		while(index >= 0 && 
			  Character.isDigit(str.charAt(index))) {
			index--;
		}
		index++;
		if(index != str.length()) {
			return Integer.parseInt(str.substring(index));
		}
		return 0;
	}

	private static boolean exists(String local,
								  String domain) {
		/***
		for (int i = 0; i < emails.size(); i++) {
			if(emails.get(i).getLocal().equals(local) &&
			   emails.get(i).getDomain().equals(domain)) {
				return true;
			}
		}
		 * */
		for (Email email : emails) {
			if(email.getLocal().equals(local) &&
			   email.getDomain().equals(domain)) {
				return true;
			}
		}
		return false;
	}
	public Email(String email) {
		int index = email.indexOf("@");
		local = email.substring(0, index);
		domain = email.substring(index + 1);
		while(exists(local, domain)) { 
			local = getString(local) + (getNumber(local) + 1);
		}
		emails.add(this);
	}
	//EmailString
	
	public String getEmail() {
		return local + "@" + domain;
	}
	
}













