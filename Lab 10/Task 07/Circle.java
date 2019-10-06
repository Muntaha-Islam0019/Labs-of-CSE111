public class Circle implements GeometricObject {
    
    protected double radius = 1.0;
    
    Circle() {
        
    }
    
    Circle (double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}