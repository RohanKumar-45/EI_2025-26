public interface ComputerBuilder {

    void buildCpu(String cpu);
    void buildRam(int ramGB);

    void buildStorage(String storage);
    void buildGraphicsCard(String gpu);
    void buildCoolingSystem(boolean waterCooled);

    Computer getResult();
}