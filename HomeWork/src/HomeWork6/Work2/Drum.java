package HomeWork6.Work2;

public class Drum implements Instrument {
    int size;

    Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан " + KEY + " размером " + size);
    }
}
