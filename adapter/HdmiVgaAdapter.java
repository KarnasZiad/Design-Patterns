package adapter;

public class HdmiVgaAdapter implements VGA{
    protected HDMI hdmi;

    public HdmiVgaAdapter(HDMI hdmi){
        this.hdmi = hdmi;
    }

    @Override
    public void print(String s){
        hdmi.show(s.getBytes());
    }
}