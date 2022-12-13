package lesson6.inner;

import java.util.GregorianCalendar;

import lesson2.Address;
import lesson2.Person;
import lesson4.Condition;

public class Example1 {
	
	/**
	 *	Klasat e nderfutura (inner), jane klasa qe
	 *  kodohen ne brendesi te klasave ekzistuese.
	 *  
	 *  Ndodh qe ne kodimin e klasave, nje klase
	 *  te sherbeje vetem per nje rast te caktuar
	 *  ne kod. Per shembull, mund te te krijoje
	 *  vetem nje objekt.
	 *  
	 *  Ka hapesire qe te duket e tepert, qe per
	 *  kaq te krijosh nje file, etj.
	 *  Krijimi i shume fileve e ben te renduar
	 *  hapesiren e projektit.
	 *  
	 *  Klasat brenda njera - tjetres krijohen 
	 *  me synimin qe te zvogelojne numrin e 
	 *  file-ve te krijuara si dhe per te rritur
	 *  enkapsulimin e kodit.
	 *  
	 *  Klasat e nderfutura kodohen sipas modelit:
	 *  
	 *  	klase e jashtme{
	 *  		...
	 *  		klase te nderfutur{
	 *  			...
	 *  		}
	 *  		...
	 *  	}
	 *  	
	 * 	Klasat e nderfutura ndahen ne dy lloje:
	 * 
	 * 		1. static-e
	 * 
	 * 			krijohen sipas modelit:
	 * 
	 * 				class OuterClass{
	 * 					public static class InnerStaticClass{
	 * 
	 * 					}
	 * 				}
	 * 
	 * 			Klasa OuterClass dhe klasa InnerStaticClass
	 * 			nuk formojne ndonje raport te vecante
	 * 			midis tyre.	 Keto klasa jane si te ishin
	 * 			koduar si dy klasa normale, pa lidhje me
	 * 			njera-tjetren:
	 * 
	 * 				class OuterClass{}
	 * 				class InnerStaticClass{}	
	 * 
	 * 			Asnjera prej klasave nuk mund te 
	 * 			perdore antaret e klases tjeter.
	 * 			Klasa e nderfutur statike mund
	 * 			te perdore antaret statik te klases
	 * 			se jashtme. 	
	 * 
	 * 		2. jo static-e, klasa te brendshme
	 * 
	 * 			klasa qe kodohen si antar te objektit
	 * 			te klases se jashtme
	 * 
	 * 			modeli i kodimit:
	 * 
	 * 				public class OuterClass{
	 * 					public class InnerClass{
	 * 
	 * 					}
	 * 				}
	 * 
	 * 			Krijohet nje raport ndermjet ketyre
	 * 			klasave, nga fakti qe klasa e nderfutur
	 * 			vepron mbi objekt te klases se jashtme.
	 * 
	 * 			Nje objekt i klases se brendshme mund
	 * 			te krijohet vetem pasi eshte krijuar
	 * 			nje objekt i klases se jashtme.
	 * 
	 * 			Keto klasa kodohen kudo ku ka trup kodi
	 * 			brenda klases se jashtme ... per shembull
	 * 			brenda nje metode, brenda nje strukture
	 * 			perseritese, apo strukture perzgjedhese.
	 * 
	 * 			Klasat e nderfutura jo static-e nuk mund
	 * 			te permbajne ne trupin e tyre antar
	 * 			static, pervec konstanteve.
	 * 		
	 * 			Ndahen ne dy lloje:
	 *  
	 *  			1. lokale
	 *  			2. anonime
	 *  
	 *  					Klasat anonime jane klasa
	 *  					qe nuk kane emer te tyrin.
	 *  					Perdorin emer te nje klase
	 *  					apo interface ekzistues.
	 *  					Kur perodret nje klase,
	 *  					nepermjet klases anonime
	 *  					krijohet nje nenklase, e cila
	 *  					ka synim te ndryshoje sjelljen
	 *  					e ndonje metode ekzistuese.
	 *  					Kur perdoret nje interface,
	 *  					synohet te krijohet objekt
	 *  					i interface-it. Kjo behet
	 *  					nepermjet klases anonime duke
	 *  					zhvilluar te gjitha metodat
	 *  					abstrakte te interface-it.
	 *  
	 *  					Klasa anonime kodohet ne formen
	 *  					e nje shprehjeje, ku ne te njejten
	 *  					kohe krijohet edhe klasa edhe 
	 *  					objekti i saj.
	 *  
	 *  					Krijohet vetem nje objekt.
	 *  
	 *  					Shprehja eshte e formes:
	 *  
	 *  						Klase ref = new Klase(argumenta){
	 *  							@Override
	 *  							public String toString(){
	 *  								return "haha";
	 *  							}
	 *  						};
	 *  
	 *  						Interface ref = new Interface(){
	 *  							@Override
	 *  							method
	 *  						}
	 *  
	 **/
	
	public static void main(String[] args) {
		
		PhoneNumber p = new PhoneNumber("Telecom", 68, 
										"Vodafone", 69,
										3433233);

		System.out.println(p.getSimNumberAsString());
		System.out.println(p.getSimNumberOperatorName());
		System.out.println(p.getSimNumberOperatorNumber());
		System.out.println(p.getOperatorName());
		System.out.println(p.getOperatorNumber());
		
		Person person = new Person(new GregorianCalendar()) {
			@Override
			public String getName() { 
				return super.getName().toUpperCase();
			}
			@Override
			public Address getAddress() { 
				return null;
			}
		};
		
		Condition c = new Condition() {
			@Override
			public boolean test(int n1, int n2) { 
				return n1 < n2;
			}
		};
		
		
	}

}
