package pl.sda.mg.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
    public void run() throws IOException {
        FileReader fileReader= new FileReader("C:\\Users\\User\\IdeaProjects\\java-workshop-opp-day1\\test");
        FileWriter fileWriter= new FileWriter("C:\\Users\\User\\IdeaProjects\\java-workshop-opp-day1\\test_kopia");

        int nextChar;

        while((nextChar=fileReader.read())!=-1){
            fileWriter.append((char)nextChar);
        }

        fileReader.close();
        fileWriter.close();
    }

}
