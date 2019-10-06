import java.io.File;
import java.util.Scanner;
public class Task15 {
    public static void main (String [] args) {
        
        try {
            
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Please enter a file location. I'm gonna calculate sum of those numbers what is in that file.");
            String str = sc.nextLine();
            
            Scanner  s = new Scanner ( new File(str) ); 
            
            int sum = 0;
            
            while (s.hasNextInt()) {
                
                int i = s.nextInt();
                sum += i;
            }
            
            System.out.println(sum);
            
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}