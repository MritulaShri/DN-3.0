public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Creating different configurations of Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA GeForce RTX 3080")
                .setMotherboard("ASUS ROG Strix")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .setCaseType("Tower")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("Integrated")
                .setMotherboard("MSI Pro Series")
                .setPowerSupply("500W")
                .setCoolingSystem("Air Cooling")
                .setCaseType("Mini Tower")
                .build();

        Computer budgetComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .setGPU("Integrated")
                .setMotherboard("Gigabyte B450")
                .setPowerSupply("400W")
                .setCoolingSystem("Air Cooling")
                .setCaseType("Compact")
                .build();

        // Print the configurations
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
        System.out.println("Budget Computer: " + budgetComputer);
    }
}
