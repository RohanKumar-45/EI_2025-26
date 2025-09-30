public class BuilderPatternDemo {
    public static void main(String[] args) {
        PCManufacturer manufacturer = new PCManufacturer();

        GamingPCBuilder gamingBuilder = new GamingPCBuilder();

        Computer gamingPC = manufacturer.constructHighEndGamingPC(gamingBuilder);

        System.out.println("Client received a Gaming PC:");
        System.out.println(gamingPC);

        System.out.println("\n[Client] Starting construction of Custom Workstation...");
        GamingPCBuilder workstationBuilder = new GamingPCBuilder();

        workstationBuilder.buildCpu("Intel Xeon W");
        workstationBuilder.buildRam(128);
        workstationBuilder.buildStorage("8TB RAID Setup");
        workstationBuilder.buildGraphicsCard("NVIDIA RTX A6000"); 
        workstationBuilder.buildCoolingSystem(false); 

        Computer workstation = workstationBuilder.getResult();
        System.out.println("[Client] Custom construction finished.");

        System.out.println("Client received a Custom Workstation:");
        System.out.println(workstation);
    }
}
