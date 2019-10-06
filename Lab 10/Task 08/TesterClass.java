public class TesterClass {
    public static void main (String [] args) {
        
        Instrument g = new Guitar();
        Instrument v = new Violin();
        Instrument k = new Keyboard();
        
        g.play();
        v.play();
        
        k.adjust();
        v.adjust();
        
        g.compose();
        k.compose();
        
    }
}