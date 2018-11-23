import java.util.ArrayList;

public class Plane {

    //blueprint of what the plane will need
    private PlaneType type;
    private String airline;
    private ArrayList<Passenger> passengers;

    //constructor ("we build it" based on the blueprint above)
    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getType(){
        return this.type;
    }

    public String getAirline(){
        return this.airline;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public int checkPassengerSize() {
        return this.passengers.size();
    }

    public int getCapacity() {
        return this.type.getCapacity(); // this getCapacity is from ENUM
    }

}
