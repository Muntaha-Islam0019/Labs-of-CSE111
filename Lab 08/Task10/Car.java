class Car {
    
    private static int carCount = 0 ;
    private int year ;
    
    Car (int year) {
        this.year = year ;
        carCount++ ;
    }
    
    public int getYear () {
        return year ;
    }
    
    public static int getObjectCount () {
        return carCount ;
    }
}