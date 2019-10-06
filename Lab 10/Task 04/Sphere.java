public class Sphere extends Shape {
    
    protected double radius;
    
    Sphere(double d) {
        radius = d;
    }
    
    @Override
    public double area() {
        return Math.pow( (4*Math.PI*radius) , 2 );
    }
    
    @Override
    public String toString() {
        String str = "Sphere with an area of " + this.area() + " unit." ;
        return str;
    }
}