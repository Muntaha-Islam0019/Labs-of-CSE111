public class TesterClass{
    
    public static void main (String [] args) {
        
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        
        System.out.println( a1.getNoise() );
        System.out.println( a2.getNoise() );
    }
}