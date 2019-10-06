public class Rectangle extends Shape {
    
    protected double length;
    protected double width;
    
    Rectangle (double d1, double d2) {
        length = d1;
        width = d2;
    }
    
    @Override
    public double area() {
        return length*width ;
    }
    
    @Override
    public String toString() {
        String str = "Rectangle with an area of " + this.area() + " unit." ;
        return str;
    }
}