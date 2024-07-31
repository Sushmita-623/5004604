public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Load and display image1
        image1.display();

        System.out.println();

        // Load and display image2
        image2.display();

        System.out.println();

        // Display image1 again (should be cached)
        image1.display();
    }
}
