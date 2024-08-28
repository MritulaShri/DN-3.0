public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from server and displayed
        image1.display();
        System.out.println();

        // Image will be displayed directly from cache
        image1.display();
        System.out.println();

        // Image will be loaded from server and displayed
        image2.display();
        System.out.println();

        // Image will be displayed directly from cache
        image2.display();
    }
}
