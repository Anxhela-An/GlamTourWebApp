package lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Zoti Tedi");
		list.add("Zoti Klaus");
		list.add("Zoti Jorid");
		
		/**
		 *	Si te perdor te gjithe
		 *  elementet? Si te kaloj tek
		 *  secili nga elementet e nje
		 *  Collection? 
		 **/
		
		//1. foreach
		
		for(String element : list) {
			System.out.println(element);
		}
		
		/**
		 * i viziton elementet sipas radhes
		 * "natyrale" qe struktura i ruan
		 * te dhenat
		 * KUJDES!!! Ne ndonje nga strukturat
		 * 			 e collections mund te mos
		 * 			 kene radhe te elementeve.
		 * 			 Set eshte nje bashkesi, ku
		 * 			 elementet e vendosur nuk kane
		 * 			 nje radhe.
		 **/
		
		System.out.println();
		
		//2. nepermjet iterator-eve
		
		/***
		 *	Iterator eshte nje objekt i cili kalon
		 *  nga njeri element (nga elementi te cilin
		 *  				   po perdorim) tek
		 *  elementi pasues. Fillimisht kur krijohet
		 *  merr ne perdorim elementin e pare.
		 *  Radha e perdorimit te elementeve eshte
		 *  sipas rendit "natyral" te struktures. 
		 *  Iterator eshte interface i cili eshte
		 *  i implementuar ne secilen nga strukturat
		 *  dhe objekt te tij mund ta marrim ne perdorim
		 *  nepermjet metodes iterator.
		 **/
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		/**
		 *	Referim metode (method reference) 
		 * 	https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
		 *
		 *	Ben te mundur qe zhvillimi i nje metode
		 * te referohet si argument ne nje metode, qe
		 * ka si referim nje interface funksionaliteti
		 * me metode qe ka te njejtin tip dhe te njejten
		 * liste parametrash si metoda qe po referohet.
		 * Interface qe perdor metoda forEach eshte 
		 * interface Consumer, i cili ka metoden accept,
		 * metode me tip void, me liste parametrash 
		 * T o, pra nje objekt.
		 **/
		
		System.out.println();
		
		Print printer = new Print();
		
		list.forEach(printer::print);
		
		Sum sumer = new Sum();
		
		list.forEach(sumer::sumer);
		
		System.out.println(sumer.getData());
		
	}

}