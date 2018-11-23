public class Flight {

    private String flightNo;
    private Plane plane;
    private Destination destination;

    //constructor
    public Flight(String flightNo, Plane plane, Destination destination) {
        this.flightNo = flightNo;
        this.plane = plane;
        this.destination = destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public Destination getDestination() {
        return this.destination;
    }

    public int getPrice() {
        return this.destination.getPrice();
    }

}
