package HWanimals;

public class TestClass {
    public static void main(String[] args) {
        Pike pike = new Pike(2);
        pike.eat();
        pike.swim();
        pike.reproduce();

        Lion lion = new Lion();
        lion.eat();
        lion.breathe(); //вызвался метод реализованный в классе Animal
        lion.reproduce();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.eat();
        eagle.reproduce();

//Задание 2
        pike.breathe();
        // вызывается метод breathe у щуки, по суперу идет в метод breathe у рыбы,
// а оттуда по суперу в животное. итого получаем что сначала вызывается метод breathe у животного, затем у рыбы и после у щюки



    }


}
