import java.util.Scanner ;

public class Task03 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in) ;
        
        System.out.print ( "Enter radius of Circle: " ) ;
        double d1 = sc.nextDouble() ;
        
        Point p1 = new cArea (d1) ;
        System.out.println ( "The area of the Circle is " + p1.space() ) ;
        
        System.out.println() ;
        
        System.out.print ( "Enter radius of Sphere: " ) ;
        double d2 = sc.nextDouble() ;
        
        Point p2 = new sVolume (d2) ;
        System.out.println ( "The volume of the Sphere is " + p2.space() ) ;
        
        sc.close() ;
    }
}