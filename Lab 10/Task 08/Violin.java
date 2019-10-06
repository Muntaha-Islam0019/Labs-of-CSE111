public class Violin extends Instrument {
    
    @Override
    void play() {
        System.out.println("In the playing method of Violin");
    }
    
    @Override
    void adjust() {
        System.out.println("In the adjusting method of Violin");
    }
    
    @Override
    void compose() {
        System.out.println("In the composing method of Violin");
    }
}