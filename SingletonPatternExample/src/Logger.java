 public class Logger {
	    
	    // Step 2: Create a private static instance of Logger
	    private static Logger instance;
	    
	    // Step 2: Private constructor to prevent instantiation
	    private Logger() {
	        // Initialization code, if needed
	    }
	    
	    // Step 3: Provide a public static method to get the instance of Logger
	    public static Logger getInstance() {
	        if (instance == null) {
	            // Create a new instance if one does not exist
	            instance = new Logger();
	        }
	        return instance;
	    }
	    
	    // Example method to log messages
	    public void log(String message) {
	        System.out.println("Log: " + message);
	    }
	}

