package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SecurityGuard extends Employee {
	
	private ArrayList<AuthorityCertificate> certificates;
	/**
	 * Per nje roje ruajme edhe licencen si roje
	 * edhe lejet per perdorim arme.
	 * Dmth ne atributin certificates do duhet
	 * te ruajme edhe objekte te klases WeaponPermit
	 * edhe te SecurityGuardLicence.
	 * A eshte kjo e mundur?
	 * Fakt eshte qe certificates ruan AuthorityCertificate,
	 * e cila eshte superklase per WeaponPermit dhe
	 * SecurityGuardLicence, e ndaj mund te ruajme
	 * objekte te tyre ne kete atribut.
	 * */
	
	/**
	 * duhet te shtosh leje, por te mos heqesh dot
	 * */
	
	
	public SecurityGuard(GregorianCalendar birthdate) {
		super(birthdate);
		// TODO Auto-generated constructor stub
	}

	public void addCertificate(AuthorityCertificate ac){
		if(ac == null) {
			return;
		}
		certificates.add(ac);
	}
	
	public int getCertificatesSize() {
		return certificates.size();
	}
	
	public AuthorityCertificate getCertificate(int index) {
		if(index < 0 || index > getCertificatesSize() - 1) {
			return null;
		}
		return certificates.get(index);
	}
	
}