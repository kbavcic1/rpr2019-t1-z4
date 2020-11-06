package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket market;
    private Artikl artikl;

    @BeforeEach
    void setUp() {
        market = new Supermarket();
        artikl = new Artikl("stolica",25,"54321");
    }

    @Test
    void daLiSeArtiklMozeDodati() {
        boolean mozeSeDodati = market.dodajArtikl(artikl);
        assertTrue(mozeSeDodati);
    }

}