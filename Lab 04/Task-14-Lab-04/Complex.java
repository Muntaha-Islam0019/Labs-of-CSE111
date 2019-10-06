class Complex {
    double realPart  , imaginaryPart ;

    public Complex () {
        realPart = 0 ;
        imaginaryPart = 0 ;
    }

    public Complex (double realPart, double imaginaryPart) {
        this.realPart = realPart ;
        this.imaginaryPart = imaginaryPart ;
    }

    public Complex add (Complex otherNumber) {
        double rp = realPart + otherNumber.realPart ;
        double ip = imaginaryPart + otherNumber.imaginaryPart ;
        
        Complex temp = new Complex (rp,ip) ;
        return temp ;
    }

    public Complex subtract (Complex otherNumber) {
        double rp = realPart - otherNumber.realPart ;
        double ip = imaginaryPart - otherNumber.imaginaryPart ;
        
        Complex temp = new Complex (rp,ip) ;
        return temp ;
    }

    public Complex multiply (Complex otherNumber) { // Trustees of Clark University (US).
        double rp = (realPart*otherNumber.realPart) - (imaginaryPart*otherNumber.realPart) ;
        double ip = (realPart*otherNumber.imaginaryPart) - (imaginaryPart*otherNumber.imaginaryPart) ;
        
        Complex temp = new Complex (rp,ip) ;
        return temp ;
    }

    public Complex divide (Complex otherNumber) { // Stakeoverflow. (Might be wrong)

        double rp = ((realPart * otherNumber.realPart) + (imaginaryPart * otherNumber.realPart)) / ((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart)) ;
        double ip = ((realPart * otherNumber.realPart) + (imaginaryPart * otherNumber.realPart*(-1))) / ((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart)) ;
        
        Complex temp = new Complex (rp,ip) ;
        return temp ;
    }

    public void setRealPart (double realPart) {
        this.realPart = realPart ;
    }

    public void setImaginaryPart (double realPart) {
        this.imaginaryPart = imaginaryPart ;
    }

    public double getRealPart() {
        return realPart ;
    }

    public double getImaginaryPart() {
        return imaginaryPart ;
    }

    public String toString() {
        String str = realPart + " + " +  imaginaryPart + "i" ;
        return str ;
    }
}

// Reference :

/* Trustees of Clark University (US). 2018. Complex numbers: multiplication - Clark University. [ONLINE] Available at:        https://www2.clarku.edu/faculty/djoyce/complex/mult.html. [Accessed 15 October 2018].
 * Stakeoverflow. 2018. CSE 214 , Java, complex number help. [ONLINE] Available at: https://stackoverflow.com/questions/1573250/cse-214-java-complex-number-help. [Accessed 15 October 2018]. */