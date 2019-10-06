class Account {
    
    static double interestRate = 5.0 ;
    double balance ;
    String name ;
    
    Account () {
        name = "Default Account" ;
        balance = 0.0 ;
    }
    
    Account (String str , double b) {
        name = str ;
        balance = b ;
    }
    
    String nameKi() {
        return name ;
    }
    
    double balanceKi() {
        return balance ;
    }
    
    void nameBoshao( String str ) {
        name = str ;
    }
    
    void balanceBoshao( double d ) {
        balance = d ;
    }
    
    void withdraw(double d) {
        
        double temp = balance ;
        temp -= d ;
        
        if (temp > 100) {
            balance -= d ;
            System.out.println ( "Withdraw successful! New balance is: " + balance ) ;
        } else {
            System.out.println ( "The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw" ) ;
        }
    }
}
    
    