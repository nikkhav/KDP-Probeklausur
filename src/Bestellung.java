public class Bestellung {
    protected int bestellNummer;
    protected Artikel[] artikeln;

    protected double gesamtPreis;

    static int lastId = 0;

    public Bestellung (Artikel[] artikeln) {
        this.artikeln = artikeln;
        this.bestellNummer = lastId++;
        this.gesamtPreis = gesamtPreisBerechnen();
    }

    protected double gesamtPreisBerechnen () {
        double total = 0;
        for (int i = 0; i < this.artikeln.length; i++) {
            total += this.artikeln[i].getPreis();
        }
        return total;

    }

    public void bestellungAnzeigen () {
        System.out.println("Bestellnummer: " + this.bestellNummer);
        for (int i = 0; i < this.artikeln.length; i++) {
            System.out.println(artikeln[i].toString());
        }
        System.out.println("Gesamtpreis: " + gesamtPreis);
    }
}
