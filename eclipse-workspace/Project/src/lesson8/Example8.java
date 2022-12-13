package lesson8;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

import lesson1.Util;

public class Example8 {

	public static void main(String[] args) {

		ArrayList<Recipe> list = new ArrayList<>();

		File file = new File("info.txt");

		try {

			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				int id = Integer.parseInt
					(line.substring(0, line.indexOf(" ")));
				int i1 = line.indexOf("[");
				int i2 = line.indexOf("]");
				String title = line.substring(i1 + 1, i2);
				line = line.substring(i2 + 1);
				i1 = line.indexOf("[");
				i2 = line.indexOf("]");
				String description = line.substring(i1 + 1, i2);
				long timeInMillis = Long.parseLong(line.substring(i2 + 2));
				GregorianCalendar dateAndTime = new GregorianCalendar();
				dateAndTime.setTimeInMillis(timeInMillis);
				
				list.add(new Recipe(id, title, description, dateAndTime));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for(Recipe r : list) {
			System.out.println(r.getId() + " " + 
							   r.getTitle() + " " + 
							   r.getDescription() + " " + 
									   Util.getGregorianCalendarAsString(r.getDateAndTime()));
		}

	}

}
