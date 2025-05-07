import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import donnees.*;

public class TestChargeurMagasin {


    @Test
    public void repertoireValide(){

        int nbCds = 0;
        boolean exeption = false;

        try {
            ChargeurMagasin cm = new ChargeurMagasin("projet_cd/musicbrainzSimple/");
            Magasin m = cm.chargerMagasin();
            nbCds = m.getNombreCds();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            exeption = true;
        }

        assertFalse(exeption);
        assertEquals(12, nbCds);

    }

    @Test
    public void repertoireInexistant(){

        int nbCds = 0;
        boolean exeption = false;

        try {
            ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple/");
            Magasin m = cm.chargerMagasin();
            nbCds = m.getNombreCds();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            exeption = true;
        }

        assertTrue(exeption);

    }

}