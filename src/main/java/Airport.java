import java.util.ArrayList;

public class Airport {
    //blueprint
    private String code;
    private ArrayList<Plane> hangar; //ext to make array. Only allows 5 for example.

    //constructor
    public Airport(String code) {
      this.code = code;
      this.hangar = new ArrayList<>();
    }

    //methods
    public String getCode() {
        return this.code;
    }

    public ArrayList<Plane> returnHangar () {return this.hangar; }

    public int checkHangarHasPlanes() {
        return this.hangar.size();
        }

    public void addPlane(Plane plane) {
        this.hangar.add(plane);
    }

    public void removePlane(Plane plane) {
        this.hangar.remove(plane);
    }


    public Flight createFlight(Destination destination, String flightCode, Plane plane) {
        Flight flight = new Flight(flightCode, plane, destination);
        this.removePlane(plane);
        return flight;
    }

    //check capacity and sell ticket if space
    public void sellTicket(Flight flight, Passenger passenger) {
        Plane plane = flight.getPlane();
        if (plane.getCapacity() > plane.getTicketsSold()) {
            plane.addPassenger(passenger);
        }
    }


}
