package lesson2;

import java.util.ArrayList;
import lesson1.Util;

public class PhoneNumber {
	
	/**
	 * prefix		i pandryshueshem
	 * operator		i pandryshueshem
	 * simNumber	i pandryshueshem
	 * nuk duhet te krijohen dy objekte qe perfaqesojne
	 * te njejten permbajtje
	 * */

	private short prefix;
	private short operator;
	private long simNumber;
	
	private static ArrayList<PhoneNumber> phoneNumbers = 
					new ArrayList<PhoneNumber>();
	
	public PhoneNumber(short prefix, short operator, long simNumber) {
		while(exist(prefix, operator, simNumber)) {
			//objekti nuk duhet te krijohet
			prefix = (short) Util.getRandomValue(1, 999);
			operator = (short) Util.getRandomValue(1, 999);
			simNumber = Util.getRandomValue(2_000_000, 999_999_999);
		}
		this.prefix = prefix;
		this.operator = operator;
		this.simNumber = simNumber;
		phoneNumbers.add(this);
	}

	private boolean exist(short prefix, short operator, 
						  long simNumber) {
		for(PhoneNumber pn : phoneNumbers) {
		//for(int i = 0; i < phoneNumbers.size(); i++){
		//  if(phoneNumbers.get(i).prefix == prefix &&
			if(pn.prefix == prefix &&
			   pn.operator == operator &&
			   pn.simNumber == simNumber) {
				return true;
			}
		}
		return false;
	}

	public short getPrefix() {
		return prefix;
	}

	public short getOperator() {
		return operator;
	}

	public long getSimNumber() {
		return simNumber;
	}
	 
}