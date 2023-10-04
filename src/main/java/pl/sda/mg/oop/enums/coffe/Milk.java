package pl.sda.mg.oop.enums.coffe;

public enum Milk {
    NATURAL("zwykłe"),
    SOY("sojowe"),
    OAT("owsiane"),
    NONE("bez mleka");

    private String plName;

    public String getPlName() {
        return plName;
    }

    Milk(String plName) {
        this.plName = plName;
    }
}
