public class Trim {
    public static char [] trim(char [] input) {
        
        char [] modifiedArr = new char [input.length] ;
        
        modifiedArr [0] = input [0] ;
        int count = 1 ;
        
        for ( int index = 1 ; index < input.length ; index++ ) {
            if ( input[index] == 32 ) {
                if ( modifiedArr[count-1] != 32 ) {
                    modifiedArr[count] = input[index] ;
                    count++ ;
                }
            } else {
                modifiedArr[count] = input[index] ;
                count++ ;
            }
        }
        
        return modifiedArr ;
    }
    
    public static void main(String [] args){
        char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
        for (int i = 0; i< input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");
        char []  output = trim(input);
        for (int i = 0; i< output.length; i++){
            System.out.print(output[i]);
        }
        System.out.println("");    
    }
}
