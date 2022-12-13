package lesson5;

public class Example2 {
	
	public static void main(String[] args) {
		
		DoublePair dd = new DoublePair(10.0, 20.0);
		StringPair ss = new StringPair("", "");
		
		Pair<Double, Double> dd2 = 
				new Pair<Double, Double>(10.0, 20.0);
		
		Pair<String, String> ss2 = 
				new Pair<String, String>("", "");
		System.out.println(dd.getMember1()+" and  "+dd.getMember2());
		
		///dd2.setMember1("wdwe");
		
	}

}
