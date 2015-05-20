import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BankierTest {

    @Test
    public void testCzyWyslacOferteKarty() throws Exception {
        Bankier bnk = new Bankier();
        //RD1
        assertTrue(Arrays.equals(new boolean[]{false,false,true},bnk.czyWyslacOferteKarty(true,true,true)));
        //RD2'
        assertTrue(Arrays.equals(new boolean[]{false,true,false},bnk.czyWyslacOferteKarty(true,true,false)));
        assertTrue(Arrays.equals(new boolean[]{false,true,false},bnk.czyWyslacOferteKarty(false,true,false)));
        //RD3
        assertTrue(Arrays.equals(new boolean[]{true,true,true},bnk.czyWyslacOferteKarty(true,false,true)));
        //RD4
        assertTrue(Arrays.equals(new boolean[]{true,true,false},bnk.czyWyslacOferteKarty(true,false,false)));
        //RD5'
        assertTrue(Arrays.equals(new boolean[]{false,false,false},bnk.czyWyslacOferteKarty(false,true,true)));
        assertTrue(Arrays.equals(new boolean[]{false,false,false},bnk.czyWyslacOferteKarty(false,false,true)));
        //RD6
        assertTrue(Arrays.equals(new boolean[]{false,true,false},bnk.czyWyslacOferteKarty(false,false,false)));
    }
}