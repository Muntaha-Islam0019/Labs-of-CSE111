import java.util.Scanner;

public class Task17 {
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String str = sc.nextLine();
        
        char [] chArr = str.toCharArray();
        
        for ( char c : chArr ) {
            
            int i = (int) c + 1;
            
            System.out.print( (char) i );
        }
        
        System.out.println();
    }
}