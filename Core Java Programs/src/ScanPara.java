import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class ScanPara{
    public static void main(String[] args) throws FileNotFoundException {
        String s = "Hello How are you I hope you are good and healthy";
        InputStream inps = new FileInputStream(s);
        try (Scanner scan = new Scanner(inps, StandardCharsets.UTF_8.name())) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
    }
}