public abstract class Schlange<T> {
    protected Element ersetes;

    protected class Element {
        T wert;
        Element naechstes;

        public Element(T wert) {
            this.wert = wert;
        }
    }


    public abstract void hinzufuegen(T wert);

    public abstract Object entfernen();

    public abstract boolean istLeer();

    public abstract int anzahlElemente();

    public abstract T wertAnPosition(int pos) throws Exception;
}


