public class Operand extends Ausdruck {
    double wert;
    public Operand (double wert) {
        this.wert = wert;
    }

    public double auswerten () {
        return this.wert;
    }
}
