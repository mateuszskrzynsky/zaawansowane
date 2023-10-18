package pl.sda.mg.io.bufferreader;

import java.io.*;

public class BufferedHelper {
    public void runTask() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Zapis do pliku\n");
        writer.write("Zapis do pliku2\n");
        writer.write("Zapis do pliku3\n");
        writer.write("Zapis do pliku4\n");
        writer.write("Zapis do pliku5\n");

        writer.close();

    }
    public void changeLine(String lineToChange,String newLine) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("output_after_change.txt"));

        String line;
        while ((line=in.readLine())!=null){
            if (lineToChange.equals(line)){
                out.write(newLine);
                out.write("\n");
            }else {
                out.write(line);
            }
            out.write("\n");
        }
        in.close();
        out.close();
    }
}
