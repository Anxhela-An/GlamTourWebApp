package lesson10;

public class Sum {
	
	private String data;
	
	public Sum() {
		data = "";
	}
	
	public void sumer(String s) {
		data += s + "\n";
	}
	
	public String getData() {
		return data;
	}

}
