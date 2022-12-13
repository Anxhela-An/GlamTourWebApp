package lesson12;

import lesson1.Util;
import lesson12.exercises.EmailSender;

public class Example1 {
	
	/**
	 *	Cfare eshte network?
	 *
	 *		Eshte nje rrjet pajisjesh
	 *		kompjuterike te lidhura me
	 *		njera-tjetren. Pajisjet e lidhura
	 *		transemntojne te dhena nepermjet
	 *		infrastruktures qe ka rrjeti.	
	 *
	 *	Koncepte:
	 *		
	 *		ip	:	identifikues i pajisjes
	 *				ne rrjet
	 *				2 versionet me te perdorura:
	 *
	 * 				ipv4	0.0.0.1
	 * 						255.255.255.255
	 * 				ipv6
	 * 
	 * 		server	:	pajisje fizike/virtuale
	 * 					qe mundeson sherbime per
	 * 					pajisjet qe nepermjet 
	 *					rrjetit lidhen me te
	 *					ne server veprojne programe
	 *					te ndryshme
	 *
	 *		host	:	mbajtesi i infrastruktures
	 *					se server-it
	 *
	 *					serveri fizik psh i kompanise
	 *					TiranaIT
	 *
	 *		domain	:	nje pjese e identifikueshme
	 *					e host-it
	 *					
	 *					tiranait.com
	 *
	 *		port	:	ne nje domain mund te vendosen
	 *					shume programe qe veprojne
	 *					porta mbi domain percakton 
	 *					progamin me te cilin lidhemi
	 *					numri i portes eshte numer logjik
	 *
	 *	Si te dergoj nje email nga Java?
	 *	
	 *	Ky eshte sherbimi me i thjeshte qe mund
	 *	te ofrojme nga aplikacionet duke u bazuar
	 *	ne veprimet e rrjetit.
	 *	
	 *	Ne Java libraria JavaMail mundeson mjetet e 
	 *	nevojshme per te krijuar aplikacione qe dergojne
	 *	e-mail.
	 *
	 *	https://javaee.github.io/javamail/
	 *
	 *	Kjo librari eshte zgjerim i mjeteve te 
	 *	paketes mail ne java.
	 **/
	
	public static void main(String[] args) {
		
		try {
			for (int i = 0; i < 2; i++) {
				EmailSender.send("anxhelalika322@gmail.com",
						 "mekamikamekaououou", 
						 "anxhelalika322@gmail.com", 
						 "Ka nje mesazh per ty",
						 "Anxhela, na trego numrin sekret: " + Util.getRandomValue(2000, 2021));
				System.out.println("U dergua email!");
				Thread.sleep(2000);
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
	}

}