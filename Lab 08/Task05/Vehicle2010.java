class Vehicle2010 extends Vehicle {
    
    public void moveUpperRight () {
        moveUp() ;
        moveRight() ;
    }
    
    public void moveUpperLeft () {
        moveUp() ;
        moveLeft() ;
    }
    
    public void moveLowerRight () {
        moveDown() ;
        moveRight() ;
    }
    
    public void moveLowerLeft () {
        moveDown() ;
        moveLeft() ;
    }
    
    public boolean equals (Object other) {
        
        if (other == this) return true ;
        if (other == null) return false ;
        
        if ( getClass() != other.getClass() ) return false ;
        
        Vehicle2010 v = (Vehicle2010) other ;
        
        return ( x == v.x && y == v.y ) ;
    }
}