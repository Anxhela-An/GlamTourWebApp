package lesson3;

public class WeaponType {

	public static final byte FIREARM = 1;
	public static final byte RIFLE = 2;
	public static final byte PISTOL = 3;
	public static final byte REVOLVER = 4;
	public static final byte SHOTGUN = 5;
	
	public static boolean contains(int weaponType) { 
		return weaponType == FIREARM ||
			   weaponType == RIFLE ||
			   weaponType == PISTOL ||
			   weaponType == REVOLVER ||
			   weaponType == SHOTGUN;
	}
	
}