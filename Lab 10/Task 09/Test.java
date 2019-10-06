import java.util.Scanner;
public class Test {
    public static void main (String [] args) {
        
        Student [] st = new Student [3];
        
        Scanner sc = new Scanner(System.in);
        
        for (int index = 0; index < st.length; index++) {
            
            st[index] = new Student();
            
            System.out.print( "Enter student name: ");
            st[index].setName(sc.next());
            
            System.out.print( "Enter student id: ");
            st[index].setID(sc.next());
        }
        
        for (int index1 = 0; index1 < st.length; index1++) {
            for (int index2 = index1; index2 < st.length;index2++) {
                
                if ( ( ( st[index1].getName() ).compareTo( ( st[index2].getName() ) ) ) > 0 ) {
                    
//                    String str1 = st[index1].getName();
//                    String str2 = st[index1].getID();
//                    
//                    st[index1].setName(st[index2].getName());
//                    st[index1].setID(st[index2].getID());
//                    
//                    st[index2].setName(str1);
//                    st[index2].setID(str2);
                  
                  Student temp=st[index1];
                  st[index1]=st[index2];
                  st[index2]=temp;
                    
                }
            }
        }
        
        for (int index = 0; index < st.length; index++) {
            System.out.println ( "Student name: " + st[index].getName() + " and his/her id is: " + st[index].getID() );
        }
    }
}
    