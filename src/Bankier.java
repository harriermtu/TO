/**
 * Created by user on 2015-05-20.
 */
public class Bankier {

    public boolean[] czyWyslacOferteKarty(boolean dochody, boolean karta, boolean wniosek){
        //R1
        if (dochody == true && karta == true &&  wniosek == true) return new boolean[]{false,false,true};
        //R2'
        if (karta == true &&  wniosek == false) return new boolean[]{false,true,false};
        //R3
        if (dochody == true && karta == false &&  wniosek == true) return new boolean[]{true,true,true};
        //R4
        if (dochody == true && karta == false &&  wniosek == false) return new boolean[]{true,true,false};
        //R5'
        if (dochody == false &&  wniosek == true) return new boolean[]{false,false,false};
        //R6
        if (dochody == false && karta == false &&  wniosek == false) return new boolean[]{false,true,false};

        return new boolean[]{false,false,false};
    }

    public static void main(String[] args) {

    }
}
