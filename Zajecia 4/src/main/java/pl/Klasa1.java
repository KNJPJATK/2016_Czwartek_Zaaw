package pl;

/**
 * Created by rpi on 03.11.16.
 */
public class Klasa1 {

    public int get2() {
        return 5;
    }

    public int get8() {
        return 2;
    }

    public int getIncreased(int number) {
        assert(number > 0);
        return number--;
    }

    public void metodaKtoraNicNieZwraca() {
        System.err.println("Nic nie zwracam");
    }

}
