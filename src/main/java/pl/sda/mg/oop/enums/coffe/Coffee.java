package pl.sda.mg.oop.enums.coffe;

public enum Coffee {

    LATTE(Milk.NATURAL,15),
    CAPPUCCINO(Milk.OAT,20),
    AMERICANO(Milk.SOY,10),
    ESPRESSO(Milk.NONE,18);
    private Milk milk;
    private int price;

    public Milk getMilk() {
        return milk;
    }

    public int getPrice() {
        return price;
    }

    Coffee(Milk milk, int price) {
        this.milk = milk;
        this.price = price;
    }
}
