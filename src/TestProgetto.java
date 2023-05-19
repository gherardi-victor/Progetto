import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TestProgetto {

    @Test
    public void aggiungiTest() {
        Progetto progetto = new Progetto();
        progetto.aggiungiDirigente("John", "Doe", LocalDate.now());
        progetto.aggiungiFunzionario("Jane", "Smith", LocalDate.now());
        progetto.aggiungiTecnico("Michael", "Brown", LocalDate.now(), Progetto.SPECIALIZZAZIONE.INFORMATICA, Progetto.COLLABORATORE.INTERNO);

        int costoTotale = progetto.calcoloTotale();

        // 40 (tecnico) + 70 (fuznionario) + 100 (dirigente)

        Assertions.assertEquals(210, costoTotale, "The total cost is incorrect.");
    }
}