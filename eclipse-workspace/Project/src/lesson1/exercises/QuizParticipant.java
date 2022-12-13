package lesson1.exercises;

public class QuizParticipant {

	private String name, surname;
	private int points;
	private int numberOfQuizzes;



	public QuizParticipant(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void addQuizPoints(int amount) {
		points = points + amount;
		numberOfQuizzes++;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPoints() {
		return points;
	}
	
	public int getNumberOfQuizzes() {
		return numberOfQuizzes;
	}

	public double getAveragePoints() {
		if (numberOfQuizzes != 0) {
			return (double)points / numberOfQuizzes;
		}
		return 0;
	}

}
