public class PCManufacturer {

    public Computer constructHighEndGamingPC(ComputerBuilder builder) {
        System.out.println("\n[Director] Starting construction of High-End Gaming PC...");
        builder.buildCpu("Intel Core i9 / AMD Ryzen 9");
        builder.buildRam(64);
        builder.buildStorage("2TB NVMe SSD");
        builder.buildGraphicsCard("NVIDIA GeForce RTX 4090");
        builder.buildCoolingSystem(true);
        System.out.println("[Director] Construction finished.");

        return builder.getResult();
    }

}