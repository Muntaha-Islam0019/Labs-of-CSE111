public class Cylinder extends Shape {
    
    protected double radius;
    protected double height;
    
    Cylinder(double d1, double d2) {
        radius = d1;
        height = d2;
    }
    
    @Override
    public double area() {
        return Math.pow( (Math.PI*radius) , 2 ) * height;
    }
    
    @Override
    public String toString() {
        String str = "Cylinder with an area of " + this.area() + " unit." ;
        return str;
    }
}