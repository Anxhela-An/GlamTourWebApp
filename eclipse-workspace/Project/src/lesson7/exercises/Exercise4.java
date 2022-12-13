package lesson7.exercises;

public class Exercise4 
{ public static void main(String []args)
	{
	  try {
		  Triangle t = new Triangle(4,1,1);
		  System.out.println("Siperfaqja eshte:" +t.getSiperfaqja());
	  }
	  catch(PerjashtimIBrinjeveTeGabuara p)
	  {
		  System.out.println(p);
	  }
	}

}
