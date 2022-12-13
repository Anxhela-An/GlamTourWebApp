package lesson6;

public class NumerCelular 
{
	private Info<String,String>operatori;
	private Info<String,String>shteti;
	private String numriSim;
	
	public NumerCelular()
	{
		this(null,null,null,null,null);
	}
	public NumerCelular(String emriShtetit,String prefiksi,String emriOperatorit,String nrOperatorit,String nrSim)
	{
		shteti = new Info<String,String>(emriShtetit,prefiksi);
		operatori = new Info<String,String>(emriOperatorit,nrOperatorit);
		this.numriSim=numriSim;
		
	}
	public Info<String,String>getOperator()
	{
		return operatori;
	}
	public void setOperatori(Info<String,String>operatori)
	{
		this.operatori=operatori;
	}
	public Info<String,String>getShteti()
	{
		return shteti;
	}
	private static class Info<T1,T2>
	{
		private T1 t1;
		private T2 t2;
		public Info(T1 t1,T2 t2)
		{
			this.t1=t1;
			this.t2=t2;
		}
		public T1 getT1()
		{
			return t1;
		}
		public void setT1(T1 t1)
		{
			this.t1=t1;
		}
		public void sett2(T2 t2)
		{
			this.t2=t2;
		}
	}
	
	
	

}
