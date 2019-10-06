class cArea extends Point {
    
    public double radius ;
    
    cArea (double d) {
        super(d) ;
        radius = getRadius() ;
        System.out.println ( "Creating a Circle … done!" ) ;
    }
    
    double space () {
        double area = Math.PI * Math.pow(radius,2.0) ;
        return area ;
    }
    
}