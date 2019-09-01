import java.util.Scanner; 
public class Task10
{ 
    public static void main (String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        int [] numbers=new int [10]; // counter array .. every index will denote that index numbers occurance
        
        for (int c=0 ; c>=0 ; c++) // an infinite loop
        { 
            numbers[sc.nextInt()]++;
            
            /* It means the number I take ..
             * at that index position the value will increase by one .. */
            
            int found = 0; // A counter to find the occurance of each number
            
            for (int n = 0 ; n<numbers.length ; n++) 
            { 
                if(numbers[n] >= 2 && numbers[n] < 5) // as the number have to appear for at least 2 times and less than 5 times
                {
                    found++; 
                } 
            }    
            if (found == 2) // as I have to get out at most 2 numbers
            { 
                int count = 0; // counter of how much numbers I've got
                
                for (int p = 0 ; p < numbers.length ; p++)
                {
                    if(numbers[p] > 1 && numbers[p] < 5)
                        
                        /* as i have to print those numbers ..
                         * which have appeared for at least 2 times and less than 5 times .. */
                    {
                        System.out.print(p); // print the desired number
                        count++;
                        if(count == 1) // only for 1st output
                        { 
                            System.out.print(", "); // as the example shows us there is a comma between two outputs
                        }
                    } 
                }
                System.out.print("."); // and a fullstop too :3
                break; // or the loop will run infinite times
            } 
        } 
    } 
}