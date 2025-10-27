package adapter;

public class Main {
    public static void main(String[] args) {
        CentralUnit cu = new CentralUnit();
        cu.steVga(new VideoProjector());
        cu.print("hello world");

        HDMI hdmi = new TV();
        cu.steVga(new HdmiVgaAdapter(hdmi));
        cu.print("hello world from hdmi adapter");
    }
}
