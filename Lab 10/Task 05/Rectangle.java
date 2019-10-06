public class Rectangle extends Shape {
    
    protected double width;
    protected double length;
    
    Rectangle() {
        width = 0.0;
        length = 0.0;
    }
    
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    
    @Override
    public double getArea() {
        
        double area = width*length ;
        return area;
    }
    
    @Override
    public double getPerimeter() {
        
        double perimeter = 2*(length+width);
        return perimeter;
    }
    
    @Override
    public String toString() {
        String str = "The area of Rectangle is: " + this.getArea() + "\nAnd The perimeter of Rectangle is: " + this.getPerimeter();
        return str;
    }
}