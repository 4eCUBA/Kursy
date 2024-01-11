package HWanimals;

public abstract class Fish extends Animal {
    abstract void swim();
    @Override
    void breathe(){
        super.breathe();
        System.out.println("Bul-bul");
    }
}
