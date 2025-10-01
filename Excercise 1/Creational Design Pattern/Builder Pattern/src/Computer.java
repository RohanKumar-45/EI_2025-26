public class Computer {
    
    private String cpu;
    private int ramGB;

    
    private String storage;
    private String graphicsCard;
    private boolean hasWaterCooling;

    public Computer() {
        this.cpu = "Generic CPU";
        this.ramGB = 8;
        this.storage = "500GB SSD";
        this.graphicsCard = "Integrated Graphics";
        this.hasWaterCooling = false;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setHasWaterCooling(boolean hasWaterCooling) {
        this.hasWaterCooling = hasWaterCooling;
    }

    @Override
    public String toString() {
        return "--- Computer Configuration ---\n" +
               "CPU: " + cpu + "\n" +
               "RAM: " + ramGB + " GB\n" +
               "Storage: " + storage + "\n" +
               "GPU: " + graphicsCard + "\n" +
               "Cooling: " + (hasWaterCooling ? "Water Cooled" : "Air Cooled") + "\n" +
               "----------------------------";
    }
}
