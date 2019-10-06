class sVolume extends Point {
    
    public double radius ;
    
    sVolume (double d) {
        super(d) ;
        radius = getRadius() ;
        System.out.println ( "Creating a Sphere … done!" ) ;
    }
    
    double space () {
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3.0) ;
        return volume ;
    }
    
}