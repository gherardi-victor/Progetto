import java.time.LocalDate;
import java.util.LinkedList;

public class Progetto {
    private LinkedList<Membro> membri = new LinkedList<>();

    enum SPECIALIZZAZIONE { INFORMATICA, TELECOMUNIICAZIONE, ELETTRONICA, AUTOMAZIONE };
    enum COLLABORATORE { INTERNO, ESTERNO };

    public void aggiungiDirigente(String nome, String cognome, LocalDate dataAssunzione){
        aggiungiMembro(new Dirigente(nome, cognome, dataAssunzione));
    }
    public void aggiungiFunzionario(String nome, String cognome, LocalDate dataAssunzione){
        aggiungiMembro(new Funzionario(nome, cognome, dataAssunzione));
    }
    public void aggiungiTecnico(String nome, String cognome, LocalDate dataAssunzione, SPECIALIZZAZIONE specializzazione, COLLABORATORE collaboratore){
        aggiungiMembro(new Tecnico(nome, cognome, dataAssunzione, specializzazione, collaboratore));
    }
    public void aggiungiMembro(Membro membro){
        this.membri.add(membro);
    }
    public int calcoloTotale(){
        return this.membri.stream().map(Membro::getCosto).reduce(0, Integer::sum);
    }

    public LinkedList<Membro> getMembri() {
        return this.membri;
    }
}