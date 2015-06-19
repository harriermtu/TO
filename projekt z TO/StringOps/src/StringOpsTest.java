import junit.framework.TestCase;

public class StringOpsTest extends TestCase {

    public void testGenerateWordsFromPhone() throws Exception {
        //brak walidacji inputu

    }

    public void testLRS() throws Exception {
        //wykrzacza sie na pustym
        assertEquals("",StringOps.LRS(""));

    }

    public void testLRSOne() throws Exception {
        //wykrzacza sie na pustym
        assertEquals("a",StringOps.LRS("asd"));

        assertEquals("aaa",StringOps.LRS("aaae"));

        assertEquals("eeeee",StringOps.LRS("aaaeeeee"));

    }

    public void testLRS2nd() throws Exception {

        //zly wynik
        assertEquals("eee",StringOps.LRS("abcdeee"));

    }

    public void testLRS1() throws Exception {
        //pusty
        assertEquals("",StringOps.LRS1(""));

        //wyik powinien byc eee
        assertEquals("eee",StringOps.LRS1("abcdeee"));

    }

    public void testLCP() throws Exception {

        //na pustym
        assertEquals("",StringOps.LCP("",""));

    }

    public void testLCS() throws Exception {

        //pusty dziala
        assertEquals("",StringOps.LCP("",""));

        //pusty dziala
        assertEquals("",StringOps.LCP("","abcdef"));

        //longest common string
        assertEquals("abcdeee",StringOps.LCP("abcdeee","abcdeee"));

    }

    public void testLCS2nd() throws Exception {
        //longest common string
        assertEquals("eee",StringOps.LCP("aeee","abcdeee"));
    }

    public void testLCS1() throws Exception {

        //pusty dziala
        assertEquals("",StringOps.LCP("",""));

        //pusty dziala
        assertEquals("",StringOps.LCP("","abcdef"));

        //longest common string
        assertEquals("abcdeee",StringOps.LCP("abcdeee","abcdeee"));

        //longest common string
        assertEquals("eee",StringOps.LCP("aeee","abcdeee"));

    }

    public void testReverse() throws Exception {

        //pusty przechodzi
        assertEquals("",StringOps.reverse("",0,0));

        //poza zakres
        assertEquals("abc",StringOps.reverse("cba",2,2));

        //poza zakres
        assertEquals("abc",StringOps.reverse("abc",0,2));
    }

    public void testRotateString() throws Exception {

        //test rotacji
        assertEquals("bca",StringOps.rotateString("bca",0));

        //test rotacji
        assertEquals("cab",StringOps.rotateString("bca",1));

        //na ujemne
        assertEquals("0",StringOps.rotateString("0",-1));

    }

    public void testIsRexMatch() throws Exception {

        //na pustym
        assertEquals(true,StringOps.isRexMatch("",""));

        //spacja
        assertEquals(true,StringOps.isRexMatch(" ","//s"));
    }

    public void testIsRexMatch1() throws Exception {
        //na pustym
        assertEquals(true,StringOps.isRexMatch("",""));

        //spacja
        assertEquals(true,StringOps.isRexMatch(" ","//s"));
    }
}