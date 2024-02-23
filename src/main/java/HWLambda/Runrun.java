package HWLambda;

public class Runrun {
    public static void main(String[] args) {
        Catculator plus = (int x, int y) -> x + y;
        Catculator minus = (int x, int y) -> x - y;
        Catculator pomnogiti = (int x, int y) -> x * y;
        Catculator podiliti = (int x, int y) -> {
            if (y == 0) {
                throw new ArithmeticException("/0 not allowed");
            }
            return x / y;
        };

        try {
            System.out.println(podiliti.calcculate(6, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(plus.calcculate(2,0));
        System.out.println(podiliti.calcculate(9,4));
        System.out.println(minus.calcculate(8,9));
        System.out.println(pomnogiti.calcculate(11,93));
    }
}
