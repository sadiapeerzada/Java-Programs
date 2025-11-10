import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class week_13_3 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            FileWriter writer = new FileWriter("copy.txt");
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
