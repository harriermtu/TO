import junit.framework.TestCase;

public class MathOpsTest extends TestCase {

    public void testAdd() throws Exception {

        //zakres
        assertNotSame(2,MathOps.add(-2147483647, -2147483647));
    }

    public void testAdd2() throws Exception {


        //pare randomowych liczb
        assertEquals(11, MathOps.add(5, 6));
        assertEquals(137677, MathOps.add(14243, 123434));
        assertEquals(3552357, MathOps.add(1231234, 2321123));
        assertEquals(23232, MathOps.add(0, 23232));
        assertEquals(23231, MathOps.add(23231, 0));
        assertEquals(-1, MathOps.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(0, MathOps.add(-6, 6));
        assertEquals(24646466, MathOps.add(22323231, 2323235));
        assertEquals(3, MathOps.add(1,2));
    }


    public void testPow() throws Exception {

        //0^0 nieoznaczony
        assertFalse(Math.abs(1.0 - MathOps.pow(0, 0)) < 0.0000001);

    }

    public void testPow2() throws Exception {

        //pare randomowych liczb
        assertEquals(15625.0, MathOps.pow(5, 6));
        assertEquals(Double.POSITIVE_INFINITY, MathOps.pow(14243, 123434));
        assertEquals(Double.POSITIVE_INFINITY, MathOps.pow(1231234, 2321123));
        assertEquals(0.0, MathOps.pow(0, 23232));
        assertEquals(1.0, MathOps.pow(23231, 0));
        assertEquals(Double.NEGATIVE_INFINITY, MathOps.pow(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(46656.0, MathOps.pow(-6, 6));
        assertEquals(1.0, MathOps.pow(1, Integer.MAX_VALUE));
        assertEquals(1.0, MathOps.pow(1, Integer.MIN_VALUE));

    }

    public void testDivide() throws Exception {

        //pare randomowych liczb
        assertEquals(0, MathOps.divide(5, 6));
        assertEquals(0, MathOps.divide(14243, 123434));
        assertEquals(18, MathOps.divide(2321123, 123123));
        assertEquals(0, MathOps.divide(0, 23232));
        assertEquals(-1, MathOps.divide(-6, 6));
        assertEquals(0, MathOps.divide(1, Integer.MAX_VALUE));

    }

    public void testDivide2() throws Exception {
        //maksymalne zakresy
        assertEquals(-1, MathOps.divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public void testDivide3() throws Exception {
        //dzielenie przez jeden
    assertEquals(Integer.MIN_VALUE, MathOps.divide(Integer.MIN_VALUE, 1));
    }

    public void testDivide1() throws Exception {

        //pare randomowych liczb
        assertEquals(0, MathOps.divide1(5, 6));
        assertEquals(0, MathOps.divide1(14243, 123434));
        assertEquals(18, MathOps.divide1(2321123, 123123));
        assertEquals(0, MathOps.divide1(0, 23232));
        assertEquals(-1, MathOps.divide1(-6, 6));
        assertEquals(0, MathOps.divide1(1, Integer.MAX_VALUE));

    }

    public void testDivide12() throws Exception {
        //maksymalne zakresy
        assertEquals(-1, MathOps.divide1(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public void testDivide13() throws Exception {
        //dzielenie przez jeden
        assertEquals(Integer.MIN_VALUE, MathOps.divide1(Integer.MIN_VALUE, 1));
    }
}