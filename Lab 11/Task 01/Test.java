public class Test {
    public static void main (String [] args) {
        
        Quiz3 a1 = new Quiz3();
        Quiz3 a2 = new Quiz3(5);
        msgClass msg = new msgClass();
        a1.methodA();
        a2.methodB(msg);
    }
}