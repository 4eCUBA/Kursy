package HWanimals;

public class Pike extends Fish{

    private int size;

    public Pike(int size) {
        this.size = size;
    }

    @Override
    void eat() {
        System.out.println("Mnom-mnom");
    }

    @Override
    void reproduce() {
        System.out.println("Ho-ho-ha-ha");

    }

    @Override
    void breathe() {
        super.breathe();
        System.out.println("I am pike, and I Bul-bul");

    }

    @Override
    void swim() {
        System.out.println("Easy for me");

    }
}
