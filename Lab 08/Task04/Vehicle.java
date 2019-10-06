class Vehicle {
    
    public int x , y ;
    
    Vehicle () {
        x = 0 ;
        y = 0 ;
    }
    
    public void moveUp() {
        y++ ;
    }
    
    public void moveLeft() {
        x-- ;
    }
    
    public void moveDown() {
        y-- ;
    }
    
    public void moveRight() {
        x++ ;
    }
    
    @Override
    public String toString () {
        String str = "(" + x + "," + y + ")" ;
        return str ;
    }
}