package nw;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class maxDistTest extends TestCase {


    public void testMaxDist() throws Exception {

        //poprawna odpowiedz 5
        Integer[] tablica = new Integer[]{1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(tablica);
        assertEquals(5, maxDist.maxDist(list));

        //poprawna odpowiedz 6
        Integer[] tablica2 = new Integer[]{1,2,3,4,5,11111,1222222222};
        list = Arrays.asList(tablica2);
        assertEquals(6, maxDist.maxDist(list));

        //poprawna odpowiedz 6
        Integer[] tablica3 = new Integer[]{1,2,1,1,1,1,1,2,3,11111};
        list = Arrays.asList(tablica3);
        assertEquals(3, maxDist.maxDist(list));



    }

    public void testMaxDist2() throws Exception {

        List<Integer> list;

        //poprawna odpowiedz 5
        Integer[] tablica = new Integer[]{-6,-5,-4,-3,-2,-1};
        list = Arrays.asList(tablica);
        assertEquals(5, maxDist.maxDist(list));



    }

    public void testMaxDist3() throws Exception {

        //poprawna odpowiedz 5
        List<Integer> list;

        Integer[] tablica3 = new Integer[]{0,0,0,0,0,0};
        list = Arrays.asList(tablica3);

        assertEquals(-1, maxDist.maxDist(list));



    }
}