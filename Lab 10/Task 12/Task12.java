import java.io.File;
import java.util.Scanner;
public class Task12 {
    public static void main (String [] args) {
        
        try {
            
            Scanner  s = new Scanner (new File("c:\\a.txt") ); // Should be changed every time
            
            String line;
            int sum = 0;
            
            while (s.hasNextLine()) {
                
                line = s.nextLine();
                int i = Integer.parseInt(line);
                sum += i;
            }
            
            System.out.println(sum);
            
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}