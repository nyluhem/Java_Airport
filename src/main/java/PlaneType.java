public enum PlaneType {

    BOEING747(100),
    AIRBUSA300(30),
    FOKKERF27(40),
    CESSNA402(12),
    DORNIER228(20);

    private final int capacity;

    PlaneType(int capacity) { this.capacity = capacity;}

    public int getCapacity() { return capacity; }

}
