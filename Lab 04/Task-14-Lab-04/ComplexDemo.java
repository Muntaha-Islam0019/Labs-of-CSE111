class ComplexDemo {
  public static void main(String[] args) {

    // 1st constructor
    Complex firstOne = new Complex() ;

    firstOne.setRealPart(3) ;
    firstOne.setImaginaryPart(19) ;

    System.out.println ( "First complex number is : " + firstOne.toString() + "\n" ) ;

    // 2nd Constructor
    Complex secondOne = new Complex(12,34) ;
    System.out.println ( "Second complex number is : " + secondOne.toString() + "\n" ) ;

    // 3rd Constructor 
    Complex thirdOne  ;
    thirdOne = firstOne.add(secondOne) ;
    thirdOne = firstOne.subtract(secondOne) ;
    System.out.println ( "Third complex number is : " + thirdOne.toString() + "\n" ) ;

    // 4th Constructor
    Complex fourthOne  ;
    fourthOne = firstOne.multiply(secondOne) ;
    fourthOne = firstOne.divide(secondOne) ;
    System.out.println ( "Fourth complex number is : " + fourthOne.toString() + "\n" ) ;
  }
}