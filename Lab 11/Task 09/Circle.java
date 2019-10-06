

public class Circle extends Shape {
    private Point my_upperLeftCorner; 
    private double my_radius;
    
    public Circle(int x, int y,  double diameter) {
        my_upperLeftCorner= new Point(x,y);
        my_radius = diameter / 2;
    }
    
    public int getX() {
        return my_upperLeftCorner.getX();
    }  
    
    public int getY() {
        return my_upperLeftCorner.getY();
    }  
    
    public double getArea(){
        return Math.PI*Math.pow(my_radius,2);
    }
}
