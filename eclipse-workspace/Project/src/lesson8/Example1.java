package lesson8;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
	
	public static void main(String[] args) {
		
		/**
		 * Si identifikohet nje file?
		 * - Nepermjet path.
		 * Path eshte absolut ose relativ.
		 * 
		 * Path shkruhet ne forma te ndryshme ne
		 * sisteme te ndryshme operimi.
		 * Per shembull:
		 * 
		 * 	1. windows	c:\\users\\user\\desktop\\info.txt
		 *  2. linux	user@dosje1/dosje2/dosje3/info.txt
		 *  3. etj
		 *  
		 * Java per te zhdukur diferencat ndermjet
		 * sistemeve perdor modelin:
		 * 
		 * 		dosje/dosje/dosje/file
		 * 
		 * Path ne Java shkruhet duke perdorur /
		 * per ndarjen e elementeve te path.
		 * 
		 * Path absolut tregon rrugen e plote nga
		 * ndarja e rrenjes se kujteses (partition)
		 * deri tek file qe identifikohet.
		 * 
		 * Path relativ tregon rrugen nga
		 * dosja e programit qe perdor file-in
		 * deri tek file qe identifikohet.
		 * 
		 * 
		 * c:/users/user/desktop/info.txt	path absolut
		 * user/desktop/info.txt			path relativ
		 * 		
		 * 		programi qe vepron ndodhet ne dosjen
		 *      prind te dosjes user
		 *      
		 * c:/users/program.exe				programi qe 
		 * 									perdor path-in
		 * 									relativ
		 * 
		 * 
		 * Nese programi ndodhet ne path
		 * 
		 * 	c:/users/program/dosje/program.exe
		 * 
		 * dhe file ndodhet ne path
		 * 
		 * 	c:/users/user/desktop/info.txt
		 * 
		 * kush eshte path relativ qe programi
		 * perdor per te aksesuar kete file?
		 * 
		 * ../../../user/desktop/info.txt
		 * 
		 * 
		 * */
		
		Path path = Paths.get("c:/users/"
				+ "user/desktop/info.txt");
		
		System.out.println(path.getNameCount());
		System.out.println(path.getRoot());
		System.out.println(path.getName(1));
		
		
	}

}






