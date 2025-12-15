package be.ehb.personen;

public class Huisdier {

    private String naam;
    private Persoon eigenaar;

    public Huisdier(String naam) {
        this.naam = naam;
    }

    public Persoon getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(Persoon eigenaar) {
        this.eigenaar = eigenaar;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
