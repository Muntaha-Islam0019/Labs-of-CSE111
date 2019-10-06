public class ShapesTwo{
    public static void main(String[] args){
        int n = 3;
        Shape[] shapes = new Shape[n];
        
        shapes[0] = new Circle(5, 10, 2.0);
        shapes[1] = new Rectangle(40, 10, 3.25, 5.75);
        shapes[2] = new Circle(15, 30, 4.0);
        
        for (int i = 0; i < n; i++){
            System.out.println(i + ") " + shapes[i].getArea() + " at " +shapes[i].getX() + ", " + 
                               shapes[i].getY());
        }
    }
}
