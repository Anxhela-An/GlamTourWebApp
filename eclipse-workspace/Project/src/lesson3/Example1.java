package lesson3;

import lesson1.Email;

public class Example1 {
	
	public static void main(String[] args) {
		
		Email email1 = new Email("zotiKlaus", "legjend.com");
		System.out.println(email1.getEmail());
		
		/**
		 * Duhet te krijosh nje klase te re
		 * per Email ku email te ruhet ne
		 * format jo kapital.
		 * */
		
		LowercaseEmail email2 = 
				new LowercaseEmail("zotiKlaus", "legjend.com");
		System.out.println(email2.getEmail());
		
	}
	
	/**
	 * Trashegimia eshte nje marredhenie
	 * ndermjet dy klasave qe formohet
	 * kur nje klase zgjeron kodin e nje klase
	 * ekzsituese.
	 * Klasa qe zgjerohet (lesson1.Email) emertohet
	 * superklase.
	 * Klasa zgjeruese (lesson3.Lowerclass) emertohet
	 * nenklase.
	 * Nenklasa zgjeron superklasen.
	 * Superklasa eshte me e madhe se nenklasa?
	 * Ne kuptimin qe superklasa ka me shume cilesi
	 * se nenklasa? 
	 *  [Po] [Jo]
	 * Jo, sepse nenklasa i gezon te gjitha cilesite
	 * e superklase, duke bere ndonje ndryshim apo
	 * madje edhe shtim te tyre.
	 * 
	 * Ne gjuhen Java trashegimia eshte njefishe.
	 * Dmth, qe nje nenklase mund te zgjeroje
	 * vetem nje superklase.
	 * 
	 * Nje klase qe eshte nenklase, mund te perdoret
	 * si superklase nga nje klase tjeter.
	 * Rrjedhimisht, keshtu formohet nje "varg trashegimie".
	 * 
	 * public class Class1{}
	 * 
	 * public class Class2 extends Class1{}
	 * 
	 * public class Class3 extends Class2{}
	 * 
	 * 
	 * Nje objekt i nenklases eshte ne te njejten kohe
	 * edhe objekt i superklases (kujdes, jo se ekzistojne
	 * dy te tille, por ky ekzistuesi konsiderohet si
	 * objekt i te gjitha klasave qe jane ne vargun
	 * e trashegimise, duke nisur nga klasa me te
	 * cilen eshte krijuar).
	 * 
	 * Kur zbatohet konstruktori i nenklases, zbatohet
	 * detyrimisht edhe konstruktori i superklases.
	 * Madje, konstruktori i superklases zbatohet para
	 * zbatimit te konstruktorit te nenklases.
	 * 
	 * Kur kodohet konstruktori i nje klase, ose 
	 * therret nje konstruktor tjeter te klases se
	 * tij ose therret nje konstruktor te superklases.
	 * 
	 * Therritja e konstruktorit te superklases behet
	 * nepermjet fjales kyce super. Ky instruksion shkruhet
	 * ne menyre te paracaktuar ne cdo konstruktor,
	 * ne formen super();.
	 * Ne mund ta ndryshojme ate, duke shtuar argumenta
	 * per percaktimin e perdorimit te nje konstruktori
	 * te superklases, ose mund ta heqim fare duke e 
	 * zevendesuar me therritjen e nje konstruktori tjeter
	 * te klases qe po krijohet.
	 * 
	 * Nje konstruktor mund te beje ose therritje te
	 * konstruktorit te superklases, ose therritje te
	 * nje konstruktori ne klasen e tij. Rrjedhimisht
	 * ne nje konstruktor nuk mund te perdoret 
	 * edhe instruksioni this() edhe instruksioni 
	 * super().
	 * 
	 * public Constructor(){
	 * 	super(3);
	 * }
	 * 
	 * public Constructor(int n){
	 * 	this();
	 * 	
	 * }
	 * 
	 * Cdo klase ka me patjeter superklase.
	 * 
	 * Nese nje klase nuk e ka te percaktuar 
	 * nje superklase, atehere ne Java superklasa
	 * e saj eshte klasa Object.
	 * 
	 * public class Class extends Object {
	 * 
	 * }
	 * 
	 * eshte ekuivalente me
	 * 
	 * public class Class {
	 * }
	 * 
	 * Klasa Object ka vetem nje konstruktor.
	 * 
	 * public Object(){}
	 *  
	 * 
	 * */

}
