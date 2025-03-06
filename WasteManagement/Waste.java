package WasteManagement;

public class Waste {
    private String type;
    private int capacity;

    public Waste(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
