import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import donnees.*;

public class TestTrierCd {

    @Test
    public void testTrierCd() throws Exception {
        ChargeurMagasin cm = new ChargeurMagasin("projet_cd/musicbrainzSimple/");
        Magasin m = cm.chargerMagasin();
        m.trierAlbum();

        CD c1 = m.getCd(m.getNombreCds() - 1);
        CD c2 = m.getCd(0);

        assertEquals("Believe", m.getCd(0).getNomCD());
        assertEquals("Whitney Houston", m.getCd(m.getNombreCds()-1).getNomCD());
    }

    @Test
    public void testTrierArtiste() throws Exception {
        ChargeurMagasin cm = new ChargeurMagasin("projet_cd/musicbrainzSimple/");
        Magasin m = cm.chargerMagasin();
        m.trierArtiste();

        CD c1 = m.getCd(m.getNombreCds() - 1);
        CD c2 = m.getCd(0);

        assertEquals("Bénabar", m.getCd(0).getNomArtiste());
        assertEquals("Zebda", m.getCd(m.getNombreCds()-1).getNomArtiste());
    }


}
