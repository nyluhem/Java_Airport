import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    // creates a object, before resets the object at the end of each test.
    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, "EasyJet");
        passenger = new Passenger();
    }

    // always public void as we don't want to return anything
    // get type
    @Test
    public void canGetType() {
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    // get airline
    @Test
    public void canGetAirline() {
        assertEquals("EasyJet", plane.getAirline());
    }

    // get collection of passengers
    // .size is function on arrayList in JAVA
    @Test
    public void canGetCollectionOfPassengers() {
        assertEquals(0, plane.getPassengers().size());
    }

    // plane type has a value
    @Test
    public void canGetPlaneTypeValue() {
        assertEquals(100, plane.getCapacity());
    }

    //add passenger to plane
    @Test
    public void canAddPassenger() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.getTicketsSold());

    }
}
