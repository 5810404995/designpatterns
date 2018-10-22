package lab9.no4;

public class SingleTour implements Tour {

    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats, int reservedSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reservedSeats = reservedSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAvailableSeats() {
        return this.allSeats - this.reservedSeats;
    }
}
