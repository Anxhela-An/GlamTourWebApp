package lesson3;

public class Email {

	private lesson1.Email email;

	public Email(String email) {
		this.email = new lesson1.
				Email(email.toLowerCase());       
	}

	public Email(String local, String domain) {
		email = new lesson1.
				Email(local.toLowerCase(),
					  domain.toLowerCase());
	}
	
	public String getEmail(){
		return email.getEmail();
	}
	
	public String getLocal(){
		return email.getLocal();
	}
	
	public String getDomain(){
		return email.getDomain();
	}
	
	/**
	 * Ne marredhenie shoqerimi, nese per te njejtin
	 * tip ekzistues te duhet te modifikosh dicka
	 * ne menyren e funksionimit, algoritmi behet
	 * i gjate, sepse rrjedhimisht detyrohemi te
	 * kodojme edhe njehere anetaret qe nuk duhet
	 * te pesojne ndryshime.
	 * 
	 * Ne marredhenie shoqerimi, behet krijimi i dy
	 * objekteve.
	 * */

	@Override
	public String toString() {
		return "lesson3.Email[local=" + email.getLocal() + 
				", domain=" + email.getDomain() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Email)) {
			return false;
		}
		Email other = (Email) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		return true;
	}
	 
}