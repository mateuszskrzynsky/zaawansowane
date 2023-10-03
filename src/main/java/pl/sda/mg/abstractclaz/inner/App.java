package pl.sda.mg.abstractclaz.inner;

public class App {
    public static void main(String[] args) {
        Outer outeClaz = new Outer();
        Outer.Inner inner = outeClaz.new Inner();

        System.out.println(outeClaz.toString());

        System.out.println(inner.getStatusClaz());

        Outer.NestedStatic staticNested = new Outer.NestedStatic();

        System.out.println(staticNested.getStatusClaz());

        outeClaz.localCluzExample();


    }
}
