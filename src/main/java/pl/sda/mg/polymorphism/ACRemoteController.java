package pl.sda.mg.polymorphism;

public class ACRemoteController implements RemoteController{
    private boolean enable;
    @Override
    public void enable(boolean enable){
        this.enable=enable;
        System.out.println("Is AC working? "+this.enable);
    }
}
