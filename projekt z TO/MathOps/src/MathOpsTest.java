import junit.framework.TestCase;

public class MathOpsTest extends TestCase {

    public void testAddIntMinNearly() throws Exception {

        //zakres
        assertNotSame(2,MathOps.add(-2147483647, -2147483647));
    }

    public void testAddIntMin() throws Exception {

        //zakres
        assertNotSame(0, MathOps.add(-2147483648, -2147483648));
    }

    public void testAddIntMaxNearly() throws Exception {

        //zakres
        assertNotSame(-4, MathOps.add(2147483646, 2147483646));
    }

    public void testAddIntMax() throws Exception {

        //zakres
        assertNotSame(-2,MathOps.add(2147483647, 2147483647));
    }

    public void testAddNaturalNumbers() throws Exception {
        //pare randomowych liczb
        assertEquals(11, MathOps.add(5, 6));
        assertEquals(137677, MathOps.add(14243, 123434));
        assertEquals(3552357, MathOps.add(1231234, 2321123));
        assertEquals(3, MathOps.add(1,2));
        assertEquals(24646466, MathOps.add(22323231, 2323235));
    }

    public void testAddSubzeroNumbers() throws Exception {
        //pare randomowych liczb
        assertEquals(-11, MathOps.add(-5, -6));
        assertEquals(-137677, MathOps.add(-14243, -123434));
        assertEquals(-3552357, MathOps.add(-1231234, -2321123));
        assertEquals(-3, MathOps.add(-1,-2));
        assertEquals(-24646466, MathOps.add(-22323231, -2323235));
    }

    public void testAddNaturalNumberAndZero() throws Exception {
        assertEquals(23232, MathOps.add(0, 23232));
        assertEquals(23231, MathOps.add(23231, 0));

    }

    public void testAddNaturalOpposeNumbers() throws Exception {

        assertEquals(0, MathOps.add(-6, 6));
    }

    public void testAddNaturalOpposeIntMinMax() throws Exception {
        assertEquals(-1, MathOps.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public void testPowZeroToZero() throws Exception {

        //0^0 nieoznaczony
        assertFalse(Math.abs(1.0 - MathOps.pow(0, 0)) < 0.0000001);

    }

    public void testPowPositiveNumbers() throws Exception {

        //pare randomowych liczb
        assertEquals(15625.0, MathOps.pow(5, 6));
    }
    public void testPowPositiveNumbersAndZero() throws Exception {
        assertEquals(0.0, MathOps.pow(0, 23232));
        assertEquals(1.0, MathOps.pow(23231, 0));

    }

    public void testPowPositiveNumbersInfinity() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, MathOps.pow(14243, 123434));
        assertEquals(Double.POSITIVE_INFINITY, MathOps.pow(1231234, 2321123));
    }

    public void testPowNegativeInfinity() throws Exception {
        assertEquals(Double.NEGATIVE_INFINITY, MathOps.pow(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public void testPowNegativeToPostive() throws Exception {
        assertEquals(46656.0, MathOps.pow(-6, 6));
    }
    public void testPowOneToMaxAndMin() throws Exception {

        assertEquals(1.0, MathOps.pow(1, Integer.MAX_VALUE));
        assertEquals(1.0, MathOps.pow(1, Integer.MIN_VALUE));
    }

    public void testPowZeroToNegative() throws Exception {

        assertNotSame(Double.POSITIVE_INFINITY, MathOps.pow(0, -Integer.MAX_VALUE));
        assertNotSame(Double.POSITIVE_INFINITY, MathOps.pow(0, Integer.MIN_VALUE));
    }

    public void testDividePositiveNumbers() throws Exception {

        //pare randomowych liczb
        assertEquals(0, MathOps.divide(5, 6));
        assertEquals(0, MathOps.divide(14243, 123434));
        assertEquals(18, MathOps.divide(2321123, 123123));
        assertEquals(0, MathOps.divide(0, 23232));
    }

    public void testDivideNegativeAndPositiveNumbers() throws Exception {
        assertEquals(-1, MathOps.divide(-6, 6));
        assertEquals(0, MathOps.divide(1, Integer.MAX_VALUE));
    }

    public void testDivideNegativeNumbers() throws Exception {
        assertEquals(3, MathOps.divide(-6, -2));
        assertEquals(1, MathOps.divide(-1,-1));
    }

    public void testDivideIntMax() throws Exception {
        //maksymalne zakresy
        assertEquals(-1, MathOps.divide(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public void testDivideByOne() throws Exception {
        //dzielenie przez jeden
    assertEquals(Integer.MIN_VALUE, MathOps.divide(Integer.MIN_VALUE, 1));
    }

    public void testDivide1ByZero() throws Exception {
        MathOps.divide1(1,0);
    }

    public void testDivideIntMinByIntMin() throws Exception {
        MathOps.divide(-2147483648, -2147483648);
    }

    public void testSqrtOfNegative(){
        MathOps.sqrt(-1);
    }
}