public class KontoVerwaltung implements AdminSicht {
    private Konto[] konten;

    public KontoVerwaltung (int kontenNum) {
        this.konten = new Konto[kontenNum];
    }

    public boolean registrieren (String name, String passwort) {
        if(passwort.length() < 6) return false;

        for(Konto konto : konten) {
            if(konto!= null && konto.toString().equals(name)) {
                return false;
            }
        }

        for(int i = 0; i < konten.length; i++) {
            if(konten[i] == null) {
                konten[i] = new Konto(name, passwort);
                return true;
            }
        }

        return false;
    }

    public void kontenAuflisten () {
        System.out.println("Registrierte Konten: ");
        for(Konto konto : konten) {
            System.out.println(konto.toString());
        }
    }

    public boolean kontoLoeschen (String name) {
        for (int i = 0; i < konten.length; i++) {
            if(konten[i] != null && konten[i].toString().equals(name)) {
                konten[i] = null;
                return true;
            }
        }
        return false;
    }
}
