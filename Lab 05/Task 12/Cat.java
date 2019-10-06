public class Cat{ 
    public String color = "White"; 
    public String action = "sitting";
    
    Cat () {
        
    }
    
    Cat (String str) {
        color = str ;
    }
    
    Cat (String str , String s) {
        color = str ;
        action = s ;
    }
    
    void changeColor(String str) {
        color = str ;
    }
    
    void printCat() {
        System.out.println( color + " cat is " + action) ;
    }
} 