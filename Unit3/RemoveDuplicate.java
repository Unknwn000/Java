import java.io.*;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Initial.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Final.txt"));
        HashSet<String> lines = new HashSet<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (lines.add(line)) {
                writer.write(line);
                writer.newLine();
            }
        }
        reader.close();
        writer.close();
    }
}
