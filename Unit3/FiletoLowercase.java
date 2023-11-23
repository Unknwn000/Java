import java.io.*;

public class FiletoLowercase
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rb = new BufferedReader(new FileReader("Data1.txt"));
        BufferedWriter rw = new BufferedWriter(new FileWriter("Data2.txt"));

        String line = rb.readLine();
        while(line != null)
        {
            rw.write(line.toLowerCase() + "\n");
            line = rb.readLine();
        }
        rb.close();
        rw.close();
    }
}
