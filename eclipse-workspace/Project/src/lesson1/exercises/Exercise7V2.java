package lesson1.exercises;
import lesson1.Util;
import java.util.ArrayList;
public class Exercise7V2 
{   public static void main(String []args)
	
    {String[] name = {
		"Mira", "Beni", "Andi",
		"Mevlani", "Sindi", "Gloria",
		"Josela", "Era", "Festa",
		"Klerta", "Sara", "Klaus",
		"Jorid", "Anxhela"
                     };

     String[] surname = {
		"Lesi", "Paskali", "Njutoni",
		"Moisiu", "Jeho", "Balla",
		"Cepani", "Terziu", "Spaha",
		"Lika"
                        }; 
     int numberOfParticipants = Util.getRandomValue(5, 10);
     System.out.println("Number of students: " + numberOfParticipants);
     ArrayList<QuizParticipant>participants = new ArrayList<QuizParticipant>(numberOfParticipants);
       for(int i=0; i<numberOfParticipants;i++)
       {
    	   participants.add(new QuizParticipant(name[Util.getRandomValue(0,name.length-1)],surname[Util.getRandomValue(0, surname.length-1)]));
    	   System.out.println("Participant"+(i+1)+":"+participants.get(i).getName()+" "+participants.get(i).getSurname());
    	   int numberOfQuizzes = Util.getRandomValue(5, 10);
    	   System.out.println("Number of quizzes is: "+numberOfQuizzes);
    	   for(int j=0; j<numberOfQuizzes;j++)
    	   { int points =Util.getRandomValue(5, 10);
    	     System.out.println("Number of points for quizz"+(j+1)+" is "+points);
    	     participants.get(i).addQuizPoints(points);
    	     
    	   }
       }
       sort(participants);
       print(participants);
     
     
		
    }

private static void print(ArrayList<QuizParticipant> a) {
	for(int i=0; i<a.size();i++)
	{
		System.out.println(a.get(i).getName()+" "+a.get(i).getSurname());
	}
	
}

private static void sort(ArrayList<QuizParticipant> a)
{
	for(int i=0; i<a.size();i++)
	{
		int index=i;
		for(int j=0;j<a.size();j++)
		{
			if(a.get(index).getAveragePoints()>a.get(j).getAveragePoints())
			{ index = j;
				
			}
		}
		swap (i,index,a);
	}
	
}

private static void swap(int i1, int i2, ArrayList<QuizParticipant> a) {
	QuizParticipant tmp = a.get(i1);
	a.set(i1,a.get(i2));
	a.set(i2,tmp);
	
	
}
	
	

}
