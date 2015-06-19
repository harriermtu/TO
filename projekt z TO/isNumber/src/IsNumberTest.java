import junit.framework.TestCase;

public class IsNumberTest extends TestCase {

    public void testIsNumber() throws Exception {
        //proste typy
        assertEquals(true,IsNumber.isNumber("1"));
        assertEquals(true,IsNumber.isNumber("-1111111111111111111111111"));
        assertEquals(true,IsNumber.isNumber("0"));
        //z kropka
        assertEquals(true,IsNumber.isNumber("0.123"));
        assertEquals(true,IsNumber.isNumber("-0.123"));
        assertEquals(true,IsNumber.isNumber("+0.123"));
        //+-
        assertEquals(false,IsNumber.isNumber("+-0.123"));
        assertEquals(false,IsNumber.isNumber("-+0.123"));
        //notacja e
        assertEquals(true,IsNumber.isNumber("-1e-12"));
        assertEquals(true,IsNumber.isNumber("+1e-12"));
        assertEquals(true,IsNumber.isNumber("+12323e-112"));
        //random string
        assertEquals(false,IsNumber.isNumber(""));
        assertEquals(false,IsNumber.isNumber("randomString"));
        assertEquals(false,IsNumber.isNumber("-123 bad output"));
        assertEquals(false,IsNumber.isNumber("-12;20"));

    }
    public void testIsNumber2() throws Exception {
        //blad dla uzywania w potedze notacji z e, a to przeciez liczba
        assertEquals(true, IsNumber.isNumber("-123e-123e-10"));
    }
}