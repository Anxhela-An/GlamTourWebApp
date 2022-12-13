package lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Example7 {
	
	public static void main(String[] args) {

		ArrayList<Recipe> list = new ArrayList<>();

		list.add(new Recipe(1, "Tave Dheu",
				"100 gram gjize,200g mish",
				new GregorianCalendar
					(1901, 0, 1, 10, 30, 15)));

		list.add(new Recipe(2, "Speca te mbushura",
				"100 gram oriz,200g speca",
				new GregorianCalendar
					(1902, 0, 1, 11, 30, 15)));

		list.add(new Recipe(3, "Fasule",
				"100 gram mish,200g fasule",
				new GregorianCalendar
					(1912, 10, 29, 12, 30, 15)));
		
		File file = new File("info.txt");
		
		try {
			
			PrintWriter output = new PrintWriter(file);

			for(Recipe r : list) {
				output.println(r.getId() + " " + 
						"[" + r.getTitle() + "] " + 
						"[" + r.getDescription() + "] " + 
						r.getDateAndTime().getTimeInMillis());
			}

			output.close();
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
		
	}
	
	

}






