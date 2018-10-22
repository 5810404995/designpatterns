package lab9.no4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {

    private SingleTour tourKohChang;
    private SingleTour tourKohKradad;
    private PackageTour tourTrat;

    @BeforeEach
    void setup() {
        tourKohChang = new SingleTour("Tour Koh Chang", 400, 100, 40);
        tourKohKradad = new SingleTour("Tour Koh Kradad", 300,50,20);
        tourTrat = new PackageTour("Tour Trat");
        tourTrat.addTour(tourKohChang);
        tourTrat.addTour(tourKohKradad);
    }

    @Test
    void addTour() {
        SingleTour tourKohKood = new SingleTour("Tour Koh Kood", 200, 80, 50);
        assertEquals(2, tourTrat.getToursSize());
        tourTrat.addTour(tourKohKood);
        assertEquals(3, tourTrat.getToursSize());
    }

    @Test
    void removeTour() {
        assertEquals(2, tourTrat.getToursSize());
        tourTrat.removeTour(tourKohChang);
        assertEquals(1, tourTrat.getToursSize());
    }

    @Test
    void getPrice() {
        assertEquals(630, tourTrat.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(30, tourTrat.getAvailableSeats());
    }

    @Test
    void getName() {
        assertEquals("Tour Trat", tourTrat.getName());
    }
}
