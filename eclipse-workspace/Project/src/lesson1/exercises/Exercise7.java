package lesson1.exercises;
import lesson1.Util;
public class Exercise7 
{ public static void main(String []args)
	{
	  //te dhenat mund t'i ruajme ne nje vektor(array) ose liste (ArrayList)
	  String []name = { "Anxhela", "Era", "Festa","Klerta", 
			            "Josela", "Sara","Jorid","Klaus","Mira",
			            "Beni","Andi","Sindi","Gloria"
			  
	                  };
	  String []surname = { "Lika", "Bilcari","Balla","Terziu",
			               "Spaha","Moisu","Jeho"
			  
	                     };
	  int numberOfParticipants = Util.getRandomValue(5, 10);
	  System.out.println("Number of students: "+numberOfParticipants);
	  
	  QuizParticipant[]participants = new QuizParticipant[numberOfParticipants];  
	  for(int i=0;i<participants.length;i++)
	  {
		  participants[i]= new QuizParticipant(name[Util.getRandomValue(0, name.length-1)],
				           surname[Util.getRandomValue(0, surname.length-1)]);
		  System.out.println("Participant"+(i+1)+":"+participants[i].getName()+" "+
				             participants[i].getSurname());
		  int numberOfQuizes = Util.getRandomValue(5,10);
		  System.out.println("Number of quizes: "+numberOfQuizes);
		  for(int j=0;j<numberOfQuizes;j++)
		  {
			  int points = Util.getRandomValue(5, 10);
			  System.out.println("Quiz"+(j+1)+":"+points);
			  participants[i].addQuizPoints(points);
		  }
	  }
	  sort(participants);
	  print(participants);
	}

private static void print(QuizParticipant[] a) 
{ for(int i=0;i<a.length;i++)
{
	System.out.println(a[i].getName()+" "+a[i].getSurname());
}
	
	
}

private static void sort(QuizParticipant[] a) 
{ for(int i=0;i<a.length-1;i++)
{
	int index=i;
	for(int j = i+1;j<a.length;j++)
	{
		if(a[j].getAveragePoints()>a[index].getAveragePoints())
		{
			index=j;
		}
	}
	swap(i,index,a);
}
	
	
}

private static void swap(int i1, int i2, QuizParticipant[] a) 
{ QuizParticipant tmp = a[i1];
  a[i1]=a[i2];
  a[i2]=tmp;
	
	
}

}
