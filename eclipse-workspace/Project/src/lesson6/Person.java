package lesson6;

//Rast studimi>> Krijimi i  nje programi qe vepron si nje rrjet social per nje sherbim te paracaktuar. Deshirojme te
//krijojme nje interface funksionaliteti qe i lejon administratorit te manipuloje disa veprime, si per shembull, te 
//dergoje mesazhe te disa anetare qe plotesojne ndonje kriter te vecante.

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Person 
{ 
	public enum Gjinia
	{
		MASHKULL, FEMER
	}
	private String emri;
	private GregorianCalendar dataLindjes;
	private Gjinia gjinia;
	private String adresaEmailit;
	
	public Person( String emri, Gjinia ginia, GregorianCalendar dataLindjes, String adresaEmailit)
	{ 
		if(emri!=null)
		{
			this.emri=emri;
			this.gjinia=gjinia;
			this.dataLindjes=dataLindjes;
			this.adresaEmailit=adresaEmailit;
		}
		else
		{
			this.emri="i papercaktuar";
			this.dataLindjes = new GregorianCalendar();
			this.gjinia=Gjinia.MASHKULL;
			this.adresaEmailit = "e papercaktuar";
		}
	}
	public int getMosha()
	{
		return new GregorianCalendar().get(Calendar.YEAR) - dataLindjes.get(Calendar.YEAR);  
	}
	public String getEmri()
	{
		return emri;
	}
	public void setEmri(String emri)
	{
		if(emri!=null)
		{
			this.emri=emri;
		}
	}
	public GregorianCalendar getDataLindjes()
	{
			return dataLindjes;
	}
	public void setDataLindjes(GregorianCalendar dataLindjes)
	{
		if(dataLindjes!=null)
		{
			this.dataLindjes=dataLindjes;
		}
	}
	public Gjinia getGjinia()
	{
		return gjinia;
	}
	public void setGjinia(Gjinia gjinia)
	{
		this.gjinia=gjinia;
	}
	public String getAdresaEmailit()
	{
		return adresaEmailit;
	}
	public void setAdresaEmailit(String adresaEmailit)
	{
		if(adresaEmailit!=null)
		{
			this.adresaEmailit = adresaEmailit;
		}
	}
	@Override
	public String toString() {
		return "Person [emri=" + emri + ", dataLindjes=" + dataLindjes + ", gjinia=" + gjinia + ", adresaEmailit="
				+ adresaEmailit + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresaEmailit == null) ? 0 : adresaEmailit.hashCode());
		result = prime * result + ((dataLindjes == null) ? 0 : dataLindjes.hashCode());
		result = prime * result + ((emri == null) ? 0 : emri.hashCode());
		result = prime * result + ((gjinia == null) ? 0 : gjinia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (adresaEmailit == null) {
			if (other.adresaEmailit != null)
				return false;
		} else if (!adresaEmailit.equals(other.adresaEmailit))
			return false;
		if (dataLindjes == null) {
			if (other.dataLindjes != null)
				return false;
		} else if (!dataLindjes.equals(other.dataLindjes))
			return false;
		if (emri == null) {
			if (other.emri != null)
				return false;
		} else if (!emri.equals(other.emri))
			return false;
		if (gjinia != other.gjinia)
			return false;
		return true;
	}
	

}
