import javax.swing.*;   
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    //KLASA QE IMPLEMENTON METODAR E GUI 
     import static javax.swing.JOptionPane.ERROR_MESSAGE;  //Metode e gatshme e librarise javax.swing.JOptionPane kur duam te tregojme mesazh gabimi
     public class Bileta_main extends JFrame {                
     
     private Rezervim rezervim;

	//lista permban nisjet, destinacionet dhe cmimet respektive
      private static final List<Udhetim> UDHETIMET_E_LEJUARA = Arrays.asList(
            new Udhetim("Milan", "Tirana", 100.99),
            new Udhetim("Tirana", "Rome", 130.99),
            new Udhetim("Tirana", "Athens", 100.99),
            new Udhetim("Athens", "Frankfurt", 200.99),
            new Udhetim("Paris", "Tirana", 150.99),
            new Udhetim("Lisbon", "Nice", 106.99)
    );
 
    public Bileta_main() {                          
        super("Bileta_main"); 
        setVisible(true);                        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setSize(700, 500);                     
        JPanel pane = new JPanel();           
        setContentPane(pane);
        inicializoFormen();                 
    }

    

    public void inicializoFormen() {
        JPanel paneli = new JPanel();  

        paneli.setLayout(new GridLayout(5, 4)); //reshtat dhe kolonat

        // Emri
        paneli.add(new JLabel("Emri"));          //Krijohet etiketa e emertuar "emri"
        JTextField emriInput = new JTextField(); //vendosim me text-field emrin e perditesuar gjate plotesimit te biletes
        paneli.add(emriInput);                   //merret inputi per te printuar faturen
 
        // Mbiemri
        paneli.add(new JLabel("Mbiemri"));
        JTextField mbiemriInput = new JTextField();
        paneli.add(mbiemriInput);

        // Nisja
        paneli.add(new JLabel("Nisja"));
        JComboBox<String> nisjaInput = new JComboBox<>(getNisjet()); //perdorim combo-box per perzgjedhjen e vendeve nga do te nisemi
        paneli.add(nisjaInput);

        // Destinacion
        paneli.add(new JLabel("Destinacioni"));
        JComboBox<String> destinacioniInput = new JComboBox<>(getDestinacionet());   
        paneli.add(destinacioniInput);

        // Tipi i udhetimit
        ButtonGroup grupimiRadioButonave = new ButtonGroup(); // Nevojitet qe vetem nje radio button te selektohet
        JRadioButton oneWay = new JRadioButton("One way");
        JRadioButton roundTrip = new JRadioButton("RoundTrip");
        grupimiRadioButonave.add(oneWay);
        grupimiRadioButonave.add(roundTrip);

        paneli.add(new JLabel("Tipi i udhetimit"));
        paneli.add(oneWay);
        paneli.add(roundTrip);
        paneli.add(new JLabel("")); // Per te mbushur njesine bosh ne menyre qe te strukturohen te dhenat e shfaqura

        // Nr i personave
        paneli.add(new JLabel("Nr i personave"));
        JComboBox<Integer> nrIPersonaveInput = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        paneli.add(nrIPersonaveInput);

        paneli.add(new JLabel("")); 
        paneli.add(new JLabel(""));

        // Butonat
        JButton rezervo = new JButton("Rezervo");   //butoni per te rezervuar udhetimin pas plotesimit te te dhenave
        JButton afishoDetaje = new JButton("Afisho Detaje");
        JButton pastro = new JButton("Clear");                //pastrohen te dhenat per tu vendosur te dhena te reja

        rezervo.addActionListener(new ActionListener() {     //Eventi(ngjarja) qe shfaqet kur klikohet butoni rezervo
           
            public void actionPerformed(ActionEvent actionEvent) {  //metoda e ActionListener

                String emri = emriInput.getText();
              
                if (emri == null || emri.isEmpty()) { 
                    afishoErrorMessage("Ju lutem vendosni emrin!"); 
                    return;
                }
                
                	 
                String mbiemri = mbiemriInput.getText();   
                if(mbiemri==null||mbiemri.isEmpty())
                {
                	afishoErrorMessage("Ju lutem vendosni mbiemrin!");
                	return;
                }
                String nisja = (String) nisjaInput.getSelectedItem();    //perzgjedhim nga lista e krijuar me ComboBox
                String destinacion = (String) destinacioniInput.getSelectedItem();
                int nrPersonave = (int) nrIPersonaveInput.getSelectedItem();
                 
                
                boolean isOneWay = oneWay.isSelected();

                Udhetim udhetim = merrUdhetiminSipasParametrave(nisja, destinacion);

                if (udhetim == null) { // TODO check other validations
                    afishoErrorMessage("Udhetimi i kerkuar nuk ofrohet per momentin");
                    return;
                }

                rezervim = new Rezervim(emri, mbiemri, nrPersonave, isOneWay, udhetim); //krijojme nje instance

                afishoSuccessMessage(rezervim.getFature());
            }
        });


        pastro.addActionListener(new ActionListener() { // Eventi kur klikohet butoni pastro
         
            public void actionPerformed(ActionEvent actionEvent) {
                emriInput.setText("");
                mbiemriInput.setText("");
                grupimiRadioButonave.clearSelection();
            }
        });

        afishoDetaje.addActionListener(new ActionListener() { // Eventi kur klikohet butoni afishoDetaje
        
            public void actionPerformed(ActionEvent actionEvent) {
                if (rezervim == null) {
                    afishoErrorMessage("Nuk ka rezervim te bere");
                    return;
                }
                afishoSuccessMessage(rezervim.getDetaje());
            }
        });

        paneli.add(rezervo);
        paneli.add(afishoDetaje);
        paneli.add(pastro);

        add(paneli); // Shto ne jFrame
    }
    //llogarisim udhetimin nisje-destinacion, nese eshte i lejuar apo jo
    private Udhetim merrUdhetiminSipasParametrave(String nisja, String destinacion) {
        for (Udhetim udhetim : UDHETIMET_E_LEJUARA) {   //bredhim te gjitha udhetimet e permendura
            if (udhetim.getNisja().equals(nisja) && udhetim.getDestinacion().equals(destinacion)) { //nese nisja eshte e pranishme ne liste dhe
            	                                                                                    //per kete nisje ekziston nje destinacion
    
                return udhetim;                                                                     //kthejme udhetimin e realizuar
            }
        }
        return null;
    }

    private String[] getNisjet() {
        List<String> nisjet = new ArrayList<>();
        for (Udhetim udhetim : UDHETIMET_E_LEJUARA) { 
            nisjet.add(udhetim.getNisja());
        }
        return nisjet.stream().toArray(String[]::new); //konvertojme listen e vendeve nga do te nisemi ne nje array
    }

    private String[] getDestinacionet() {
        List<String> destinacionet = new ArrayList<>();
        for (Udhetim udhetim : UDHETIMET_E_LEJUARA) {
            destinacionet.add(udhetim.getDestinacion());
        }
        return destinacionet.stream().toArray(String[]::new);
    }

    private void afishoSuccessMessage(String message) {  //afishohet mesazh suksesi nese udhetimi eshte i mundur
        JOptionPane.showMessageDialog(this, message);
    }

    private void afishoErrorMessage(String message) {   //afishohet mesazh gabimi nese udhetimi nuk mund te realizohet
        JOptionPane.showMessageDialog(this, message, "Mesazhi gabimi", ERROR_MESSAGE);
    }
    public static void main(String args[]) {               //therrasim metoden main per programin qe ndertuam
        new Bileta_main();
    }
}
