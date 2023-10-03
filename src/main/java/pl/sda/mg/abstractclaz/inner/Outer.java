package pl.sda.mg.abstractclaz.inner;

public class Outer {
    @Override
    public String toString() {
        return "Mój toString";
    }

    public static class NestedStatic {
        public NestedStatic() {
        }
        public String getStatusClaz(){
            return clazStatus;
        }
        String clazStatus ="static inner claz";

    }

    public class Inner {
        public Inner() {
        }
        public String getStatusClaz(){
            return clazStatus;
        }
    String clazStatus = "inner claz";
    }
    public void localCluzExample(){
        class LocalInner {
            public void innerMethod(){
                System.out.println("Hello from inner local claz!");
            }
        }
        LocalInner localInner= new LocalInner();
        localInner.innerMethod();
    }
}
