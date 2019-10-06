public class Guitar extends Instrument {
    
    @Override
    void play() {
        System.out.println("In the playing method of Guitar");
    }
    
    @Override
    void adjust() {
        System.out.println("In the adjusting method of Guitar");
    }
    
    @Override
    void compose() {
        System.out.println("In the composing method of Guitar");
    }
}