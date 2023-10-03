package pl.sda.mg.myinterface;

public class App {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.showDefault();
        myInterface.myMethod();

        MyInterface anonimClaz = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from anonymous claz");
            }
        };
        anonimClaz.showDefault();
        anonimClaz.myMethod();

    }
}
