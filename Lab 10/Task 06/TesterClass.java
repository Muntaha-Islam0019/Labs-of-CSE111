public class TesterClass {
    public static void main (String [] args) {
        
        MovableCircle m = new MovableCircle(3, 5, 35, 23, 5) ;
        
        m.moveUp() ;
        m.moveUp() ;
        m.moveLeft() ;
        m.moveLeft() ;
        m.moveLeft() ;
        m.moveRight() ;
        m.moveDown() ;
        m.moveDown() ;
        m.moveRight() ;
        m.moveUp() ;
        
        System.out.println(m);
    }
}