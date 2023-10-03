package pl.sda.mg.myinterface;

public interface MyInterface {
    void myMethod(); //metoda abstrakcyjna
    default void showDefault(){
        System.out.println("Hello from my default method in interface");
    }
}
