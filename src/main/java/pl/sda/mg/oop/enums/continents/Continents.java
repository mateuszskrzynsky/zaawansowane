package pl.sda.mg.oop.enums.continents;

public enum Continents {
    NORTH_AMERICA(24709000),
    SOUTH_AMERICA(17840000),
    AFRICA(30370000),
    EUROPE(10180000),
    ASIA(44660000),
    AUSTRALIA(8600000),
    ANTARCTICA(14000000);

    private final int area; //km2

    Continents(int area) {
        this.area = area;
    }


    public int getArea() {
        return area;
    }

    public static Continents getLargestContinent() {
        Continents[] continents = Continents.values();
        Continents largestContinents = continents[0];

        for (Continents continent : continents) {
            if (continent.getArea() > largestContinents.getArea()) {
                largestContinents = continent;
            }
        }

        return largestContinents;
    }

    public static Continents getSmallestContinent() {
        Continents[] continents = Continents.values();
        Continents smallestContinents = continents[0];

        for (Continents continent : continents) {
            if (continent.getArea() < smallestContinents.getArea()) {
                smallestContinents = continent;
            }
        }

        return smallestContinents;
    }
}