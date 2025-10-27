package adapter;

public class TV implements HDMI{
    @Override
    public void show(byte[] content){
        System.out.println("-------------------------TV----------------------");
        System.out.println(new String(content));
        System.out.println("-------------------------TV----------------------");    
    }
}
