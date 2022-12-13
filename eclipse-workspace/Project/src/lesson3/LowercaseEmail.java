package lesson3;

public class LowercaseEmail extends lesson1.Email {

	public LowercaseEmail(String email) {
		super(email.toLowerCase()); 
	}

	public LowercaseEmail(String local, 
						  String domain) {
		this(local + "@" + domain);
	}
	
}
