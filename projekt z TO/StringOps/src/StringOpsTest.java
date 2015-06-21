import junit.framework.TestCase;

public class StringOpsTest extends TestCase {


    public void testLRSEmptySet() throws Exception {
        //wykrzacza sie na pustym
        assertEquals("",StringOps.LRS(""));

    }

    public void testLRSOneEmptySet() throws Exception {
        //wykrzacza sie na pustym
        assertEquals("a", StringOps.LRS("asd"));
    }

    public void testLRSSequenceAtBeginning() throws Exception {
        assertEquals("aaa", StringOps.LRS("aaae"));
    }

    public void testLRSSequenceAtTheEnd() throws Exception {
        assertEquals("eeeee",StringOps.LRS("aaaeeeee"));

    }

    public void testLRSSequenceAtTheEnd2() throws Exception {

        //zly wynik
        assertEquals("eee",StringOps.LRS("abcdeee"));

    }

    public void testLRS1EmptySet() throws Exception {
        //pusty
        assertEquals("", StringOps.LRS1(""));
    }

    public void testLRS1SequenceAtTheEnd() throws Exception {
        assertEquals("eee",StringOps.LRS1("abcdeee"));

    }

    public void testLCPEmptySet() throws Exception {

        //na pustym
        assertEquals("",StringOps.LCP("",""));

    }


    public void testLCPEmptySet2() throws Exception {
        //pusty dziala
        assertEquals("", StringOps.LCP("", "abcdef"));
    }

    public void testLCPFullLengthCommonString() throws Exception {
        //longest common string
        assertEquals("abcdeee",StringOps.LCP("abcdeee","abcdeee"));

    }

    public void testLCSCommonStringAtTheEnd() throws Exception {
        //longest common string
        assertEquals("eee",StringOps.LCP("aeee","abcdeee"));
    }

    public void testReverseEmptySet() throws Exception {

        //pusty przechodzi
        assertEquals("", StringOps.reverse("", 0, 0));

    }

    public void testReverseOutOfRange() throws Exception {

        //poza zakres
        assertEquals("abc", StringOps.reverse("cba", 2, 2));
    }

    public void testReverseOutOfRangeZero() throws Exception {

        //poza zakres
        assertEquals("abc",StringOps.reverse("abc",0,2));
    }

    public void testRotateStringZero() throws Exception {

        //test rotacji
        assertEquals("bca", StringOps.rotateString("bca", 0));
    }

    public void testRotateStringOne() throws Exception {
        //test rotacji
        assertEquals("cab", StringOps.rotateString("bca", 1));
    }

    public void testRotateStringNegative() throws Exception {
        //na ujemne
        assertEquals("0",StringOps.rotateString("0",-1));

    }

    public void testIsRexMatchEmpty() throws Exception {

        //na pustym
        assertEquals(true, StringOps.isRexMatch("", ""));
    }

    public void testIsRexMatchSpace() throws Exception {

        //spacja
        assertEquals(true,StringOps.isRexMatch(" ","//s"));
    }

    public void testIsRexMatch1Empty() throws Exception {
        //na pustym
        assertEquals(true, StringOps.isRexMatch("", ""));

    }

    public void testIsRexMatch1Space() throws Exception {
        //spacja
        assertEquals(true,StringOps.isRexMatch(" ","//s"));
    }
}