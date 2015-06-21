package nw;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class maxDistTest extends TestCase {

    public void testOneElementArray1() throws Exception {

        //poprawna odpowiedz 0
        Integer[] tablica = new Integer[]{1};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(-1, maxDist.maxDist(list));
    }

    public void testOneElementArray2() throws Exception {
        //poprawna odpowiedz 0
        Integer[] tablica = new Integer[]{-3};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(-1, maxDist.maxDist(list));
    }

    public void testOneElementArray3() throws Exception {
        //poprawna odpowiedz 0
        Integer[] tablica = new Integer[]{4};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(-1, maxDist.maxDist(list));



    }

    public void testMaxDistSequence() throws Exception {

        //poprawna odpowiedz 5
        Integer[] tablica = new Integer[]{1, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(5, maxDist.maxDist(list));
    }

    public void testMaxDistSequenceLong() throws Exception {
        //poprawna odpowiedz 6
        Integer[] tablica = new Integer[]{1, 2, 3, 4, 5, 11111, 1222222222};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(6, maxDist.maxDist(list));
    }

    public void testMaxDistSequenceRandom() throws Exception {
        //poprawna odpowiedz 6
        Integer[] tablica = new Integer[]{1,2,1,1,1,1,1,2,3,11111};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(3, maxDist.maxDist(list));



    }

    public void testMaxDistSubzero() throws Exception {

        List<Integer> list;

        //poprawna odpowiedz 5
        Integer[] tablica = new Integer[]{-6,-5,-4,-3,-2,-1};
        list = Arrays.asList(tablica);
        assertEquals(5, maxDist.maxDist(list));



    }

    public void testMaxDistZeroArray() throws Exception {

        //poprawna odpowiedz 5
        List<Integer> list;

        Integer[] tablica3 = new Integer[]{0,0,0,0,0,0};
        list = Arrays.asList(tablica3);

        assertEquals(-1, maxDist.maxDist(list));



    }
}