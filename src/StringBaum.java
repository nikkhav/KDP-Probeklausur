public class StringBaum {
    private String wert;
    private StringBaum links;
    private StringBaum rechts;

    public StringBaum (String wert, StringBaum links, StringBaum rechts) {
        this.wert = wert;
        this.links = links;
        this.rechts = rechts;
    }

    public int anzahlDerEintraege () {
        int total = this.wert != null ? 1 : 0;
        if(this.links != null) {
            total += anzahlDerEintraege();
        }
        if(this.rechts != null) {
            total += anzahlDerEintraege();
        }
        return total;
    }

    public boolean istVorhanden (String zeichenkette) {
        if(this.wert!= null && this.wert.equals(zeichenkette)) {
            return true;
        }

        if(this.links != null && this.links.istVorhanden(zeichenkette)) {
            return true;
        }

        if(this.rechts != null && this.rechts.istVorhanden(zeichenkette)) {
            return true;
        }


        return false;
    }

    public void ausgeben () {
        if(this.links != null) {
            this.links.ausgeben();
        }

        if(this.wert != null) {
            System.out.println(this.wert + " ");
        }

        if(this.rechts != null) {
            this.rechts.ausgeben();
        }
    }


}
