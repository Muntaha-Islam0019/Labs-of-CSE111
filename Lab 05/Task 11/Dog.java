public class Dog { 
    private String color = "Black";
    
    Dog (String str) {
        color = str ;
    }
    
    void bark () {
        String str = color + " dog is barking" ;
        System.out.println (str) ;
    }
    
    void changeColor (String str) {
        color = str ;
    }
} 
