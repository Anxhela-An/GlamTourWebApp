package lesson7.exercises;

public class Triangle
{ private double a,b,c;
  
  public Triangle(double a,double b,double c) throws PerjashtimIBrinjeveTeGabuara
  {
	  if(brinjetFormojneTrekendesh(a,b,c)) 
	  {
		  this.a=a;
		  this.b=b;
		  this.c=c;
	  }
	  else
	  {
		  throw new PerjashtimIBrinjeveTeGabuara(a,b,c);
	  }
  }
  public boolean brinjetFormojneTrekendesh(double a,double b,double c) throws PerjashtimIBrinjeveTeGabuara
  {
	  return (a>0)&&(b>0)&&(c>0)&&(a+b>c)&&(b+c>a)&&(a+c>b);
  }
  public double getSiperfaqja()
  {   double p = (a+b+c)/2;
	  return Math.sqrt(p*(p-a)*(p-b)*(p-c));
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
