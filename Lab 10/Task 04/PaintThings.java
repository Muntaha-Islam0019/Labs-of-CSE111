public class PaintThings {
    
    Paint p;
        
    PaintThings(double d, Shape s) {
        p = new Paint(d,s);
    }
    
    public double amountOfPaint() {
        
        System.out.println ( "Working on " + getClass() ) ;
        return p.amountOfPaint();
    }
}