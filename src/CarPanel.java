/**
 * Created by user on 2015-05-20.
 */
public class CarPanel {
    private boolean WARN = false;

    public double Predkosc(double droga, double czas){
        if (czas == 0) {
            WARN =false; return 0;};
        double predkosc = droga/czas;
        if (predkosc > 120) WARN = true;
        else WARN =false;
        return predkosc;
    }

    public boolean isWARN() {
        return WARN;
    }

    public static void main(String[] args) {
    }
}
