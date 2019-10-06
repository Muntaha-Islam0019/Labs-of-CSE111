public class Square extends Rectangle {
    
    Square() {
        super(0.0,0.0);
    }
    
    Square(double side) {
        super(side,side);
    }
    
    Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    
    public double getSide() {
        return super.length;
    }
    
    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }
    
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public String toString() {
        String str = "The area of Square is: " + super.getArea() + "\nAnd The perimeter of Square is: " + super.getPerimeter();
        return str;
    }
}