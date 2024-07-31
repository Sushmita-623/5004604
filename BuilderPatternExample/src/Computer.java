import Computer.Builder;

public class Computer {
	    // Attributes
	    private String CPU;
	    private String RAM;
	    private String storage;
	    private String graphicsCard;
	    private String operatingSystem;
	    private boolean isBluetoothEnabled;
	    private boolean isWifiEnabled;

	    // Private constructor to prevent direct instantiation
	    private Computer(Builder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.storage = builder.storage;
	        this.graphicsCard = builder.graphicsCard;
	        this.operatingSystem = builder.operatingSystem;
	        this.isBluetoothEnabled = builder.isBluetoothEnabled;
	        this.isWifiEnabled = builder.isWifiEnabled;
	    }

	    // Getters
	    public String getCPU() {
	        return CPU;
	    }

	    public String getRAM() {
	        return RAM;
	    }

	    public String getStorage() {
	        return storage;
	    }

	    public String getGraphicsCard() {
	        return graphicsCard;
	    }

	    public String getOperatingSystem() {
	        return operatingSystem;
	    }

	    public boolean isBluetoothEnabled() {
	        return isBluetoothEnabled;
	    }

	    public boolean isWifiEnabled() {
	        return isWifiEnabled;
	    }

	    @Override
	    public String toString() {
	        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
	                ", graphicsCard=" + graphicsCard + ", operatingSystem=" + operatingSystem +
	                ", isBluetoothEnabled=" + isBluetoothEnabled + ", isWifiEnabled=" + isWifiEnabled + "]";
	    }

	    // Builder Class
	    public static class Builder {
	        // Required parameters
	        private String CPU;
	        private String RAM;

	        // Optional parameters - initialized to default values
	        private String storage = "256GB";
	        private String graphicsCard = "Integrated";
	        private String operatingSystem = "Windows 10";
	        private boolean isBluetoothEnabled = false;
	        private boolean isWifiEnabled = true;

	        // Builder constructor with required parameters
	        public Builder(String CPU, String RAM) {
	            this.CPU = CPU;
	            this.RAM = RAM;
	        }

	        // Setter methods for optional parameters
	        public Builder setStorage(String storage) {
	            this.storage = storage;
	            return this;
	        }

	        public Builder setGraphicsCard(String graphicsCard) {
	            this.graphicsCard = graphicsCard;
	            return this;
	        }

	        public Builder setOperatingSystem(String operatingSystem) {
	            this.operatingSystem = operatingSystem;
	            return this;
	        }

	        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
	            this.isBluetoothEnabled = isBluetoothEnabled;
	            return this;
	        }

	        public Builder setWifiEnabled(boolean isWifiEnabled) {
	            this.isWifiEnabled = isWifiEnabled;
	            return this;
	        }

	        // Build method to create Computer instance
	        public Computer build() {
	            return new Computer(this);
	        }
	    }
	}