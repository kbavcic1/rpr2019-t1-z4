package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli = new ArrayList<Artikl>();

    public boolean dodajArtikl(Artikl artikl) {
        if (artikli.size() <= 50) {
            artikli.add(artikl);
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocni = null;
        for (int i = 0; i < artikli.size(); i++) {
            if (artikli.get(i).getKod() == kod) {
                pomocni = new Artikl(artikli.get(i).getNaziv(),artikli.get(i).getCijena(),artikli.get(i).getKod());
                artikli.remove(i);
            }
        }
        return pomocni;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < artikli.size(); i++) {
            suma = suma + artikli.get(i).getCijena();
        }
        return suma;
    }
}
