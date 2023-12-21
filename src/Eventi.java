public class Eventi{
    protected String codice;
    protected int partecipanti;
    protected String localita;
    protected String descrizione;
    protected boolean[] feedback;

    public Eventi(String codice, int partecipanti, String localita, String descrizione) {
        this.codice = codice;
        this.partecipanti = partecipanti;
        this.localita = localita;
        this.descrizione = descrizione;
        this.feedback = new boolean[partecipanti]
        this.feedback = getFeedback();
    }

    public Eventi(){
        this.codice = generaCodice();
        this.partecipanti = Interazione.;
        this.localita = localita;
        this.descrizione = descrizione;
        this.feedback = getFeedback();
    }

    public String getCodice() {
        return codice;
    }

    public int getPartecipanti() {
        return partecipanti;
    }

    public String getLocalita() {
        return localita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public boolean[] getFeedback(){
        for(int i=0;i<feedback.length;i++){
            feedback[i] = Interazione.boolput("il " + (i+1) + "° partecipante ha un'opinione positiva di questo evento?");
        }
        return feedback;
    }
    public boolean getFeedback(int i) {
        return feedback[i];
    }
}