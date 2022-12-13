package lesson4;

@FunctionalInterface
public interface Descriptionable {
 
	String getDescription();
	
	default int getDescriptionLength() {
		return getDescription().length();
	}
	
	static void print(Descriptionable s) {
		System.out.println(s.getDescription());
	}
	
}
