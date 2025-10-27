package adapter;

public class VideoProjector implements VGA{
    
    @Override
    public void print(String content){
        System.out.println("-------------- video projector ---------------");
        System.out.println(content);
        System.out.println("-------------- video projector ---------------");
    }
}
