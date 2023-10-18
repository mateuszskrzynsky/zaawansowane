package pl.sda.mg.io.bufferreader;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedHelper helper = new BufferedHelper();

        helper.runTask();
        helper.changeLine("Zapis do pliku\n","Trzecia linia");

    }
}
