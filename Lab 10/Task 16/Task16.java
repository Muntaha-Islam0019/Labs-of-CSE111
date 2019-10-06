import java.io.File;

public class Task16{
    public static void main (String [] args) {
        
        File f = new File("G:\\File to delete.txt"); // Should be changed every time
        
        boolean delete = f.delete();
        
        System.out.println(delete);
    }
}