public class SchlangeImpl<T> extends Schlange<T> {

    public void hinzufuegen(T wert) {
        if(this.ersetes == null) {
            this.ersetes = new Element(wert);
        }
        Element aktuell = this.ersetes;
        while (aktuell.naechstes != null) {
            aktuell = aktuell.naechstes;
        }

        aktuell.naechstes = new Element(wert);
    }

    public T entfernen () {
        if(this.ersetes == null) return null;

        Element oldTop = this.ersetes;
        this.ersetes = oldTop.naechstes;

        return oldTop.wert;
    }

    public boolean istLeer() {
        return this.ersetes == null;
    }


    public int anzahlElemente() {
        if(this.ersetes == null) return 0;

        int anzahl = 1;
        Element aktuell = this.ersetes;

        while (aktuell.naechstes != null) {
            aktuell = aktuell.naechstes;
            anzahl++;
        }

        return anzahl;
    }

    public T wertAnPosition (int pos) throws Exception {
        if(pos < 0 || pos > anzahlElemente()) {
            throw new Exception("Ungültige Position");
        }
        int curPos = 0;
        Element aktuell = this.ersetes;

        while (aktuell != null) {
            if(curPos == pos) {
                return aktuell.wert;
            }
            aktuell = aktuell.naechstes;
            curPos++;
        }

        return null;

    }






}
