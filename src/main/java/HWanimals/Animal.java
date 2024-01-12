package HWanimals;

public abstract class Animal {
    String name;

    abstract void eat();
    abstract void reproduce();
    void breathe(){
        System.out.println("Breathe in, breathe out");
    };
}
