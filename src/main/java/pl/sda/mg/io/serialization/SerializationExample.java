package pl.sda.mg.io.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Jan Kowalski",20);

        //serializacja do pliku
        try (FileOutputStream fileOutputStream= new FileOutputStream("personKowalski.ser");
             ObjectOutputStream
        outputStream=new ObjectOutputStream(fileOutputStream)){
            outputStream.writeObject(student);
            System.out.println("Obiekt został zserializowany do pliku");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //deserializacja

        try(FileInputStream fileInputStream = new FileInputStream("personKowalski.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            Student readStudent = (Student) objectInputStream.readObject();

            System.out.println("obiekt odtworzony z pliku: "+readStudent);
        }
    }
}
