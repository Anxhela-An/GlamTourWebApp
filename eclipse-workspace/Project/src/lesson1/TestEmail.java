package lesson1;

public class TestEmail {

	public static void main(String[] args) 
	{ Email email1 = new Email("Denisballa","tiranait.com");
	  Email email2 = new Email("Denisballa","tiranait.com");
	  Email email3 = new Email("Denisballa","tiranait.com");
	  
	  System.out.println(email1.getLocal());
	  System.out.println(email2.getDomain());
	  
	  System.out.println(email2.getLocal());
	  System.out.println(email2.getDomain());
	  
	  System.out.println(email3.getLocal());
	  System.out.println(email3.getDomain());
	  	  
	 System.out.println(email1.getEmail());
	 System.out.println(email2.getEmail());
	 System.out.println(email3.getEmail());

		
	}
	
}