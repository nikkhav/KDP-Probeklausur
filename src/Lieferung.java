public class Lieferung extends Bestellung{
    private static final double lieferKosten = 4.0;
    private static final double lieferKostenGrenze = 20.0;

    public Lieferung (Artikel[] artikeln) {
        super(artikeln);
        this.gesamtPreis = gesamtPreisBerechnen();
    }

    protected double gesamtPreisBerechnen () {
        double total = super.gesamtPreisBerechnen();

        return total >= lieferKostenGrenze ? total : total + lieferKosten;
    }
}
