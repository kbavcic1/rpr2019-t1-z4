package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;

    @BeforeEach
    void setUp() {
        korpa = new Korpa();
        artikl = new Artikl("stolica",25,"54321");
    }

    @Test
    void testDaLiSeArtikalMozeDodati() {
        boolean mozeSeDodati = korpa.dodajArtikl(artikl);
        assertTrue(mozeSeDodati);
    }

    @Test
    void testKolikoImaArtikalaUKorpi() {
        korpa.dodajArtikl(artikl);
        assertEquals(1,korpa.getBrojArtikala());
    }

    @Test
    void testDaLiJeIzbacenArtikl() {
        korpa.dodajArtikl(artikl);
        Artikl pomocni = korpa.izbaciArtiklSaKodom("54321");
        assertEquals(artikl.getKod(), pomocni.getKod());
    }

    @Test
    void testDodavanjeArtiklaUPunuKorpu() {
        for (int i = 0; i < 50; i++) {
            korpa.dodajArtikl(artikl);
        }

        boolean mozeSeDodati = korpa.dodajArtikl(artikl);
        assertTrue(!mozeSeDodati);
    }

}