package HomeWork6.Work2;

public class Guitar implements Instrument {
    int chord;

    Guitar(int chord) {
        this.chord = chord;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара " + KEY + " на " + chord + " струнах");
    }
}
