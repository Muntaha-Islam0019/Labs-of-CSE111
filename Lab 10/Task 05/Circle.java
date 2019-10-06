public class Circle extends Shape {
    
    protected double radius;
    
    Circle() {
        radius = 0.0;
    }
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        
        double area = Math.PI*radius*radius ;
        return area;
    }
    
    @Override
    public double getPerimeter() {
        
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    
    @Override
    public String toString() {
        String str = "The area of Circle is: " + this.getArea() + "\nAnd The perimeter of Circle is: " + this.getPerimeter();
        return str;
    }
}