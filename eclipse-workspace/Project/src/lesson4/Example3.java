package lesson4;

import lesson2.Address;
import lesson2.Person;
import lesson3.AuthorityCertificate;

public class Example3 {

	/**
	 *  	1. trashegimi shumefishe
	 *  	2. te besh projekt te ndare ne
	 *  	   disa ekipe dhe gjerat mes tyre
	 *  	   te shkojne per mrekulli
	 *  
	 *  Interface eshte nje strukture e cila
	 *  permban metoda abstrakte, te cilat
	 *  listohen aty me qellim qe te tregojne
	 *  se kush jane gjerat qe duhen bere.
	 *  
	 *  Trashegimia shumefishe mundesohet
	 *  nepermjet interface-ve, sepse keto
	 *  struktura zhvillohen nepermjet klasave
	 *  te caktuara. Nje klase mund te zhvilloje
	 *  njekohesisht shume interface.
	 *  Cdo interface i zhvilluar ne nje klase
	 *  automatikisht shikohet si superklase
	 *  e saj.
	 *  
	 *  Interfacet mund te mos kene asnje metode
	 *  te listuar.
	 *  Keto interface jane interface per te
	 *  shenuar cilesine, por per ate cilesi
	 *  mund te mos kete te dhena te nevojshme.
	 *  Quhen marker interface.
	 *  
	 *  Interfacet qe kane vetem nje metode,
	 *  njihen ndryshe si interface 
	 *  funksionaliteti.
	 *  
	 *  Interfacet mund te zgjerojne njeri-tjetrin.
	 *  Trashegimia e interfaceve eshte shumefishe.
	 *  
	 *  Interfacet mund te permbajne edhe metoda
	 *  te zhvilluara:
	 *  
	 *  	1. default	->  metoda qe kane
	 *  					lidhje me te dhenat
	 *  					e objektit
	 *  					bejne nje detyre te paracaktuar
	 *  					qe mund te ndryshohet duke
	 *  					e bere override
	 *  
	 *  	2. static	->	metoda qe nuk kane
	 *  					lidhje me te dhenat
	 *  					e objektit
	 *  					bejne nje detyre fikse
	 *  					nuk mund te behen override
	 *  
	 *  Interfacet mund te permbajne edhe 
	 *  anetar jo metoda, por vetem static
	 *  dhe final.
	 *  
	 *  Interfacet nuk krijojne objekte.
	 *  
	 **/
	
	public static void main(String[] args) {

		/***
		 * Object idObj1 = 
				new Person(null);
		((Person)idObj1).getId();
		
		Object idObj2 = 
				new AuthorityCertificate
					(null, null, null, 
							null, null);

		Identifiable idObj3 = 
				new Person(null);
		idObj3.getId();
		
		Identifiable idObj4 = 
				new AuthorityCertificate
				(null, null, null, 
						null, null);
		 * */
		
		Descriptionable d = new Address(null, null, null, "ckemi", null);
		System.out.println(d.getDescription());
		System.out.println(d.getDescriptionLength());
		Descriptionable.print(d);
	}
	
}
