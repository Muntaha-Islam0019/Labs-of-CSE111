public class CheckingAccount extends Account {
    
    CheckingAccount (String str, double d) {
        super(str);
        super.setBalance(d);
    }
    
    @Override
    public void printAccountInfo () {
        
        System.out.println ( "=======================================" );
        
        System.out.println ( "Name : " + super.getName() );
        System.out.println ( "Account Number : " + super.getAccountNumber() );
        System.out.println ( "Balance : " + super.getBalance() );
        
        if ( super.getBalance() < 500.0 ) {
            System.out.println ("Your balance is less than the minimum amount");
        }
        
        System.out.println ( "=======================================" );
    }
    
    public String deposit(double d1) {
        
        String str = "";
        
        if (d1 > 0.0) {
            
            double d2 = super.getBalance();
            super.setBalance(d2+d1);
            
            str = "Deposit Successful";
            
        } else {
            str = "Please enter amount greater than Zero";
        }
        
       return str;
    }
    
    public String withdraw(double d1) {
        
        String str = "";
        
        if ( d1 < super.getBalance() && d1 > 0.0) {
            
            double d2 = super.getBalance();
            super.setBalance(d2-d1);
            
            str = "Withdraw Successful";
            
        } else if (d1 <= 0.0) {
            str = "Please enter amount greater than Zero";
        } else {
            str = "You do not have enough funds";
        }
        
        return str;
    }
}

