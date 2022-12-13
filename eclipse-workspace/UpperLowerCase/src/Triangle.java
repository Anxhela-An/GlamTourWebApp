import java.util.Date;
public class Triangle extends GeometricObjects
{ private double a,b,c;

  public Triangle()
  {
	  a=1.0;
	  b=1.0;
	  c=1.0;
  }
  public Triangle(double a, double b, double c, String color,boolean colored)
  {   super(color,colored);  
	  if(a<=0||b<=0||c<=0)
	  {
		  a=b=c=1.0;
	  }
	  this.a=a;
	  this.b=b;
	  this.c=c;
  }
  public double getA()
  {
	  return a;
  }
  public double getB()
  {
	 return b;
  }
  public double getC()
  {
	  return c;
  }
  public boolean isTriangle(double a,double b,double c)
  {   
	  if (a+b<=c||a+c<=b||b+c<=a)
	        return false;
	    else
	        return true;
  }
  public double getArea()
  {   double p=(a+b+c)/2;
	  return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }
  public double getPerimeter()
  {
	  return a+b+c;
  }
  public String toString()
  {
	  return "lesson3.exercises.Triangle [sides of triangle are: a= "+a+", b= "+b+", c= "+c +"]";
  }
  public boolean Equals(Triangle r)
  {
	  if(r.getArea()==getArea())
	  {  return true;
		  
	  }
	  return false;
  }
 public boolean isLargerTriangle(Triangle r)
 {
	 if(r.isTriangle(a, b, c))
	 {
		 if(r.getArea()<getArea())
		 {
			 return true;
		 }
		 
	 }
	 return false;
 }
	

}
