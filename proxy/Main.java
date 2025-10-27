package proxy;

public class Main {
    public static void main(String[] args) {
        Service service = new Proxy();
        Client c = new Client(service);
        c.doWork();
        c.doWork();
        c.doWork();
        c.doWork();
    }
}
