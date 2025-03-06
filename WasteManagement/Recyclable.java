package WasteManagement;

public class Recyclable implements WasteChain {
    private WasteChain nextCollector;

    @Override
    public void setNextCollector(WasteChain nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(Waste container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Collecting and processing recyclable waste with capacity: " + container.getCapacity());
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}
