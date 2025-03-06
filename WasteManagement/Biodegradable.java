package WasteManagement;

public class Biodegradable implements WasteChain {
    private WasteChain nextCollector;

    @Override
    public void setNextCollector(WasteChain nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(Waste container) {
        if (container.getType().equalsIgnoreCase("biodegradable")) {
            System.out.println("Collecting and disposing Biodegradable waste with capacity: " + container.getCapacity());
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}
