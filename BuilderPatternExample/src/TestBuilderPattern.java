public class TestBuilderPattern {
    public static void main(String[] args) {
        // Creating a basic computer configuration
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();
        System.out.println(basicComputer);

        // Creating a high-end computer configuration
        Computer highEndComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();
        System.out.println(highEndComputer);

        // Creating a custom computer configuration
        Computer customComputer = new Computer.Builder("AMD Ryzen 7", "16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("AMD Radeon RX 6800")
                .setOperatingSystem("Linux")
                .setBluetoothEnabled(false)
                .setWifiEnabled(true)
                .build();
        System.out.println(customComputer);
    }
}
