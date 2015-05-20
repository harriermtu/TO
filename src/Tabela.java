import java.util.Arrays;

import static java.lang.Math.round;

/**
 * Created by user on 2015-05-20.
 */
public class Tabela {

    public int[] createTable(double wiersze, double kolumny){
        int wierszeInt = (int) round(wiersze);
        int kolumnyInt = (int) round(kolumny);
        if (wierszeInt < 1) wierszeInt=1;
        if (kolumnyInt < 1) kolumnyInt=1;
        if (wierszeInt > 75) wierszeInt=75;
        if (kolumnyInt > 75) kolumnyInt=75;
        if (wierszeInt * kolumnyInt > 4095) kolumnyInt=4095/wierszeInt;
        return new int[]{wierszeInt,kolumnyInt,wierszeInt*kolumnyInt};
    }

    public static void main(String[] args) {
        Tabela tbl = new Tabela();
        System.out.println(Arrays.toString(tbl.createTable(70, 75)));
    }
}
