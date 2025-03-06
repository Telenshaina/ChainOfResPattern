package WasteManagement;

public class WMS_Automated {
    public static void main(String[] args) {
        CollectWasteChain collectWasteChain = new CollectWasteChain();

        Waste biodegradable = new Waste("biodegradable", 50);
        Waste nonbiodegradable = new Waste("nonbiodegradable", 70);
        Waste recyclable = new Waste("recyclable", 30);
        Waste hazardous = new Waste("hazardous", 10);
       
        collectWasteChain.collect(biodegradable);
        collectWasteChain.collect(nonbiodegradable);
        collectWasteChain.collect(recyclable);
        collectWasteChain.collect(hazardous);

    }
}
