import java.util.ArrayList;

public class ActivityZeroTest {

    @org.junit.Test
    public void testSumCalorieOnlyZeros() throws Exception {

        //czy wypisuje zera
        ArrayList lista = new ArrayList<ActivityZero>();
        lista.add(new ActivityZero("1", 0));
        lista.add(new ActivityZero("2", 0));
        ActivityZero.sumCalorie(lista, lista.size(), new ArrayList<ActivityZero>(), true);
    }

    public void testSumCaloriePairsToZero() throws Exception {
        //tylko para sumuje sie do zera
        ArrayList lista = new ArrayList<ActivityZero>();
        lista.removeAll(lista);
        lista.add(new ActivityZero("1", -1));
        lista.add(new ActivityZero("2", 1));
        lista.add(new ActivityZero("3", 3));
        lista.add(new ActivityZero("4", -12));
        ActivityZero.sumCalorie(lista, lista.size(), new ArrayList<ActivityZero>(), true);
    }

    public void testSumCalorieTriplesToZero() throws Exception {
        //3 sumuja sie do zera
        ArrayList lista = new ArrayList<ActivityZero>();
        lista.removeAll(lista);
        lista.add(new ActivityZero("1", -2));
        lista.add(new ActivityZero("2", 1));
        lista.add(new ActivityZero("3", 1));
        lista.add(new ActivityZero("4", -12));
        ActivityZero.sumCalorie(lista, lista.size(), new ArrayList<ActivityZero>(), true);
    }

    public void testSumCalorieNoToZero() throws Exception {
        //zadne sie nie sumuja
        ArrayList lista = new ArrayList<ActivityZero>();
        lista.removeAll(lista);
        lista.add(new ActivityZero("1",-2));
        lista.add(new ActivityZero("2",1));
        lista.add(new ActivityZero("3",5));
        lista.add(new ActivityZero("4",-12));
        ActivityZero.sumCalorie(lista, lista.size(), new ArrayList<ActivityZero>(), true);
    }

    public void testSumCalorieEmptyNMoreThanZero() throws Exception {

        //sumCalorie od pustej list i n > 0
       ActivityZero.sumCalorie(new ArrayList<ActivityZero>(), 0, new ArrayList<ActivityZero>(), true);
    }

    public void testSumCalorieEmptyNLessThanZero() throws Exception {

        //sumCalorie od pustej list i n < 0
        ActivityZero.sumCalorie(new ArrayList<ActivityZero>(),-10,new ArrayList<ActivityZero>(),true);
    }

    public void testSumCalorieEmptyNEqualsZero() throws Exception {

        //sumCalorie od pustej list i n < 0
        ActivityZero.sumCalorie(new ArrayList<ActivityZero>(),0,new ArrayList<ActivityZero>(),true);
    }

    public void testSumCalorieNotEmptyNEqualsZero() throws Exception {
        ArrayList lista = new ArrayList<ActivityZero>();
        lista.add(new ActivityZero("1", 0));
        lista.add(new ActivityZero("2", 0));
        ActivityZero.sumCalorie(lista, 15, new ArrayList<ActivityZero>(), true);
    }
}