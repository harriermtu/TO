import java.util.ArrayList;

public class ActivityZeroTest {

    @org.junit.Test
    public void testSumCalorie() throws Exception {

        //sumCalorie od pustej list i n > 0
        //ActivityZero.sumCalorie(new ArrayList<ActivityZero>(),10,new ArrayList<ActivityZero>(),true);

        //czy wypisuje zera
        ArrayList lista = new ArrayList<ActivityZero>();
        lista.add(new ActivityZero("1",0));
        lista.add(new ActivityZero("2",0));
        ActivityZero.sumCalorie(lista,lista.size(),new ArrayList<ActivityZero>(),true);

        //tylko para sumuje sie do zera
        lista.removeAll(lista);
        lista.add(new ActivityZero("1",-1));
        lista.add(new ActivityZero("2",1));
        lista.add(new ActivityZero("3",3));
        lista.add(new ActivityZero("4",-12));
        ActivityZero.sumCalorie(lista,lista.size(),new ArrayList<ActivityZero>(),true);

        //3 sumuja sie do zera
        lista.removeAll(lista);
        lista.add(new ActivityZero("1",-2));
        lista.add(new ActivityZero("2",1));
        lista.add(new ActivityZero("3",1));
        lista.add(new ActivityZero("4",-12));
        ActivityZero.sumCalorie(lista, lista.size(), new ArrayList<ActivityZero>(), true);

        //zadne sie nie sumuja
        lista.removeAll(lista);
        lista.add(new ActivityZero("1",-2));
        lista.add(new ActivityZero("2",1));
        lista.add(new ActivityZero("3",5));
        lista.add(new ActivityZero("4",-12));
        ActivityZero.sumCalorie(lista, lista.size(), new ArrayList<ActivityZero>(), true);
    }


    @org.junit.Test
    public void testShowSum() throws Exception {

    }
}