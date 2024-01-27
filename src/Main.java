import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Carrello carrello = new Carrello();


        Notebook notebook = new Notebook("Notebook","Samsung","Galaxy book3","Tua zia",15.6,512,1999);

        Smartphone smartphone = new Smartphone("Smartphone","Samsung","Patata","Cocco bello cocco fresco",14.7,700,499);

        Tablet tablet = new Tablet("Tablet","Samsung","Patata","Bello acquisto",12.9,400,299);


        carrello.aggiungiAlCarrello(notebook);
        carrello.aggiungiAlCarrello(smartphone);
        carrello.aggiungiAlCarrello(tablet);

        carrello.stampaCarrello();
    }

}
