package adapter;

public class CentralUnit {
    private VGA vga;

    public void steVga(VGA vga){
        this.vga = vga;
    }
    
    public void print(String s){
        vga.print(s);
    }
}
