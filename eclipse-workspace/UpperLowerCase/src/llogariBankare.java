import java.util.Date;

public class llogariBankare 
{ private int id;
  private double balanca;
  private static double vleraEInteresitVjetor;
  private Date dataKrijimit;
  
  public llogariBankare()
  {
	  id=0;
	  balanca=0; 
  }
  public llogariBankare(int id, double balanca,double interesi)
  {
	  this.id=id;
	  this.balanca=balanca;
	  vleraEInteresitVjetor=interesi;
  }
  public int getId()
  {
	  return id;
  }
  public void setId(int id)
  {
	  this.id=id;
  }
  public double getBalanca()
  {
	  return balanca;
  }
  public void setBalanca(double balanca)
  {
	  this.balanca=balanca;
  }
  public double getInteresi()
  {
	  return vleraEInteresitVjetor;
  }
  public void setInteresi(double interes)
  {
	  vleraEInteresitVjetor = interes;
  }
  public String getDataKrijimit()
  {   Date dataKrijimit = new Date();
      
	  return dataKrijimit.toString();
  }
  public double getVlerenEInteresitMujor()
  {
	  return balanca*(vleraEInteresitVjetor/12);
  }
  public void terhiqPara(int terheqje)
  {   if(balanca>=terheqje)
	  {balanca-=terheqje;}
  else
  {
	  System.out.println("Ju nuk keni para mjaftueshem per te terhequr!");
  }
	  
  }
  public void depozitoPara(int depozite)
  {
	  balanca+=depozite;
  }
  

}
