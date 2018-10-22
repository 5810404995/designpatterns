package lab9.no4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleTourTest {

    private SingleTour tourKohChang;

    @BeforeEach
    void setup() {
        tourKohChang = new SingleTour("Tour Koh Chang", 400, 100, 40);
    }

    @Test
    void setPrice() {
        assertEquals(400, tourKohChang.getPrice());
        tourKohChang.setPrice(500);
        assertEquals(500, tourKohChang.getPrice());
    }

    @Test
    void setAllSeats() {
        assertEquals(60, tourKohChang.getAvailableSeats());
        tourKohChang.setAllSeats(150);
        assertEquals(110, tourKohChang.getAvailableSeats());
    }

    @Test
    void setReservedSeats() {
        assertEquals(60, tourKohChang.getAvailableSeats());
        tourKohChang.setReservedSeats(80);
        assertEquals(20, tourKohChang.getAvailableSeats());
    }

    @Test
    void testSetName() {
        assertEquals("Tour Koh Chang", tourKohChang.getName());
        tourKohChang.setName("Koh Chang Trip");
        assertEquals("Koh Chang Trip", tourKohChang.getName());
    }

    @Test
    void getPrice() {
        assertEquals(400, tourKohChang.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(60, tourKohChang.getAvailableSeats());
    }

    @Test
    void getName() {
        assertEquals("Tour Koh Chang", tourKohChang.getName());
    }
}