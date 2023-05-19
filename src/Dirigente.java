import java.time.LocalDate;

public class Dirigente extends Membro{
    public Dirigente(String nome, String cognome, LocalDate dataAssunzione){
        super(nome, cognome, dataAssunzione);
        this.setImporto(100);
    }
    @Override
    public int getCosto(){
        return this.getImporto();
    }
}
