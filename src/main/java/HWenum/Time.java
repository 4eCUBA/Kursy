package HWenum;

public enum Time {
    BREAKFAST("Coffee"),
    LUNCH("Soup"),
    DINNER("Pizza");

    final String food;

    Time(String food) {
        this.food = food;
    }
}
