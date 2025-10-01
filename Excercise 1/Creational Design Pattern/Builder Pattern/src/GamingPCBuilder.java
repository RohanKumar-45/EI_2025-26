public class GamingPCBuilder implements ComputerBuilder {
    
    private Computer computer;

    public GamingPCBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu(String cpu) {
        System.out.println("  -> Installing High-Performance CPU: " + cpu);
        computer.setCpu(cpu);
    }

    @Override
    public void buildRam(int ramGB) {
        System.out.println("  -> Installing Fast DDR5 RAM: " + ramGB + " GB");
        computer.setRamGB(ramGB);
    }

    @Override
    public void buildStorage(String storage) {
        System.out.println("  -> Installing Ultra-Fast NVMe SSD: " + storage);
        computer.setStorage(storage);
    }

    @Override
    public void buildGraphicsCard(String gpu) {
        System.out.println("  -> Installing Top-Tier Graphics Card: " + gpu);
        computer.setGraphicsCard(gpu);
    }

    @Override
    public void buildCoolingSystem(boolean waterCooled) {
        if (waterCooled) {
            System.out.println("  -> Applying Advanced Water Cooling.");
            computer.setHasWaterCooling(true);
        } else {
            System.out.println("  -> Applying High-Grade Air Cooling.");
            computer.setHasWaterCooling(false);
        }
    }

    @Override
    public Computer getResult() {
        return this.computer;
    }
}
