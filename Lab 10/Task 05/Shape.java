public abstract class Shape {
    
    protected String color;
    protected boolean filled;
    
    Shape () {
        color = "Default color.";
    }
    
    Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor (String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public double getArea() {
        
        double area = 0.0;
        return area;
    }
    
    public double getPerimeter() {
        
        double perimeter = 0.0;
        return perimeter;
    }
    
    @Override
    public String toString() {
        String str = "The default shape's area is: " + this.getArea();
        return str;
    }
}