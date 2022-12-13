package lesson5;

public class Example4 {

	/***
	 * Nje klase mund te projektohet
	 * duke perdorur parametra tip.
	 * 
	 * Nje metode mund te projektohet
	 * duke perdorur parametra tip.
	 * 
	 * 
	 * Pra, ne listen e parametrave
	 * tip te klases vendosen emertime
	 * per te sherbyer ne marrjen e 
	 * argumentave (vetem klasa) gjate
	 * perdorimit te klases. 
	 * Per shembull, klasa Pair, e ndertuar
	 * nga ne, ka 2 parametrat tip, te
	 * cilet marrin si argumenta tipet
	 * me te cilet krijohet objekti.
	 * Tipet qe vendosen gjate perdorimit
	 * te klases, specifikojne se cfare 
	 * eshte secili nga parametrat tip.
	 * Deklarimi Pair<T1, T2>, perdorimi
	 * Pair<String, Integer>, T1 eshte
	 * String, T2 eshte Integer. 
	 * Mund te mendosh qe kudo ku ne klase
	 * eshte T1, per kete objekt eshte String.
	 * Mund te mendosh qe kudo ku ne klase
	 * eshte T2, per kete objekt eshte Integer.
	 * Kujdes, theksojme qe cdo parameter tip
	 * mund te marre si argument vetem tipe
	 * jo primitiv.
	 * 
	 * Ne projektimin e metodave, mund te perdoren
	 * tipe te dhenash te specifikuar si Generic
	 * ne listen e parametrave tip te metodes.
	 * Lista e parametrave tip te metodes percaktohet
	 * perpara tipit te metodes.
	 * 
	 * public static <T> int metode(T t){
	 * 		return t.toString(). length();
	 * }
	 * 
	 * Bej nje metode qe merr si argument nje
	 * objekt dhe kthen gjatesine e tij si string.
	 * 
	 * Tipi T, mund te jete klase konkrete,
	 * klase abstrakte, interface.
	 * Kujdes, kujtojme qe klasat abstrakte
	 * dhe interface-t nuk krijojne objekte.
	 * Me tipin T, nuk krijohet objekt.
	 * */
	
	public static <T> int length(T o) {
		if(o == null) {
			return 0;
		}
		return o.toString().length();
	}
	
	public static void main(String[] args) {
		
		int g1 = Example4.<String>length("hello");
		int g2 = Example4.<Integer>length(123);
		int g3 = Example4.<Integer[]>length(new Integer[] {10, 7, 4, 31, -19});

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		
	}
	
}
