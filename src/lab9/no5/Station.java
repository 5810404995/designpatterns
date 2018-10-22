package lab9.no5;

public class Station {

    private String name;
    private int position;
    private static double pricePerDistance = 15;

    public Station(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public static double getPricePerDistance() {
        return pricePerDistance;
    }
}
