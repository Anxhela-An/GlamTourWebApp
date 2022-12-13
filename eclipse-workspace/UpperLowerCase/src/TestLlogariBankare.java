public class TestLlogariBankare 
{ public static void main(String[]args)
	{
	  llogariBankare b = new llogariBankare(1122,2000000,0.45);
	  b.terhiqPara(2500000);
	  b.depozitoPara(300000000);
	  System.out.println("Balanca eshte: "+b.getBalanca());
	  System.out.println("Interesi mujor eshte: "+ b.getVlerenEInteresitMujor());
	 System.out.println("Data e krijimit : "+b.getDataKrijimit());
	}

}
