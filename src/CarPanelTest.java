import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarPanelTest {
    private static final CarPanel cp = new CarPanel();

    @Test
    public void testPredkosc() throws Exception {
        //PT1 s=0, t=0, flaga=0
        assertEquals(0, cp.Predkosc(0, 0),10^(-2));
        assertEquals(false,cp.isWARN());

        //PT1 s=120, t=1, flaga=0
        assertEquals(120, cp.Predkosc(120, 1),10^(-2));
        assertEquals(false,cp.isWARN());

        //PT1 s=Double.MAX_VALUE, t=1, flaga=1
        assertEquals(Double.MAX_VALUE, cp.Predkosc(Double.MAX_VALUE, 1),10^(-2));
        assertEquals(true,cp.isWARN());

        //PT1 s=1, t=0.01, flaga=0
        assertEquals(10, cp.Predkosc(1, 0.1),10^(-2));
        assertEquals(false,cp.isWARN());

        //PT1 s=120.01, t=1, flaga=1
        assertEquals(120.01, cp.Predkosc(120.01, 1),10^(-2));
        assertEquals(true,cp.isWARN());

        //PT1 s=Double.MIN_VALUE, t=2, flaga=0
        assertEquals(Double.MIN_VALUE/2, cp.Predkosc(Double.MIN_VALUE, 2),10^(-2));
        assertEquals(false,cp.isWARN());

        //PT1 s=-0.01, t=0.02, flaga=0
        assertEquals(-0.5, cp.Predkosc(-0.01, 0.02),10^(-2));
        assertEquals(false,cp.isWARN());

        //PT1 s=120, t=1.01, flaga=0
        assertEquals(118.81188118811882, cp.Predkosc(120,1.01),10^(-2));
        assertEquals(false,cp.isWARN());
    }
}