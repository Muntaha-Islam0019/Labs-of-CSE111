public class Rectangle extends Shape {
    private Point my_upperLeft;
    private double my_width;
    private double my_height;
    
    public Rectangle(int x, int y, double height, double width){
        my_upperLeft = new Point(x, y);
        my_width = width;
        my_height = height;
    }
    
    public int getX()  { 
        return my_upperLeft.getX();
    }  
    
    public int getY()  { 
        return my_upperLeft.getY();
    }  
    
    public double getArea() { 
        return my_width * my_height;
    }
}