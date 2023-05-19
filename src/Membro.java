import java.time.LocalDate;

abstract public class Membro {
    static int code = 0;
    private int codice;
    private String nome;
    private String cognome;
    private LocalDate dataAssunzione;
    private int importo;
    public Membro(String nome, String cognome, LocalDate dataAssunzione){
        this.setNome(nome);
        this.setCognome(cognome);
        this.setDataAssunzione(dataAssunzione);

        this.setCodice(Membro.code++);
    }
    public int getCosto(){
        return this.importo;
    }
    public int getImporto() {
        return importo;
    }
    public void setImporto(int nuovoImporto) {
        this.importo = nuovoImporto;
    }
    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }
    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
}
