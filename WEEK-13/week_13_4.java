 import java.io.FileReader;
import java.io.IOException;
public class week_13_4 {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileReader reader = new FileReader("example.txt");
            while (reader.read() != -1) {
                count++;
            }
            reader.close();
            System.out.println("Total number of characters: " + count);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

