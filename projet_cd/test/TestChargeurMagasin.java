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
            ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
            Magasin m = cm.chargerMagasin();
            nbCds = m.getNombreCds();
        }
        catch(Exception e){
            exeption = true;
        }

        assertFalse(exeption);
        assertEquals(1, nbCds);

    }

    //@Test
    //public void repertoireInexistant(){

    //}

}