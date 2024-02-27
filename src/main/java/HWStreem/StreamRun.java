package HWStreem;

import java.util.ArrayList;
import java.util.List;

public class StreamRun {
    public static void main(String[] args) {
        List <User> users = new ArrayList<>();

        users.add(new User("Bobby", "Chan", 21, "gfsgfs@gmial.com"));
        users.add(new User("Vika", "Kuk", 22, "hgfhggii@gmail.com"));
        users.add(new User("Jesus", "Bogovich", 33, "nvnmmmms@gmail.com"));
        users.add(new User("Allah", "Bogovich", 35, "nvjjoooo@gmail.com"));
        users.add(new User("Tony", "Howk", 30, "nbnbhhhhf4@gmail.com"));

        //1
        users.stream()
                .filter(user -> user.getAge() > 25)
                .map(user -> user.getSurname())
                .distinct()
                .forEach(System.out::println);

        //2
        String result = users.stream()
                .filter(user -> user.getSurname().length() < 8)
                .map(user -> user.getName())
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found"));

        System.out.println(result);

    }
}
