package pl.sda.mg.lambda.taskCallback;

public class Service {
    public void process(int x, int y, MyCallback cb){
        System.out.println(cb.add(x,y));
    }
}
