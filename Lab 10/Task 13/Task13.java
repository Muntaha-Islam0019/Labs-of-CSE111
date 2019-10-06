import java.io.File;
import java.util.Scanner;
public class Task13 {
    public static void main (String [] args) {
        
        try {
            
            Scanner  s = new Scanner (new File("c:\\b.txt") ); // Should be changed every time
            
            int sum = 0;
            
            while (s.hasNext()) {
                
                int i = Integer.parseInt(s.next());
                sum += i;
            }
            
            System.out.println(sum);
            
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}