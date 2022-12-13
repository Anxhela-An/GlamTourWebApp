package lesson7.exercises;

public class Octagon implements Comparable<Octagon>,Cloneable
{
  private double length;
  	
	public Octagon(double length)
	{
		if(length<=0)
		{
			new IllegalArgumentException();
		}
		this.length=length;
	}
	
	@Override
	public int compareTo(Octagon o) {
		return (int) (length-o.length);
	}
	public double getLength()
	{
		return length;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString() {
		return "Ocatgon [length=" + length + "]";
	}
	
	public double getPerimeter(){
		return 8 * length;
	}
	
	public double getArea() {
		return 2 * (1 + Math.sqrt(2)) * 
				length * length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Octagon)) {
			return false;
		}
		Octagon other = (Octagon) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length)) {
			return false;
		}
		return true;
	}	

}
