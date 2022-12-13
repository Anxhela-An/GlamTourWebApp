package lesson5;

public class Bottle <T extends Compare <T>>
			implements Compare <T>{

	private T amount;
	
	@Override
	public boolean isBiggerThan(T o) { 
		return amount.isBiggerThan(o);  
	}

	@Override
	public boolean isSmallerThan(T o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEqual(T o) {
		// TODO Auto-generated method stub
		return false;
	}

}
