public class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading " + imageName + " from remote server...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + imageName);
    }
}
