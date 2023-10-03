package pl.sda.mg.oop.abstractclaz;

public class WrapperApp {
    public static void main(String[] args) {
        Wrapper outer = new Wrapper("Mateusz","Skrzyński");
        Wrapper.InnerClass inner= outer.new InnerClass();
        inner.name();
    }
}
