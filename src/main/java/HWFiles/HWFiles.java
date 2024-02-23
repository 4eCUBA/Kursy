package HWFiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HWFiles {
    public static void main(String[] args) throws IOException {

        // Не очень понял почему ворнинги при создании директории и файлов. Насколько прочитал createNewFile возвращает тру - ессли файл создан
        // и фолс - если уже были. Но мне эта информация не впала, зачем мне ее обрабатывать?

        String test = "Hello Java";
        String path = "/Users/max/Documents/test";
        File directory = new File(path);
        directory.mkdir();
        if (directory.isDirectory()) {
            System.out.println("Directory create successful");
        }

        File firstFile = new File(path + "/firstFile.txt");
        firstFile.createNewFile();
        if (firstFile.isFile()) {
            System.out.println("First file created");
        }

        File secondFile = new File(path + "/secondFile.txt");
        secondFile.createNewFile();
        if (secondFile.isFile()) {
            System.out.println("Second file created");
        }
        try (FileWriter writer = new FileWriter(firstFile)) {
            writer.write(test);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileReader reader = new FileReader(firstFile);
        FileWriter writer2 = new FileWriter(secondFile);

        int i;
        while ((i = reader.read()) != -1) {
            writer2.write(i);
            writer2.append('\n'); //добавил что бы отличались для понимания
        }
        reader.close();
        writer2.close();

        firstFile.delete();
        secondFile.delete();
        directory.delete();


    }
}
