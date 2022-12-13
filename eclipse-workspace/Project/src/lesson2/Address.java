package lesson2;

import lesson4.Descriptionable;

public class Address implements Descriptionable {
	
	/***
	 * State		i ndryshueshem
	 * City			i ndryshueshem
	 * Street		i ndryshueshem
	 * Number		i ndryshueshem
	 * ZipCode		i ndryshueshem
	 * description	i ndryshueshem
	 * Location (pozicion gjeografik)	i pandryshueshem
	 * */

	private String state, city, street, description;
	private int number, zipCode;
	private Location location;
	
	/**
	 * Konstruktori me me pak parametra, sa parametra
	 * do kete? Cilet?
	 * A mund te bejme ndonje pa parametra fare?
	 * */
	
	public Address(Location location) {
		this(null, null, null, 0, 0, null, location);
	}
	
	public Address(double latitude, double longitude)
	{
		this(new Location(latitude, longitude));
	}
	
	public Address(String state, String city,
				   Location location) {
		this(state, city, null, 0, 0, null, location);
	}

	public Address(String state, String city,
			   	   String street, String description, 
				   Location location) {
		this(state, city, street, 0, 0, description, location);
	}
	
	public Address(String state, String city,
				   String street, int number, 
				   int zipCode, String description, 
			       Location location) {
		this.state = state;
		this.city = city;
		this.street = street;
		this.number = number;
		this.zipCode = zipCode;
		this.description = description;
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "lesson2.Address [state=" + state +
				", city=" + city + 
				", street=" + street + 
				", description=" + description + 
				", number=" + number + 
				", zipCode=" + zipCode + 
				", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + number;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (number != other.number) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!street.equals(other.street)) {
			return false;
		}
		if (zipCode != other.zipCode) {
			return false;
		}
		return true;
	}
	
	
	
	//private double latitude, longitude;
	
	/**
	 * Ne nje klase te re, ne nuk e rishkruajme algoritmin
	 * qe specifikon sjellje qe jane tashme te trajtuara
	 * nga klasa ekzistuese. Zgjedhim ne vend te rishkrimit
	 * te kodit te riperdorim kodin e shkruar me pare
	 * nepermejt perdorimit te klases se koduar me pare
	 * gjate kodimit te klases se re.
	 * Situata e formuar, teorikisht krijon marredhenie
	 * ndermjet dy klasave.
	 * Cfare marredhenie ekziston midis klases Address dhe 
	 * Location?
	 * Marredhenie grumbullimi.
	 * Kur krijohen marredhenie ndermjet dy klasave, ose
	 * formohet marredhenie shoqerimi ose formohet marredhenie
	 * trashegimie.
	 * Marredheniet e shoqerimit formohen ne rastet kur nje
	 * klase perdoret si atribut gjate krijimit te nje klase
	 * tjeter.
	 * Marredheniet e shoqerimit ndahen ne 3 lloje:
	 * 
	 * 1. marredhenie shoqerimi (mund te shenohet e dy aneshme, e plote)
	 * 2. marredhenie grumbullimi
	 * 3. marredhenie kompozimi
	 * 
	 * 1 -> ndodh kur dy klasa, qe te dyja ne trupin e 
	 * 	    tyre perdorin si atribut anetar me tip klasen
	 * 		tjeter
	 * 2 -> ndodh kur vetem njera klase e perdor ne zhvillimin 
	 *      e saj anetarin tjeter (sic eshte ky rast)
	 *      marredhenia e ketij rasti i percakton objekteve
	 *      rolet e pronarit dhe prones
	 *      Objekti pronar eshte objekti i cili ndertohet
	 *      me klasen qe ka perdorur ne ndertimin e saj
	 *      atribut me tipin e klases tjeter.
	 *      Objekti prone eshte objekti i perdorur nga
	 *      objekti i pare.
	 *      Njera klase eshte klase grumbulluese (klasa e pronarit).
	 *      Klasa tjeter eshte klase e grumbulluar (klasa e prones).
	 *      Mund te ndodhe qe nje objekt prone, te perdoret si e tille
	 *      ne disa objekte pronar (prone me bashkepronare).
	 * 3 -> eshte njesoj si marredhenia e grumbullimit, por me 
	 * 		vecorine qe objekti prone mund te kete vetem nje
	 * 		objekt pronar
	 * 		Si rregull, objekti prone nuk ndertohet nese nuk ekziston
	 * 		objekti pronar.
	 * */
	
}
