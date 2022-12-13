
public class TestoKlasenTV 
{ public static void main(String[]args)
	{
	   TV tv1 = new TV();
	   TV tv2= new TV();
	   tv1.ndezTV();
	   System.out.println("Televizori i pare u ndez.");
	   System.out.println("Televizori i dyte eshte i fikur.");
	   System.out.println("Televizori i pare po transmeton ne kanalin: "+ tv1.tregoKanalin()+".");
	   System.out.println("Volumi i tij eshte: "+tv1.tregoVolumin()+".");
	   tv1.kaloNeKanalinPasardhes();
	   System.out.println("U ndryshua kanali!");
	   System.out.println("Televizori po transmeton ne kanalin: "+tv1.tregoKanalin()+".");
	   tv1.rritVolumin();
	   System.out.println("U ndryshua volumi!");
	   System.out.println("Volumi i televizorit eshte: "+tv1.tregoVolumin()+".");
	   tv1.percaktoKanalin(50);
	   System.out.println("U ndryshua kanali!");
	   System.out.println("Televizori po transmeton ne kanalin: "+ tv1.tregoKanalin());
	   tv1.percaktoVolumin(10);
	   System.out.println("U ndryshua volumi!");
	   System.out.println("Volumi i televizorit eshte: "+tv1.tregoVolumin()+".");
	   tv1.fikTv();
	   System.out.println("Telezivori i pare u fik.");
	   tv2.ndezTV();
	   System.out.println("Televizori i dyte u ndez.");
	   System.out.println("Televizori po transmeton ne kanalin: "+tv2.tregoKanalin()+".");
	   System.out.println("Volumi i tij eshte: "+tv2.tregoVolumin()+".");
	   tv1.ndezTV();
	   System.out.println("Televizori i pare u ndez.");
	   System.out.println("Televizori i pare po transmeton ne kanalin: "+ tv1.tregoKanalin()+".");
	   System.out.println("Volumi i tij eshte: "+tv1.tregoVolumin()+".");
	   tv2.fikTv();
	   System.out.println("Telezivori i dyte u fik.");
	   tv1.fikTv();
	   System.out.println("Telezivori i pare u fik.");
	}

}
