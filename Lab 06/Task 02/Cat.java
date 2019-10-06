public class Cat{ 
    public String color = "White"; 
    public String action = "sitting"; 

    Cat () {
        
    }
    
    Cat (String str) {
        color = str ;
    }
             
    Cat (String str1, String str2) {
        color = str1 ;
        action = str2 ;
    }
    
    void printCat () {
        System.out.println ( color + " cat is " + action ) ;
    }
    
    void changeColor (String str) {
        color = str ;
    }
} 
