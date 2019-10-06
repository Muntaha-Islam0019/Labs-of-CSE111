public class Paint {
    
    protected double coverage;
    protected double area;
    
    Paint (double d, Shape s) {
        this.coverage = d;
        area = s.area();
    }
    
    public double amountOfPaint() {
        
        System.out.println ( "Working on " + getClass() ) ;
        
        double d = area/coverage;
        return d;
    }
}