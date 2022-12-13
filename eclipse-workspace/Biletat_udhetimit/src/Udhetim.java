//nisim me klasen udhetim duke percaktuar 3 variablat kyce: nisje, destinacion dhe cmimi
public class Udhetim {
	
    private String nisja;

    private String destinacion;    
    
    private Double cmimi;

    public Udhetim( String nisja, String destinacion, Double cmimi) {  //konstruktori i klases
        this.destinacion = destinacion;                                //inicializimi i variablave
        this.nisja = nisja;
        this.cmimi = cmimi;
    }

    public String getNisja() {
        return nisja;
    }
    
    public Double getCmimi() {     //nuk duhet nje metode set sepse te dhenat mbeten statike pas plotesimit te rezervimit me te dhenat fillestare
        return cmimi;
    }

    public String getDestinacion() {
        return destinacion;
    }

    
}

