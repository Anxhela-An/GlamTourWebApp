package lesson4;

public class OddEven implements Condition
{

	@Override
	public boolean test(int n1, int n2) {
		
		return n1%n2!=0 && n2%n1==0;
	} 

}
