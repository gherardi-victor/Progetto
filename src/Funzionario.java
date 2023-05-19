import java.time.LocalDate;
public class Funzionario extends Membro{
    public Funzionario(String nome, String cognome, LocalDate dataAssunzione){
        super(nome, cognome, dataAssunzione);
        this.setImporto(70);
    }

    @Override
    public int getCosto(){
        int costo = this.getImporto();
        LocalDate oggi = LocalDate.now();
        LocalDate dieciAnniFa = oggi.minusYears(10);
        if (this.getDataAssunzione().isBefore(dieciAnniFa)) {
            costo = 80;
        }
        return costo;
    }
}