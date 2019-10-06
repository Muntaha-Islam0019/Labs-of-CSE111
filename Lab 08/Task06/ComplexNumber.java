class ComplexNumber extends RealNumber {
    
    private double imaginaryValue;
    
    ComplexNumber() {
        setRealValue (1.0) ;
        imaginaryValue = 1.0 ;
    }
    
    ComplexNumber(double d1 , double d2) {
        setRealValue (d1) ;
        imaginaryValue = d2 ;
    }
    
    @Override
    public String toString() {
        return "RealPart: "+ getRealValue() + "\n" + "ImaginaryPart: " + imaginaryValue ;
    }
    
    public void check () {
        System.out.println ( "I'm in ComplexNumber class" ) ;
        ping() ;
        System.out.println ( "Checking ended." ) ;
    }
}