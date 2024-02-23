package HWFiles;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Sobaka", 3, 4);

        //туда
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.dat"))) {
            oos.writeObject(cat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //сюда
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat.dat"))) {
            Cat desCat = (Cat) ois.readObject();
            System.out.println(desCat);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
