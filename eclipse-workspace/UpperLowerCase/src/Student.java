import java.util.Comparator;
public class Student 
{ private String emri;
  private String mbiemri;
  private double sasiaPikeve;
  private int numberOfQuizzes;
  
  Student(String emri,String mbiemri,double sasiaPikeve)
  {
	  this.emri=emri;
	  this.mbiemri=mbiemri;
	  this.sasiaPikeve=sasiaPikeve;
  }
  public String getEmer()
  {
	  return emri;
  }
  public String getMbiemer()
  {
	  return mbiemri;
  }
  public void shtoPikeQuizi(double s)
  {
	  sasiaPikeve+=s;
	  numberOfQuizzes++;
  }
  public double getPikeTotale()
  {  
	  return sasiaPikeve;
  }
  public double getPikeMesatare()
  {    if(numberOfQuizzes!=0)
       {
	  
	   return sasiaPikeve/numberOfQuizzes;
       }
       return 0;
	  
  }
  public static Comparator<Student>piket=new Comparator<Student>()
		  {
	            public int compare(Student s1, Student s2)
	            {
	            	double piket1 = s1.getPikeTotale();
	            	double piket2 = s2.getPikeTotale();
	            	return (int) (piket2-piket1);
	            }
		  };

}
