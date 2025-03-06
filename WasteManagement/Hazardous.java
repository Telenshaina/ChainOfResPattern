package WasteManagement;

public class Hazardous implements WasteChain{
    private WasteChain nextCollector;

    @Override
    public void setNextCollector(WasteChain nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(Waste container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Collecting and safely disposing hazardous waste with capacity: " + container.getCapacity());
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("No collector available for waste type: " + container.getType());
        }
    }
}
