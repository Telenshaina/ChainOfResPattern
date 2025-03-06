package WasteManagement;

public interface WasteChain {
    void setNextCollector(WasteChain nextCollector);
    void collect(Waste container);
}
