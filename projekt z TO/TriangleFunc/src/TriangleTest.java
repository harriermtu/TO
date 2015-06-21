import junit.framework.TestCase;

public class TriangleTest extends TestCase {

    public void testTriangleTypeIntMax() throws Exception {

        //na zakresie sie wykrzacza
        Triangle triangle = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE / 2);
        assertEquals(2, triangle.triangleType());
    }

    public void testTriangleTypeIntMaxHalf() throws Exception {
        //na zakresie sie wykrzacza
        Triangle triangle;
        triangle = new Triangle(Integer.MAX_VALUE / 2 + 2, Integer.MAX_VALUE / 2 + 2, Integer.MAX_VALUE / 2 + 2);
        assertEquals(3, triangle.triangleType());
    }

    public void testTriangleTypeIntMaxNearly() throws Exception {
        //na zakresie sie wykrzacza
        Triangle triangle;
        triangle = new Triangle(Integer.MAX_VALUE-1,Integer.MAX_VALUE-2,Integer.MAX_VALUE-3);
        assertEquals(1,triangle.triangleType());

    }

    public void testTriangleType1() throws Exception {
        //roznoboczny
        Triangle triangle = new Triangle(3,4,5);
        assertEquals(1, triangle.triangleType());
    }

    public void testTriangleType2() throws Exception {
        //rownoramienny
        Triangle triangle2 = new Triangle(3, 4, 4);
        assertEquals(2, triangle2.triangleType());

    }

    public void testTriangleType3() throws Exception {
        //rownoboczny
        Triangle triangle3 = new Triangle(4,4,4);
        assertEquals(3, triangle3.triangleType());


    }

    public void testTriangleType2and3() throws Exception {

        //rownoboczny tez jest rownoramienny
        Triangle triangle3 = new Triangle(4,4,4);
        assertEquals(2, triangle3.triangleType());


    }

    public void testTriangleType4() throws Exception {

        //sprawdza zero i ujemne
        Triangle triangle = new Triangle(0,0,0);
        assertEquals(4, triangle.triangleType());

        Triangle triangle2 = new Triangle(-1,-1,-1);
        assertEquals(4, triangle2.triangleType());


    }
}