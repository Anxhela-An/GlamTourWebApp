package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class WeaponPermit extends 
				AuthorityCertificate {

	private byte weaponType;
	
	public WeaponPermit(String authority, 
						String code, 
						ArrayList<String> conditions, 
						GregorianCalendar startDate,
						GregorianCalendar endDate,
						int weaponType) {
		super(authority, code, conditions, 
				startDate, endDate); 
		if(!WeaponType.contains(weaponType)) {
			weaponType = WeaponType.PISTOL;
		}
		this.weaponType = (byte) weaponType;
	}
	
	public byte getWeaponType() {
		return weaponType;
	}

	@Override
	public String toString() {
		return "lesson3.WeaponPermit ["
				+ "weaponType=" + weaponType 
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + weaponType;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof WeaponPermit)) {
			return false;
		}
		WeaponPermit other = (WeaponPermit) obj;
		if (weaponType != other.weaponType) {
			return false;
		}
		return true;
	} 

}