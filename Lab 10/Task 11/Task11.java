import java.io.File;
import java.util.Scanner;
public class Task11 {
    public static void main (String [] args) {
        
        try { 
            
            Scanner  s = new Scanner (new File("c:\\a.txt") ); // Should be changed every time
            
            int sum = 0;
            
            do {
                
                String ektaLine;
                ektaLine = s.nextLine();
                int x = Integer.parseInt(ektaLine); 
                
                sum += x;
                
            } while (s.hasNext());
            
            System.out.println(sum);
            
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}