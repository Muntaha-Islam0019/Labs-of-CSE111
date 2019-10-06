public class ResizableCircle extends Circle implements Resizeable {
    
    ResizableCircle(double radius) {
        super.radius = radius;
    }   
        
    @Override
    public void resize(int percent) {
        super.radius = super.radius + ( (super.radius*percent)/100.0 );
    }
}