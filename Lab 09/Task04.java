import java.util.*;
public class Task04{
    public static void main(String[]args){
        String kisuShongkha = "74                89          \n    45";
        StringTokenizer str = new StringTokenizer ( kisuShongkha ) ;
        
        while ( str.hasMoreTokens() ) {
            System.out.println ( str.nextElement() ) ;
        }
    }
}