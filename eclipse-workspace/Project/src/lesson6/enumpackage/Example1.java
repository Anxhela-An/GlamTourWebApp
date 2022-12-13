package lesson6.enumpackage;

public class Example1 {

	public static void main(String[] args) {

		/**
		 *	Enumeration eshte nje strukture qe
		 *  projekton krijimin e objekteve me
		 *  vlera te kufizuara per cilesite e 
		 *  tyre. Vlerat jane te fundme, te 
		 *  perbera nga konstante qe i 
		 *  percaktojme ne.
		 *  Per shembull, vlera te fundme jane
		 *  emertimet e diteve te javes.
		 *  Enumeration ne gjuhen Java eshte nje
		 *  strukture me vete, e shprehur nepermjet
		 *  fjales kyce enum. Ngjason me klasen,
		 *  por edhe eshte dicka tjeter.
		 *  Fjala kyce enum perdoret sipas modelit:
		 *  
		 *   public enum Name {
		 *   	
		 *   }
		 *   
		 *   nuk mund te besh extends
		 *   nuk mund te besh implements
		 *   
		 *   nuk eshte nenklase direkte e Object
		 *   eshte "nenklase" e Enum, qe
		 *   eshte nje enumeration ekuivalent
		 *   me qellimet e klases Object ne
		 *   trashegimine e klasave
		 *   
		 *   Enumeracioni per cilesite qe do te
		 *   shprehe krijon cdo objekt te mundshem
		 *   ne nje liste konstantesh te deklaruara
		 *   brenda struktures.
		 *   
		   
						 
				public enum Gender {
					
					MALE, FEMALE, OTHER;
				
				}
	
			 Konstantet e deklaruara qe te gjitha
			 kane tipin e enumeracionit qe percaktojne.
			 Ne enumracion vendosen te gjithe vlerat
			 e mundshme qe mund te shprehen per kete
			 tip.
			 
			 Jane objekte qe krijohen njeheresh ne
			 kujtese, qe ne momentin e perdorimit te
			 konstantes se pare te ketij tipi.
			 Keto konstante krijohen vetem nje here.
			 
			 Enumeracioni mund te permbaje atribute.
			 Secili nga atributet vepron si vlere
			 final, e pandryshueshme.
			 
			 Atributeve ju jepet vlere nga konstruktori.
			 Konstruktori perdoret nga konstantet e listuara.

		 *   
		 **/
		
		Gender gender = Gender.MALE;

		System.out.println(gender.getSymbol());
		System.out.println(gender.getMinWeightIndex());
		System.out.println(gender.getMaxWeightIndex());

	}

}
