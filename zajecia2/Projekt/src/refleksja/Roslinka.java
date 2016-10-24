package refleksja;

/**
 * Created by rpi on 20.10.2016.
 */
public class Roslinka {

    private Double wysokosc;

    public Roslinka(Double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(Double wysokosc) {
        this.wysokosc = wysokosc;
    }

    private void podlej() {
        System.out.println("Podlana");
    }

    @Override
    public String toString() {
        return "Roslinka{" +
                "wysokosc=" + wysokosc +
                '}';
    }
}
