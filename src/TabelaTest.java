import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.*;

public class TabelaTest {
    private static final Tabela tbl = new Tabela();

    @Test
    public void testCreateTable() throws Exception {

        // = 1
        assertTrue(Arrays.equals(new int[]{1,30,30},tbl.createTable(1,30)));
        // maks = 75
        assertTrue(Arrays.equals(new int[]{75,10,750},tbl.createTable(75,10)));
        // maks = 75 ~ 4095
        assertTrue(Arrays.equals(new int[]{70,58,58*70},tbl.createTable(70,75)));
        // 63 * 65 = 4095
        assertTrue(Arrays.equals(new int[]{63,65,4095},tbl.createTable(63,65)));
        // < 1
        assertTrue(Arrays.equals(new int[]{1,15,15},tbl.createTable(0.5,15)));
        // < 0
        assertTrue(Arrays.equals(new int[]{1,33,33},tbl.createTable(-5,33)));
        // > 75 > 75
        assertTrue(Arrays.equals(new int[]{75,54,54*75},tbl.createTable(100,76)));
        // > 4095
        assertTrue(Arrays.equals(new int[]{64,63,64*63},tbl.createTable(64,64)));
        // 0.5 -> 75.499
        assertTrue(Arrays.equals(new int[]{1,5,5},tbl.createTable(0.5,5)));
        assertTrue(Arrays.equals(new int[]{75,3,75*3},tbl.createTable(75.499,3)));

        // 0.5 -> 75.499
        assertTrue(Arrays.equals(new int[]{6,1,6},tbl.createTable(6,0.5)));
        assertTrue(Arrays.equals(new int[]{8,75,8*75},tbl.createTable(8,75.499)));

    }
}