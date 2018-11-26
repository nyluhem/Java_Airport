import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Flight flight;
    Plane planeOne;
    Plane planeTwo;
    Passenger passenger;

    @Before
    public void before() {
        planeOne = new Plane(PlaneType.BOEING747, "EasyJet");
        planeTwo = new Plane(PlaneType.AIRBUSA300, "Thompsons");
        airport = new Airport("CIA");
        flight = new Flight("A121", planeOne, Destination.NEWYORK);
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
        airport.addPlane(planeOne);
        assertEquals(1, airport.checkHangarHasPlanes());
    }

    //can remove plane from hangar
    @Test
    public void canRemovePlaneFromHangar() {
        airport.addPlane(planeOne);
        airport.addPlane(planeTwo);
        airport.removePlane(planeOne);
        assertEquals(1, airport.checkHangarHasPlanes());
    }


    //can create flight; add 2 planes, create flight1 and compare to what we expect.
    @Test
    public void canCreateFlight() {
        airport.addPlane(planeOne);
        airport.addPlane(planeTwo);
        Flight flight1 = airport.createFlight(Destination.EDINBURGH, "B100", planeOne);
        assertEquals(1, airport.checkHangarHasPlanes());
        Flight expectedFlight = new Flight ("B100", planeOne, Destination.EDINBURGH);
        assertEquals(true, flight1.getFlightNo() == expectedFlight.getFlightNo());
    }

    //can sell tickets for flights; price/ticket is in flights
    @Test
    public void canSellTicket() {
        airport.sellTicket(flight, passenger);
        assertEquals(1, planeOne.getTicketsSold());
    }
}
