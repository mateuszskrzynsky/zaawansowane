package pl.sda.mg.oop.abstractclaz;

public class Wrapper {
    private String firstName;
    private String lastName;

    public Wrapper(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public class InnerClass{
        public void name(){
            System.out.println(firstName);
            System.out.println(lastName);
        }
    }
}
