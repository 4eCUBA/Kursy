public class TestRun {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "X5", 2);
        Car Audi = new Car("AUDI", "A4", 2);
        Car BMWsame = new Car("BMW", "X5", 2);


        System.out.println(BMW.toString());
        System.out.println(Audi.toString());

        System.out.println(BMW.equals(Audi));
        System.out.println(BMW.equals(BMWsame));
        System.out.println(BMW.equals(BMW));

        //Задание 3, домашка 7
        BMW.setV(0);

    }
}
