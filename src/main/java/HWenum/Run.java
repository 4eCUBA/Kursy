package HWenum;

public class Run {

    public static void main(String[] args) {
        Time time = Time.BREAKFAST;

        switch (time){
            case BREAKFAST:
                System.out.println(Time.BREAKFAST.food);
                break;
            case LUNCH:
                System.out.println(Time.LUNCH);
                break;
            case DINNER:
                System.out.println(Time.DINNER);
        }

        //2
        Bus testBus = new Bus();
        //testBus.setBrand("");
        //testBus.setModel("");
        //testBus.setYear(1800);
        testBus.setYear(2025);

    }
}
