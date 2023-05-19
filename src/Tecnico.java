import java.time.LocalDate;
import java.time.Period;

public class Tecnico extends Membro {
    private Progetto.SPECIALIZZAZIONE specializzazione;
    private Progetto.COLLABORATORE collaboratore;
    public Tecnico(String nome, String cognome, LocalDate dataAssunzione, Progetto.SPECIALIZZAZIONE specializzazione, Progetto.COLLABORATORE collaboratore){
        super(nome, cognome, dataAssunzione);

        this.collaboratore = collaboratore;
        this.specializzazione = specializzazione;

        switch (this.specializzazione){
            case INFORMATICA:
            case TELECOMUNIICAZIONE:
                this.setImporto(40);
                break;
            case ELETTRONICA:
            case AUTOMAZIONE:
                this.setImporto(50);
                break;
        }
    }
    @Override
    public int getCosto(){
        int costo = this.getImporto();
        if(this.collaboratore == Progetto.COLLABORATORE.INTERNO){
            Period differenza = Period.between(this.getDataAssunzione(), LocalDate.now());
            int anni = differenza.getYears();
            costo += anni;
        }
        return costo;
    }
}
