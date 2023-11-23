import java.io.*;
public class FileSearch {
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("Test.txt");
        FileWriter fw = new FileWriter("Test2.txt", true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();
        while((line != null))
        {
            bw.write(line.replace("Data Structure", "OOPS Java"));
            line = br.readLine();
        } 
        bw.flush();
        bw.close();
        br.close();
    }
}
