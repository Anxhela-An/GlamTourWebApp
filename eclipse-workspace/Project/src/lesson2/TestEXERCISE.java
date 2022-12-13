package lesson2;

public class TestEXERCISE 
{ public static void main(String []args)
	{
	   
	  Student student = new Student("Ana","Bregu",null,2,"IE",2010);
	  Punonjes punonjes = new Punonjes("Lesi",700.0);
	  Instructor instructor = new Instructor("Lesi",800.0,24);
	  Staff staff = new Staff("Ceno",1500.0,"Menaxher");
	  
	  System.out.println(student.toString());
	  System.out.println(punonjes.toString());
      System.out.println(instructor.toString());
      System.out.println(staff.toString());
	}

}
