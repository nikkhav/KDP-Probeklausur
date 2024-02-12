public class Artikel {
    private String artikelname;
    private double preis;


    public Artikel (String artikelname, int preis) {
        this.artikelname = artikelname;
        this.preis = preis;
    }

    public double getPreis () {
        return this.preis;
    }

    public String toString() {
        return this.artikelname + ", " + preis;
    }
}
