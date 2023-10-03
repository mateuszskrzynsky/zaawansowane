package pl.sda.mg.inheritance;

public class Animal {
    String name;
    String sound;
    int age;

    public Animal(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    public void present(){
        System.out.println(name+" wydaje dźwięk "+sound+" i ma "+age+" lat.");
    }
}
