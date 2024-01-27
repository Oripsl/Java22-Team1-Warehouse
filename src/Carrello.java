import java.util.ArrayList;

public class Carrello {
    private ArrayList<ClasseDispositivi> dispositivi = new ArrayList<>();

    public Carrello() {
        this.dispositivi = new ArrayList<>();
    }

    // Aggiungere al carrello
    public void aggiungiAlCarrello(ClasseDispositivi dispositivo) {
        dispositivi.add(dispositivo);
    }

    // Rimuovere dispositivo per indice
    public void rimuoviDispositivo(int index) {
        if(index >=0 && index < dispositivi.size()) {
            dispositivi.remove(index);
        } else {
            System.out.println("Indice non valido");
        }
    }

    // Stampare elementi nel carrello
    public void stampaCarrello() {
        for(int i = 0; i < dispositivi.size(); i++) {
            System.out.println(i + " : " + dispositivi.get(i));
        }
    }

    // Calcolare prezzo finale
    public double getPrezzoFinale() {
        int prezzoFinale = 0;
        for(ClasseDispositivi dispositivo : dispositivi) {
            prezzoFinale += dispositivo.getPurchase();
        }
        return prezzoFinale;
    }

    // Selezionare specifico elemento per indice
    public ClasseDispositivi getDispositivi(int indice) {
        if(indice >= 0 && indice < dispositivi.size()) {
            return dispositivi.get(indice);
        } else {
            System.out.println("Indice non valido");
            return null;
        }
    }

    // Svuota carrello
    public void svuotaCarrello() {
        dispositivi.clear();
    }
}
