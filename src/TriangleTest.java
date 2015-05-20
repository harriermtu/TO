import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TriangleTest {

    @Test
    public void testIs_Triangle() throws Exception {
        Triangle trg = new Triangle(0,0,0);

        // pare testow
        assertEquals(false,trg.is_Triangle(0,0,0));

        assertEquals(false,trg.is_Triangle(-1,1,1));

        assertEquals(false,trg.is_Triangle(-1,-1,-1));

        assertEquals(true,trg.is_Triangle(1,1,1));

    }

    @Test
    public void testIs_right() throws Exception {

        //wszystkie kombinacje na tak
        Triangle trg = new Triangle(3,4,5);
        assertEquals(true,trg.is_right());
        trg = new Triangle(4, 5, 3);
        assertEquals(true,trg.is_right());
        trg = new Triangle(5, 3, 4);
        assertEquals(true,trg.is_right());

        //wszystkie kombinacje na nie
        trg = new Triangle(6, 8, 13);
        assertEquals(false,trg.is_right());
        trg = new Triangle(8,13,6);
        assertEquals(false,trg.is_right());
        trg = new Triangle(13,6,8);
        assertEquals(false,trg.is_right());
    }

    @Test
    public void testIs_scalene() throws Exception {
        //roznoboczny, wszystkie kombinacje
        Triangle trg = new Triangle(3,4,5);
        assertEquals(true,trg.is_scalene());
        trg = new Triangle(4, 5, 3);
        assertEquals(true,trg.is_scalene());
        trg = new Triangle(5, 3, 4);
        assertEquals(true,trg.is_scalene());

        //rownoramienny, wszystkie kombinacje
        trg = new Triangle(3, 3, 5);
        assertEquals(false,trg.is_scalene());
        trg = new Triangle(3, 5, 3);
        assertEquals(false,trg.is_scalene());
        trg = new Triangle(5, 3, 3);
        assertEquals(false,trg.is_scalene());

        //rownoboczny
        trg = new Triangle(4, 4, 4);
        assertEquals(false,trg.is_scalene());
    }

    @Test
    public void testIs_isosceles() throws Exception {

        //te same testy co do scalene, tyle ze wartosciowanie na odwrot
        //powinno znalezc blad przy rownobocznym (tez jest rownoramienny)
        //roznoboczny, wszystkie kombinacje
        Triangle trg = new Triangle(3,4,5);
        assertEquals(false,trg.is_isosceles());
        trg = new Triangle(4, 5, 3);
        assertEquals(false,trg.is_isosceles());
        trg = new Triangle(5, 3, 4);
        assertEquals(false,trg.is_isosceles());

        //rownoramienny, wszystkie kombinacje
        trg = new Triangle(3, 3, 5);
        assertEquals(true,trg.is_isosceles());
        trg = new Triangle(3, 5, 3);
        assertEquals(true,trg.is_isosceles());
        trg = new Triangle(5, 3, 3);
        assertEquals(true,trg.is_isosceles());

        //rownoboczny
        trg = new Triangle(4, 4, 4);
        assertEquals(true,trg.is_isosceles());


    }

    @Test
    public void testIs_equilateral() throws Exception {

        //jest rownoboczny ale nie jest trojkatem
        Triangle trg = new Triangle(0,0,0);
        assertEquals(false,trg.is_equilateral());

        //nie jest rownoboczny, wszystkie kombinacje (wszystkie boki rowne, 2 boki rowne)
        //roznoboczny, wszystkie kombinacje
        trg = new Triangle(3,4,5);
        assertEquals(false,trg.is_equilateral());
        trg = new Triangle(4, 5, 3);
        assertEquals(false,trg.is_equilateral());
        trg = new Triangle(5, 3, 4);
        assertEquals(false,trg.is_equilateral());
        //rownoramienny, wszystkie kombinacje
        trg = new Triangle(3, 3, 5);
        assertEquals(false,trg.is_equilateral());
        trg = new Triangle(3, 5, 3);
        assertEquals(false,trg.is_equilateral());
        trg = new Triangle(5, 3, 3);
        assertEquals(false,trg.is_equilateral());
        //rownoboczny
        trg = new Triangle(5, 5, 5);
        assertEquals(true,trg.is_equilateral());



    }
}