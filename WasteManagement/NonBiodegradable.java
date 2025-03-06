package WasteManagement;

public class NonBiodegradable implements WasteChain {
    private WasteChain nextCollector;

    @Override
    public void setNextCollector(WasteChain nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(Waste container) {
        if (container.getType().equalsIgnoreCase("nonbiodegradable")) {
            System.out.println("Collecting and disposing Non-Biodegradable waste with capacity: " + container.getCapacity());
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}
