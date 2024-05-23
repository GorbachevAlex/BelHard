package HomeWork6.Work2;

public class PlayingInstruments {
    public static void main(String[] args) {

        Instrument[] instrument = {new Guitar(6), new Drum(15), new Tuba(20), new Drum(10),
                new Guitar(4), new Tuba(7), new Guitar(8), new Tuba(45), new Guitar(3)};

        for (Instrument inst : instrument) {
            inst.play();
        }
    }
}
