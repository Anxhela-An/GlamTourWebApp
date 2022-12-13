package lesson3;
public class Example2 
{/**
	 * Per punonjes te ndryshem te nje biznesi
	 * do ndertohet nje metode qe do gjeje 
	 * punonjesin me te vjeter, nga 3 punonjes
	 * te ndryshem te dhene. 
	 * Punonjesit mund te jene:
	 * 
	 * 	Employee			1
	 * 	SecurityGuard		2
	 * 	Cashier				3
	 * 	Finance				4 
	 * ...
	 * 	30 lloje te ndryshem punonjesish
	 * 
	 * 1. Si do e kete tipin metoda?
	 * 		Metoda mund te ktheje secilin nga
	 * 		30 tipet e dhene. A mund te kete
	 * 		metoda 30 tipe?
	 * 2. Cfare do marre ne listen e parametrave?
	 * 		Ka vetem 3 parametra. Fatkeqesisht 3
	 * 		nuk mjaftojne per 30, keshtu qe 
	 * 		do e rikrijoj metoden disa here,
	 * 		deri kur cdo kombinim i mundshem 
	 * 		te jete shprehur. Miliarda kombinime.
	 * 
	 * */
	private Employee employee1;
	private Employee employee2;
	private Employee employee3;
	public Example2(Employee e1,Employee e2,Employee e3)
	{    employee1=e1;
	     employee2=e2;
	     employee3=e3;
	}

	public Employee get() 
     {  if((employee1.getBirthdateCopy().compareTo(employee2.getBirthdateCopy())<0)
         &&(employee1.getBirthdateCopy().compareTo(employee3.getBirthdateCopy())<0))
      { return employee1;

      }
       else if(employee2.getBirthdateCopy().compareTo(employee3.getBirthdateCopy())<0)
       {
       return employee2;
       } 

       return employee3;
       }

	//...
	/**
	 * Polimorfizmi eshte nje cilesi e gjuhes Java,
	 * e cila lejon qe variabla te deklaruar me tipin
	 * e superklases te mund te ruajne objekte te 
	 * nenklasave te saj.
	 * Per shembull, klasa Employee eshte superklase
	 * e klasave SecurityGuard, Cashier, Finance, etc.
	 * Variabla te kesaj klase mund te ruajne objekte
	 * te te gjithe klasave te listuara.
	 * 
	 * 	Employee employee1 = new SecurityGuard();
	 * 	Employee employee2 = new Cashier();
	 * 	Employee employee3 = new Finance();
	 * 
	 * Ne shprehje te tilla, perdoren dy tipe te 
	 * ndryshme. 
	 * Tipi i superklases emertohet supertip.
	 * Tipi i nenklases emertohet nentip.
	 * Tipi me te cilin deklarohet variabli 
	 * emertohet tip i deklaruar.
	 * Tipi me te cilin krijohet objekti
	 * emertohet tip i percaktuar.
	 * 
	 * Cfare antaresh mund te perdoren nepermjet
	 * variablit te references?
	 * Mund te perdoret cdo gje qe eshte antar
	 * i njohur ne tipin e deklaruar.
	 * 
	 * Nese nje metode eshte bere override ne 
	 * disa klasa te nje vargu trashegimie,
	 * cila prej tyre perdoret kur therritet
	 * nepermjet nje variabli reference?
	 * Supozojme sikur klasat
	 * K1, K2, K3, K4 dhe K5 zgjerojne
	 * njera tjetren, ku K1 superklase e K2,
	 * K2 superklase e K3 ... K4 superklase e K5.
	 * Metoda toString eshte zhvilluar te te gjitha.
	 * 
	 * K1 object = new K4();
	 * 
	 * String str = object.toString();
	 * 
	 * Kerkimi per zbatimin e nje metode te 
	 * therritur fillon nga tipi i percaktuar,
	 * nga klasa me te cilen eshte krijuar objekti.
	 * Nqs metoda gjendet aty e zbaton ate.
	 * Nqs jo, e kerkon te superklasa direkte e saj.
	 * 
	 * 
	 * 
	 * */


}
