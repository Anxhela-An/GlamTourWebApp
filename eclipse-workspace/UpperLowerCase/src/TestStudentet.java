import java.util.*;
public class TestStudentet 
{ public static void main(String []args)
	{
	  ArrayList<Student> students = new ArrayList<Student>();
	  students.add(new Student("Ani","Pupa",90));
	  students.add(new Student("Bora","Zika",50));
	  students.add(new Student("Emanuel","Korpi",100));
	  
	  System.out.println("Renditja e studenteve ne baze te pikeve:");
	  
	  Collections.sort(students,Student.piket);
	  for(Student s:students)
	  {
		  System.out.println(s.getEmer());
	  }
	}

}
