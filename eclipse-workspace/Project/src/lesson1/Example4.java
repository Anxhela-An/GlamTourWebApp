package lesson1;

public class Example4 {

	public static void main(String[] args) {

		Email email1 = new Email("denisballa@tiranait.com");
		Email email2 = new Email("denisballa", "tiranait.com");
		Email email3 = new Email("denisballa", "tiranait.com");
		Email email4 = new Email("denisballa", "tiranait.com");

		System.out.println(email1.getLocal());
		System.out.println(email1.getDomain());

		System.out.println(email2.getLocal());
		System.out.println(email2.getDomain());

		System.out.println(email2.getLocal() + 
				"@" + email2.getDomain());

		System.out.println(email1.getEmail());
		System.out.println(email2.getEmail());
		System.out.println(email3.getEmail());
		System.out.println(email4.getEmail());
		
	}
	
}
