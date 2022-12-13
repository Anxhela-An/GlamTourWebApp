package lesson7;

public class Example1 {
	
	public static void main(String[] args) {
		
	/***
	 *	Cfare bejme kur krijojme programe?
	 *	Bejme gabime.
	 *
	 * 1. Gabim nga shkaqe te pakujdesit te zhvilluesit.
	 * 2. Gabim nga shkaqe te keqperdorimit te kodit. 
	 *
	 *	Krijohen situata gjate zhvillimit te kodit,
	 *  ku ne si zhvillues nuk kemi mundesi te japim
	 *  zgjidhje.
	 *  Zakonisht kjo ndodh si shkak i krijimit te kushteve
	 *  jo normale per zgjidhjen e problemit.
	 *  Rruga me e thjeshte per te nxjerre veten nga situata
	 *  te tilla eshte te ndalojme ekzekutimin e kodit.
	 *  Si mund te ndalohet ekzekutimi i kodit?
	 *  
	 * 	Cfaredo rasti qe ne zhvillojme kod, jemi duke
	 * e zhvilluar me patjeter ne trupin e nje metode.
	 * 
	 * Nese ne nje metode has situate jo normale, mund te
	 * ndodhe qe ne te bejme marreveshje qe mund te jene
	 * te pranueshme dhe te trajtojme po aty kete situate
	 * jo normale.
	 * 
	 * Zgjidhje alternative mundesohet nepermjet skemes
	 * se perjashtimeve.
	 * 
	 * Perjashtimet jane objekte te klasave perjashtuese.
	 * 
	 * Keto klasa qe te gjitha jane nenklasa te klases
	 * Throwable. Kjo klase krijon objekte qe kane mundesi
	 * te "hidhen", per te ndaluar ekzekutimin e kodit,
	 * per te mbledhur detaje lidhur me situaten e 
	 * pazakonte te krijuar, si dhe per te percjelle
	 * kete informacion drejt metodave prind, ku mund
	 * te trajtohet situata.
	 * 
	 * Metode prind quhet metoda qe therret metoden tone.
	 * 
	 * Per shembull, metoda main therret metoden
	 * metoda1. Metoda metoda1 therret metoden metoda2.
	 * Metoda metoda2 therret metoden metoda3.
	 * 
	 * Metoda metoda3 ka prind metoden metoda2.
	 * Metoda metoda2 ka prind metoden metoda1.
	 * Metoda metoda1 ka prind metoden main. 
	 * 
	 * Klasa Throwable ka 2 nenklasa direkte, te projektuara
	 * per dy lloje te ndryshme perjashtimesh:
	 * 
	 * 	1. Error		klase e projektuar per te gjitha
	 * 					situatat ku kushtet e formuar krijojne
	 * 					pamundesi per rikuperim
	 * 					eshte e pamundur te kthehet ne normalitet
	 * 					situata e programit
	 * 
	 * 					PSH. makina virtuale ndalon se punuari
	 * 
	 * 	2. Exception	klase e projektuar per te gjitha situatat
	 * 					ku mund te arrijme me sukses rikuperim
	 * 
	 * 	
	 * 		Perjashtimet e klases Exeption ndahen ne:
	 * 
	 * 			1. te kontrolluar
	 * 			2. te pakontrolluar
	 * 
	 * 		Skema e perjashtimeve, e detyron compiler
	 * 		qe te na njoftoje sa here qe ne perdorim
	 * 		metoda te cilat mund te hedhin perjashtime.
	 * 		Kjo ndarje eshte bere qe compiler te mos
	 * 		paralajmeroje per cdo gje, sepse po te ndodhte
	 * 		keshtu skema do rendoje ne cdo instruksion
	 * 		te koduar, duke kerkuar qe te trajotjme gjerat
	 * 		qe mund te shkojne keq.
	 * 
	 * 		Klasa RuntimeException eshte nenklase e klases
	 * 		Exeption, e cila eshte superklase e klasave
	 * 		kryesore qe krijojne perjashtime te pakontrolluara,
	 * 		te tilla si ArithmeticException, NullPointerException,
	 * 		IndexOutOfBoundsException, etj. Gjithsesi ka edhe klasa
	 * 		te tjera qe jane te tilla qe krijojne objekte perjashtimesh
	 * 		te pakontrolluara.
	 * 
	 * 		Skema na ndihmon si fillim per te identifikuar
	 * 		ne menyre sa me te lehte gjera qe mund te shkojne keq.
	 * 	
	 * 		Se dyti, duke u bazuar ne kete skeme mund te trajtojme
	 * 		situaten ne trupin e metodes qe eshte identifikuar:
	 * 
	 * 			try{
	 * 
	 * 			}
	 * 			catch(Exception e){
	 * 
	 * 			}
	 * 
	 * 		Struktura e mesiperme kodohet si bllok per te 
	 * 		mundesuar pritjen edhe trajtimin e objekteve
	 * 		te perjashtimeve.
	 *
	 *		Ne brendesi te trupit try vendoset kodi qe
	 *		mund te hedhe perjashtim. 
	 *
	 *		Ne trupin catch vendoset kodi qe ben te mundur
	 *		kthimin e situates ne normalitet.
	 *
	 *		Ne try vendosim instruksione qe presim te zbatohen
	 *		qe te gjithe nese nuk shkon asgje keq. Ne momentin
	 *	    e pare qe nje instruksion nuk zbatohet, hidhet perjashtim.
	 *		Pjesa tjeter e instruksioneve nuk zbatohet. Algoritmi
	 *		do vijoje te zbatohet ne piken ku behet rikuperimi i situates.
	 *
	 *		1. si krijohet nje perjashtim
	 *		2. si krijohet klase perjashtimi
	 *		3. si kalon nje perjashtim nga nje metode
	 *		   ku krijohet, ne vargun e metodave prind
	 *		4. si pritet nje perjashtim i ardhur nga	
	 *		   nje metode e therritur
	 *		5. diferenca ndermjet perjashtimeve te kontrolluar
	 *		   dhe atyre te pakontrolluar ne pikat e mesiperme
	 *
	 *
	 *
	 **/
		
	}

}





