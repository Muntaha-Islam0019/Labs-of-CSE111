class Main {
    public static void main(String[] args) {

        /*
         * BankAccount acc1 = new BankAccount() ; BankAccount acc2 = new BankAccount() ;
         * BankAccount acc3 = new BankAccount() ;
         * 
         * acc1.setName("Messi") ; acc2.setName("Ronaldo") ; acc3.setName("Neymar") ;
         * 
         * acc1.setAccountID("10") ; acc2.setAccountID("7") ; acc3.setAccountID("11") ;
         * 
         * acc1.setAddress("Road 10/B") ; acc2.setAddress("Road 7/R") ;
         * acc3.setAddress("Road 11/K") ;
         * 
         * acc1.setBalance(100.78) ; acc2.setBalance(78.68) ; acc3.setBalance(54.18) ;
         */

        BankAccount acc1 = new BankAccount("John Legend", "1910AB1056", "Road 5/A", 13.6);
        BankAccount acc2 = new BankAccount("Mike Sinodha", "1920AD1056", "Road 7/B", 13.3);
        BankAccount acc3 = new BankAccount("Carol Jane", "1930GB1056", "Road 3/C", 13.9);

        acc1.addInterest();
        acc3.addInterest();

        System.out.println("The name of the user is : " + acc1.getName());
        System.out.println("The ID of the user is : " + acc1.getAccountID());
        System.out.println("The address of the user is : " + acc1.getAddress());
        System.out.println("The balance of the user is : " + acc1.getBalance());
        acc1.addInterest();
        System.out.println("The balance of the user after interest is : " + acc1.getBalance());
        System.out.println();

        System.out.println("The name of the user is : " + acc2.getName());
        System.out.println("The ID of the user is : " + acc2.getAccountID());
        System.out.println("The address of the user is : " + acc2.getAddress());
        System.out.println("The balance of the user is : " + acc2.getBalance());
        System.out.println();

        System.out.println("The name of the user is : " + acc3.getName());
        System.out.println("The ID of the user is : " + acc3.getAccountID());
        System.out.println("The address of the user is : " + acc3.getAddress());
        System.out.println("The balance of the user is : " + acc3.getBalance());
        acc1.addInterest();
        System.out.println("The balance of the user after interest is : " + acc3.getBalance());
        System.out.println();
    }
}