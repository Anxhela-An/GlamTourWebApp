package lesson1;

public class Id {
	
	/**
	 * Do sherbeje per te krijuar nje objekt identifikues
	 * per rastet qe ne mund te kemi nevoje qe "gjeja" qe
	 * krijojme apo perdorim te jete e identifikueshme
	 * ne menyre unike nga sistemi qe krijojme vete.
	 * Id eshte vlere unike, qe nuk duhet te ndryshoje.
	 * Per te ndaluar modifikimin e vleres, antari i 
	 * koduar eshte specifikuar qe te jete i dukshem
	 * vetem brenda klases.
	 * Antaret private perdoren vetem brenda klases.
	 * Sepse brenda klases ndryshmet/zhvillimin e kodit
	 * e bej vetem une.
	 * Fshehja e antareve / enkapsulimi eshte nje praktike
	 * qe rrit qendrueshmerine e programit.
	 * */
	
	private long id;
	private static long nextId = 1;
	
	/**
	 * Antari static nextId do perdoret qe te gjeneroje
	 * vleren e radhes per id e radhes qe do gjeneroje
	 * sistemi jone.
	 * Antari nextId, si antar static ruhet vetem nje
	 * here ne kujtese.
	 * Antaret jo static, ruhen ne kujtese ne vete
	 * per cdo objekt qe krijohet.
	 * */

	public long getId() {
		return id;
	}
	
	/**
	 * Nese nevojitet qe ndonje nga antaret
	 * e koduar private, te perdoret jasht
	 * klases, ne krijojme metodat e duhura
	 * me akses te lejuar jasht klases,
	 * qe bejne te gjithe kontrollet e nevojshme
	 * per te garantuar saktesine e informacionit
	 * kur ato perdorin keto antar.
	 * Keto metoda, ndahen ne dy lloje:
	 * 
	 * 	Metoda getter
	 * 	Metoda setter
	 * 
	 * Metodat getter kan qellim qe te lexojne
	 * vleren e ruajtur.
	 * Metodat setter kan qellim qe te shkruajne
	 * vlere te re.
	 * */
	
	public Id() {
		id = nextId;
		nextId++;
	}
	
	/**
	 * Atributet (antaret variabla te koduar 
	 * ne klase), marrin vlere fillestare 
	 * vleren default qe ka
	 * tipi me te cilen ato deklarohen.
	 * Si te vendos vlere tjeter?
	 * Vlera fillestare, qe deshirohet te
	 * jete ndryshe nga vlera default e
	 * atributit percaktohet ne nje metode
	 * te vecante te njohur ndryshe si
	 * ndertues (constructor).
	 * Kjo metode ka emer te njejte me
	 * emrin e klases. 
	 * Nuk ka tip.
	 * Nuk kthen vlere.
	 * */
	
	public static long getNextId() {
		return nextId;
	}
	
	@Override
	public String toString() { 
		return "lesson1.Id[id=" + id + "]";
	}

	@Override
	public int hashCode() { 
		return (int) id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {	///a eshte i njejti objekt
							///a eshte e njejta reference
							///a eshte e njejta adrese
			/**
			 * this eshte objekti i klases i cili
			 * ka therritur metoden 
			 * psh id1.equals(id2)
			 * id1 eshte objekti this
			 * ne kete rast pyesim nese id1 dhe id2
			 * jane apo jo e njejta adrese
			 * mund te ishte id1.equals(id1)
			 * */
			return true;
		}
		if (!(obj instanceof Id)) {
			return false;
		}
		Id other = (Id) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
	
	public Id clone() {
		Id id = new Id();
		id.id = this.id;
		nextId--;
		return id;
	}
	
	
	
}






