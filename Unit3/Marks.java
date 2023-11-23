import java.io.*;

public class Marks {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("markdetails.txt"));
        writer.write("Iron Man,80\n");
        writer.write("Captain America,66\n");
        writer.write("Thor,70\n");
        writer.write("Vision,42\n");
        writer.write("HawkEye,60\n");
        writer.write("Thanos,75\n");
        writer.write("Bhupinder Jogi,100\n");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("markdetails.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int marks = Integer.parseInt(parts[1]);
            if (marks > 70) {
                System.out.println(name);
            }
        }
        reader.close();
    }
}
