import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, "EasyJet");
        airport = new Airport("CIA");
        flight = new Flight("A121", plane, Destination.NEWYORK);
    }

    //has a code
    @Test
    public void checkAirportHasCode() {
        assertEquals("CIA", airport.getCode());
    }

    //has a hangar
    @Test
    public void checkAirportHasHangar() {
        assertEquals(0, airport.checkHangarHasPlanes());
    }

    //can add plane to hangar
    @Test
    public void canAddPlaneToHangar() {
        airport.addPlane(plane);
        assertEquals(1, airport.checkHangarHasPlanes());
    }

    //can remove plane from hangar
    @Test
    public void canRemovePlaneFromHangar() {
        airport.addPlane(plane);
        airport.addPlane(plane);
        airport.removePlane(plane);
        assertEquals(1, airport.checkHangarHasPlanes());
    }

    //can create flight; add 2 planes, create flight1 and compare to what we expect.
    @Test
    public void canCreateFlight() {
        airport.addPlane(plane);
        airport.addPlane(plane);
        Flight flight1 = airport.createFlight(Destination.EDINBURGH, "B100", plane);
        assertEquals(1, airport.checkHangarHasPlanes());
        Flight expectedFlight = new Flight ("B100", plane, Destination.EDINBURGH);
        assertEquals(true, flight1.getFlightNo() == expectedFlight.getFlightNo());
    }

    //can sell tickets for flights; price/ticket is in flights
    @Test
    public void canSellTicket() {
        airport.sellTicket(flight, passenger);
        assertEquals(1, plane.checkPassengerSize());
    }
}
