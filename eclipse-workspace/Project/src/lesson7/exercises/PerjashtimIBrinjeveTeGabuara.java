package lesson7.exercises;

public class PerjashtimIBrinjeveTeGabuara extends Exception
{ 
	public double a,b,c;
	
	public PerjashtimIBrinjeveTeGabuara(double a,double b,double c)
	{
		super("Brinjet nuk formojne trekendesh!");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getA() {
		return a;
	  }

	  public double getB() {
		return b;
	  }

	  public double getC() {
		return c;
	  }
	  

}
