package pl.sda.mg.io.fileinputreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Util {
    public void runTask() throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\User\\IdeaProjects\\java-workshop-opp-day1\\test");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\User\\IdeaProjects\\java-workshop-opp-day1\\test_dwa");

        int c;
        while ((c=inputStream.read())!=-1){
            outputStream.write(c);
        }

        inputStream.close();
        outputStream.close();
    }
}
