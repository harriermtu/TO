import junit.framework.TestCase;

public class IsNumberTest extends TestCase {

    public void testIsNumberSimpleType() throws Exception {
        //proste typy
        assertEquals(true, IsNumber.isNumber("1"));
    }
    public void testIsNumberNegative() throws Exception {
        assertEquals(true, IsNumber.isNumber("-1111111111111111111111111"));
    }
    public void testIsNumberZero() throws Exception {
        assertEquals(true, IsNumber.isNumber("0"));
    }

    public void testIsNumberWithDot() throws Exception {
        //z kropka
        assertEquals(true, IsNumber.isNumber("0.123"));
    }

    public void testIsNumberNegativeWithDot() throws Exception {
        assertEquals(true, IsNumber.isNumber("-0.123"));
    }

    public void testIsNumberPositiveWithDot() throws Exception {
        assertEquals(true, IsNumber.isNumber("+0.123"));
    }

    public void testIsNumberPlusMinusWithDot() throws Exception {
        //+-
        assertEquals(false, IsNumber.isNumber("+-0.123"));
    }

    public void testIsNumberMinusPlusWithDot() throws Exception {
        assertEquals(false, IsNumber.isNumber("-+0.123"));
    }

    public void testIsNumberMinusE() throws Exception {
        //notacja e
        assertEquals(true, IsNumber.isNumber("-1e-12"));
    }

    public void testIsNumberPlusE() throws Exception {
        assertEquals(true, IsNumber.isNumber("+1e-12"));
    }

    public void testIsNumberPlusEMinus() throws Exception {
        assertEquals(true, IsNumber.isNumber("+12323e-112"));
    }

    public void testIsNumberEmptyString() throws Exception {
        //random string
        assertEquals(false, IsNumber.isNumber(null));
    }

    public void testIsNumberRandomString() throws Exception {
        assertEquals(false,IsNumber.isNumber("randomString"));
        assertEquals(false,IsNumber.isNumber("-123 bad output"));
        assertEquals(false,IsNumber.isNumber("-12;20"));

    }

    public void testIsNumberEpowE() throws Exception {
        //blad dla uzywania w potedze notacji z e, a to przeciez liczba
        assertEquals(true, IsNumber.isNumber("-123e-123e-10"));
    }
}