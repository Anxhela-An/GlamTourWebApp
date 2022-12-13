public class Rezervim 
{
	
    private String emriBleresit;         //deklarohet emri i bleresit te biletes si private

    private String mbiemriBleresit;     

    private int nrPersonave;          

    private boolean isOneWay;           //variabel boolean qe by default eshte vetem vajtje(pa kthim)

    private Udhetim udhetim;           //variabli udhetim prej klases Udhetim (non-primitive data type)

   public Rezervim(String emriBleresit, String mbiemriBleresit, int nrPersonave, boolean isOneWay, Udhetim udhetim) {
        this.emriBleresit = emriBleresit;
        this.mbiemriBleresit = mbiemriBleresit;
        this.nrPersonave = nrPersonave;
        this.udhetim = udhetim;
        this.isOneWay = isOneWay;   
    }
    
    
  //metodat per marrjen e te dhenave nga perdoruesi (emri, mbiemri, numri, tipi, dhe udhetim-permban nisjen, destinacionin dhe cmimin)
    public String getEmriBleresit() {   
        return emriBleresit;
    }

    public String getMbiemriBleresit() {
        return mbiemriBleresit;
    }

    public int getNrPersonave() {
        return nrPersonave;
    }

    public boolean isOneWay() {
        return isOneWay;
    }

    public Udhetim getUdhetim() {
        return udhetim;
    }

    public String getFature() {    //fatura e tipit string e cila do te afishoje te dhenat e bleresit se bashku me cmimin
        String fature = "";        //fillimisht e inicializojme si boshe sepse nuk permban asnje te dhene(para rezervimit)
        fature += "Emri i bleresit " + getEmriBleresit() + "\n";
        fature += "Mbiemri i bleresit " + getMbiemriBleresit() + "\n";
        fature += "Kostja e udhetimit " + llogaritKoston();

        return fature;
    }

    public String getDetaje() {   //shtojme detaje qe duam ti afishojme
        return "Tipi i udhetimit= " + (isOneWay() ? "Eshte oneWay" : "Eshte round trip"); //nese tipi i udhetimit eshte vajtje apo vajtje-ardhje
    }

    private double llogaritKoston() { 
        if (isOneWay()) {
            return getUdhetim().getCmimi() * getNrPersonave(); 
        }

        return getUdhetim().getCmimi() * getNrPersonave() * 2;  //nese eshte vajtje ardhje, kostoja do te jete dyfish (*2)
    }

    

}