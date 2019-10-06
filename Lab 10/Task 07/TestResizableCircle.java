public class TestResizableCircle {
    public static void main (String [] args) {
        
        ResizableCircle c = new ResizableCircle(5.0);
        
        System.out.println ( "Perimeter of this circle : " + c.getPerimeter() ) ;
        System.out.println ( "Area of this circle : " + c.getArea() ) ;
        
        c.resize(7);
        
        System.out.println ( "Perimeter of this circle after resizing : " + c.getPerimeter() ) ;
        System.out.println ( "Area of this circle after resizing : " + c.getArea() ) ;
    }
}