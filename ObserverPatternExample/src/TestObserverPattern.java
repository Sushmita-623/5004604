public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        // Set new stock price and notify observers
        stockMarket.setStockPrice(100.0);

        System.out.println();

        // Deregister one observer and notify again
        stockMarket.deregisterObserver(mobileApp2);
        stockMarket.setStockPrice(150.0);
    }
}
