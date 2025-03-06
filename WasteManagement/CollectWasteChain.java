package WasteManagement;

public class CollectWasteChain implements WasteChain {
    private WasteChain nextChain;

    public CollectWasteChain() {
        this.nextChain = new Biodegradable();
        WasteChain nonBiodegradableCollector = new NonBiodegradable();
        WasteChain recyclableCollector = new Recyclable();
        WasteChain hazardousCollector = new Hazardous();

        nextChain.setNextCollector(nonBiodegradableCollector);
        nonBiodegradableCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
    }
    @Override
    public void setNextCollector(WasteChain nextChain) {
        this.nextChain = nextChain;
    }
    @Override
    public void collect(Waste container) {
        nextChain.collect(container);
    }

}
