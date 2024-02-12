public class Konto {
    private String name;
    private String passwort;

    public Konto (String name, String passwort) {
        this.name = name;
        this.passwort = passwort;
    }

    public String toString() {
        return this.name;
    }

    public void setPasswort (String neuPasswort, String altPasswort) {
        if(!altPasswort.equals(passwort)) return;
        if(neuPasswort.length() < 6) return;

        this.passwort = neuPasswort;
    }
}
