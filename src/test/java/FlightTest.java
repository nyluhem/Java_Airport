import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA300, "EasyJet");
        flight = new Flight("A121", plane, Destination.NEWYORK);
    }

    //has a plane
    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    //has a flight number
    @Test
    public void canGetFlightNo() {
        assertEquals("A121", flight.getFlightNo());
    }

    //has a destination
    @Test
    public void canGetDestination() {
        assertEquals(Destination.NEWYORK, flight.getDestination());
    }

    //destination has a price
    @Test
    public void canGetDestinationPrice() {
        returnFlight();
        assertEquals(1800, flight.getPrice());
    }

    public void returnFlight() {
        System.out.printf("%s", plane, flight);
    }

}
