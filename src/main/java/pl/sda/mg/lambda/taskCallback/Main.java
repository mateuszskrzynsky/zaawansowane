package pl.sda.mg.lambda.taskCallback;

public class Main {
    public static void main(String[] args) {
        Service service=new Service();
        service.process(3,5,(x,y)->(x+y+7));
    }
}
