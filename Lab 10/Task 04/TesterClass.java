public class TesterClass {
    public static void main (String [] args) {
        
        Shape deck = new Rectangle(20.0,35.0);
        Shape bigBall = new Sphere(15.0);
        Shape tank = new Cylinder(10.0,30.0);
        
        System.out.println(deck);
        System.out.println(bigBall);
        System.out.println(tank);
        
        PaintThings p1 = new PaintThings (13.0, deck) ; // For printing the recquired paint amount
        System.out.println ( "The amount of paint needed: " + p1.amountOfPaint() ) ;
    }
}