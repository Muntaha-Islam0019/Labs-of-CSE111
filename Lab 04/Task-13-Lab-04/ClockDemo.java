class ClockDemo {
  public static void main(String[] args) {
    Clock firstClock = new Clock (7255) ; 

    System.out.println ("Ticking 10 times in first clock\n") ;

    for (int count = 1 ; count <= 10 ; count++) {
        firstClock.tick() ;
        if (firstClock.seconds > 59 ) {
            firstClock.seconds = 0 ;
            ++firstClock.minutes ;
        }        
        System.out.println (firstClock.toString()) ;
    }

    Clock secondClock = new Clock (13, 34, 19) ;

    System.out.println ("\nTicking 10 times in second clock\n") ;

    for (int count = 1 ; count <= 10 ; count++) {
        secondClock.tick() ;        
        if (secondClock.seconds > 59 ) {
            secondClock.seconds = 0 ;
            ++secondClock.minutes ;
        }
        System.out.println (secondClock.toString()) ;
    }

    firstClock.addClock(secondClock) ;
    System.out.println ("\nTime in first clock after adding second clock : " + firstClock.toString()) ;
    System.out.println ("Time in second clocksecond : " + secondClock.toString() ) ;

    Clock thirdClock ;
    thirdClock = firstClock.subtractClock(secondClock) ;
    System.out.println ("Time in third clocksecond after using subtractClock() between firstClock and secondClock : " + thirdClock.toString() ) ;
  }
}