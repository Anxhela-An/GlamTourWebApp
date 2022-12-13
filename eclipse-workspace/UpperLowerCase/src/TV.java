
public class TV 
{ int kanali, niveliVolumit;
  boolean eshteNdezur;
  
  public TV()
  {
	  kanali=1;
	  niveliVolumit=1;
	  eshteNdezur= false;
  }
  
  public void ndezTV()
  {
	  eshteNdezur = true;
  }
  public void fikTv()
  {
	  eshteNdezur= false;
  }
  public void percaktoKanalin(int kanaliRi)
  {
	  if(eshteNdezur&&(kanali>=1&&kanali<=100))
	  {
		  kanali=kanaliRi;
	  }
  }
  public void percaktoVolumin(int volumiRi)
  {
	  if(eshteNdezur&&(niveliVolumit>=1&&niveliVolumit<=25))
	  {
		  niveliVolumit=volumiRi;
	  }
  }
  public void kaloNeKanalinPasardhes()
  {
	  if(eshteNdezur)
	  {
		  kanali = kanali%100 +1;
	  }
  }
  public void kaloNeKanalinParaardhes()
  {
	  if(eshteNdezur)
	  {
		  kanali--;
	  }
	  if(kanali<1)
	  { kanali=100;
		  
	  }
  }
  public void rritVolumin()
  {
	  if(eshteNdezur&&(niveliVolumit<25))
	  {
		  niveliVolumit++;
	  }
  }
  public void ulVolumin()
  {
	  if(eshteNdezur&&(niveliVolumit>1))
	  {
		  niveliVolumit--;
	  }
  }
  public int tregoVolumin()
  {
	  return niveliVolumit;
  }
  public int tregoKanalin()
  {
	  return kanali;
  }
	
}

