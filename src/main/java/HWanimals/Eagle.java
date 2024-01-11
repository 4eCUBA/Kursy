package HWanimals;

public class Eagle extends Animal implements Bird{


    @Override
    void eat() {
        System.out.println("Find and eat");
    }

    @Override
    void reproduce() {
        System.out.println("Ho-ho-ha-ha in the sky");
    }

    @Override
    public void fly() {
        System.out.println("ez");
    }
}
