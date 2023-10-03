package pl.sda.mg.polymorphism;

public class App {
    public static void main(String[] args) {
        RemoteController tvController = new TVRemoteController();
        RemoteController acController = new ACRemoteController();

        enableMyRemotes(tvController,false);
        enableMyRemotes(acController,true);
    }

    private static void enableMyRemotes(RemoteController controller,boolean bool){
        controller.enable(bool);
    }
}
