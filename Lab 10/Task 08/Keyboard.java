public class Keyboard extends Instrument {
    
    @Override
    void play() {
        System.out.println("In the playing method of Keyboard");
    }
    
    @Override
    void adjust() {
        System.out.println("In the adjusting method of Keyboard");
    }
    
    @Override
    void compose() {
        System.out.println("In the composing method of Keyboard");
    }
}