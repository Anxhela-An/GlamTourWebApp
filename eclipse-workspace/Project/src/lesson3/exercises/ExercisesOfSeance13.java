package lesson3.exercises;

import java.util.ArrayList;

class Counter{
	int counter;
	String string;
	public Counter(String string) {
		this.string = string;
		counter = 1;
	}
}

public class ExercisesOfSeance13 
{
	/**
	Bej nje metode qe merr si argument
	 * nje numer te plote dhe gjeneron
	 * listen me shifrat e tij.
	 * Per shembull, nese input eshte
	 * numri 124223854 lista ka permbajtjen
	 * [1, 2, 4, 2, 2, 3, 8, 5, 4]
	 * */
	public static ArrayList<Byte> CreateList(int n) 
	{ ArrayList<Byte>a = new ArrayList<Byte>();    
	  while(n!=0) 
	  {                                                                         
		a.add(0,(byte)(n%10));
		n/=10;                                     
	  }
	
	return a;      
	}
	
	/**
	 * Bej nje metode qe merr si argument
	 * nje karakter me vleren e nje shifre numerike
	 * dhe kthen vleren numerike si numer int.
	 * byte shifer = convert('1');
	 * sout(shifer);	//1
	 * */
	public static int convert(char b) {
		if(!Character.isDigit(b)) {
			return 0;
		}
		return b - '0';
	}
	

	/**
	 * instanceof
	 * cast per objekte
	 * 
	 * Bej nje metode qe merr si argument
	 * nje liste me objekte dhe kthen si
	 * rezultat listen qe permban vetem stringjet
	 * e listes se dhene ne argument.
	 * */
	public static ArrayList<String>Lista(ArrayList<Object>objektet)
	{  
		ArrayList<String>s = new ArrayList<String>();
		for(Object o:objektet)
		{
			if(o instanceof String)
			{
				s.add((String) o);
			}
		}
	return s;
		
	}
	
	/**
	 * Bej nje metode qe merr si parameter
	 * nje vektor me stringje dhe kthen
	 * listen qe ruan te gjithe stringjet
	 * me gjatesi te barabarte me stringun
	 * me te gjate te ruajtur ne vektorin 
	 * e dhene.
	 * 
	 * [ "hejj", "uf", "buf", "cuf","hola"]
	 * ["hola", "hejj"]
	 * 
	 **/
	public static ArrayList<String>Stringje(String[]str)
	{  ArrayList<String>s = new ArrayList<String>();
	   String max = str[0];
	   for(int i=1;i<str.length;i++)
	   {  if(str[i].length()>max.length())
	   { max = str[i];
		   
	   }
	   for(int j=0;j<str.length;j++)
	   {
		   if(str[j].length()==max.length())
		   {
			   s.add(str[j]);
		   }
	   }
		   
	   }
		return s;
	}
	
	/**
	 * Bej nje metode qe merr si parameter dy lista
	 * me stringje dhe kthen listen qe ka stringjet
	 * e listes se pare qe nuk ndodhen te e dyta dhe
	 * ato qe jane te e dyta dhe nuk gjenden tek e
	 * para.
	 * */
	public static ArrayList<String>
	listString(ArrayList<String> list1,
			   ArrayList<String> list2){
	ArrayList<String> list3 = 
				new ArrayList<String> ();
	for(String v : list1) {
		if(!list2.contains(v)) {
			list3.add(v);
		}
	}
	for(String v : list2) {
		if(!list1.contains(v)) {
			list3.add(v);
		}
	}
	return list3;
}
 
	/**
	 * Bej nje metode qe merr si argument nje
	 * liste me stringje dhe heq prej saj te gjithe
	 * stringjet qe nuk kane zanore.
	 **/
	public static void PaZanore(ArrayList<String>lista)
	{    
	     for(int i=0;i<lista.size();i++)
	     { if(!Zanore(lista.get(i)))
	     {  lista.remove(i);
	    	 i--;
	     }
	    	 
	     }
	}

	
  public static boolean Zanore(String s)
  {
	 s=s.toLowerCase();
   for(int i=0;i<s.length();i++)
   {
	   if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y')
	   {
		   return true;
	   }
	  
   }
   return false;
	  
  }
  
  /***
	 * Bej nje metode qe merr si parameter nje
	 * liste me lista me stringje, dhe kthen
	 * listen qe ruan me shume elemente me permbajtje
	 * zanoresh.
	 **/	
  
  public static ArrayList<String> 
	listaMeMeShumeStringjeMeZanore
		(ArrayList<ArrayList<String>> str){
ArrayList<String> result = str.get(0);
int max = numriStringjeveMeZanore(result);
for(ArrayList<String> list : str) {
	int sasia = numriStringjeveMeZanore(list);
	if(sasia > max) {
		max = sasia;
		result = list;
	}
}
return result;
}

private static int numriStringjeveMeZanore
		(ArrayList<String> list) {
int sasia = 0;
for(String s : list) {
	if(Zanore(s)) {
		sasia++;
	}
}
return sasia;
}

/**
 * Bej nje metode qe merr si argument
 * nje matrice me stringje dhe kthen
 * stringun qe ndodhet me shpesh ne te.
 * */
public static String mostUsed (String[][] matrix) {
	ArrayList<Counter> list = 
			new ArrayList<Counter>();
	for(String [] a : matrix) {
		for(String s : a) {
			count(list, s);
		}
	}
	return max(list);
}

private static String max(ArrayList<Counter> list) {
	Counter max = list.get(0);
	for(Counter c : list) {
		if(c.counter > max.counter) {
			max = c;
		}
	}
	return max.string;
}


private static void count(ArrayList<Counter> list, 
						  String s) {
	for(Counter c : list) {
		if(c.string.equals(s)) {
			c.counter++;
			return;
		}
	}
	list.add(new Counter(s));
}



public static void main(String[] args) {

	String[][] s = {
			{"Noizy", "eshte", "Noizy"},
			{"Klausi", "eshte", "Klausi OTR me zemer"},
			{"Joridi", "eshte", "Joridi"},
			{"Festa", "eshte", "festive"},
			{"Tedi", "eshte", "lsist"},
			{"E", "vertete", "eshte", "cdo", "fjale"}
			};
	
	System.out.println(mostUsed(s));
	
}

}