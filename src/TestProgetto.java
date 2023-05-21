import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TestProgetto {
    @Test
    public void aggiungiDirigenteTest() {
        Progetto progetto = new Progetto();
        progetto.aggiungiDirigente("John", "Doe", LocalDate.now());

        Assertions.assertEquals(1, progetto.getMembri().size());
    }
    @Test
    public void aggiungiFunzionarioTest() {
        Progetto progetto = new Progetto();
        progetto.aggiungiFunzionario("Jane", "Smith", LocalDate.now());

        Assertions.assertEquals(1, progetto.getMembri().size());
    }
    @Test
    public void aggiungiTecnicoTest() {
        Progetto progetto = new Progetto();
        progetto.aggiungiTecnico("Michael", "Brown", LocalDate.now(), Progetto.SPECIALIZZAZIONE.INFORMATICA, Progetto.COLLABORATORE.INTERNO);

        Assertions.assertEquals(1,progetto.getMembri().size());
    }

    @Test
    public void calcoloTotaleTest() {
        Progetto progetto = new Progetto();
        // 100
        progetto.aggiungiDirigente("John", "Doe", LocalDate.now());
        // 70 + 80
        progetto.aggiungiFunzionario("Margot", "Merge", LocalDate.now());
        progetto.aggiungiFunzionario("Jane", "Smith", LocalDate.of(2010, 6, 20));
        // 40 + 48 + 50 + 55
        progetto.aggiungiTecnico("Michael", "Brown", LocalDate.of(2015, 2, 10), Progetto.SPECIALIZZAZIONE.INFORMATICA, Progetto.COLLABORATORE.ESTERNO);
        progetto.aggiungiTecnico("Michele", "Jordano", LocalDate.of(2015, 2, 10), Progetto.SPECIALIZZAZIONE.TELECOMUNIICAZIONE, Progetto.COLLABORATORE.INTERNO);
        progetto.aggiungiTecnico("Stefano", "Ilcorridore", LocalDate.of(2018, 2, 10), Progetto.SPECIALIZZAZIONE.ELETTRONICA, Progetto.COLLABORATORE.ESTERNO);
        progetto.aggiungiTecnico("Giacomo", "Lebroso", LocalDate.of(2018, 2, 10), Progetto.SPECIALIZZAZIONE.AUTOMAZIONE, Progetto.COLLABORATORE.INTERNO);

        int costoTotaleOgniOra = progetto.calcoloTotale();

        Assertions.assertEquals(443, costoTotaleOgniOra, "The total cost is incorrect.");
    }
}