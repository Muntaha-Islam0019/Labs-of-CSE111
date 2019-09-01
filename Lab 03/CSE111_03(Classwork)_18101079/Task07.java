import java.util.* ;
public class Task07 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in) ; 
        
        System.out.println ( "Please enter a word. A word of at least 5 length will throw no error." ) ;
        String str = sc.next() ;
        
        String strBackup = str ;
        
        // compareTo
        
        System.out.print ( "After comparing : " ) ;
        System.out.println ( str.compareTo(strBackup) ) ;
        
        /* returns 0 if similar 
         * returns a value less than 0 if the argument is a string lexicographically greater than this string
         * returns a value greater than 0 if the argument is a string lexicographically less than this string */
        
        System.out.println () ;
        
        
        
        
        // compareToIgnoreCase
        
        System.out.print ( "After comparing by ignoring cases : " ) ;
        System.out.println ( str.compareToIgnoreCase(strBackup) ) ; // same thing, just it ignores case
        
        System.out.println () ;
        
        
        
        
        // startsWith
        
        System.out.print ( "Do it starts with \"A\" ? : " ) ;
        System.out.println ( str.startsWith( "A" ) ) ; 
        
        /* returns true if str starts with the desired string
         * though it only compares string with string
         * so you can't use charAt or any char
         * or it'll return : char cannot be converted to java.lang.String */
        
        System.out.println () ;
        
        
        
        
        // endsWith
        
        System.out.print ( "Do it ends with \"A\" ? : " ) ;
        System.out.println ( str.endsWith( "A" ) ) ; 
        
        /* returns true if str ends with the desired string
         * though it only compares string with string
         * so you can't use charAt or any char
         * or it'll return : char cannot be converted to java.lang.String */
        
        System.out.println () ;
        
        
        
        
        // equals
        
        System.out.print ( "After comparing by \"equals\" method : " ) ;
        System.out.println ( str.equals(strBackup) ) ;
        
        /* returns true if similar 
         * returns false if not 
         * obviously better than compareTo */
        
        System.out.println () ;
        
        
        
        
        // equalsIgnoreCase
        
        System.out.print ( "After comparing by \"equalsIgnoreCase\" method : " ) ; 
        System.out.println ( str.equalsIgnoreCase(strBackup) ) ;
        
        /* returns true if similar 
         * returns false if not 
         * just like better way of compareToIgnoreCase */
        
        System.out.println () ;
        
        
        
        
        // indexOf
        
        System.out.print ( "What is the first index of \"A\" in this word ? : " ) ;
        System.out.println ( str.indexOf( 'A' ) ) ; 
        
        /* returns first index of desired string in that word
         * though it can compare string with char */
        
        System.out.println () ;
        
        
        
        
        // lastIndexOf
        
        System.out.print ( "What is the last index of \"A\" in this word ? : " ) ;
        System.out.println ( str.lastIndexOf( 'A' ) ) ; 
        
        /* returns last index of desired string in that word
         * though it can compare string with char */
        
        System.out.println () ;
        
        
        
        
        // length
        
        // though I already used it in Task01 :3
        System.out.print ( "What is the length of this word ? : " ) ;
        System.out.println ( str.length() ) ; 
        
        System.out.println () ;
        
        
        
        
        // replace(char oldChar, char newChar)
        
        System.out.print ( "After replacing the 1st char with \"N\" : " ) ;
        System.out.println ( str.replace( str.charAt(0)  , 'N' ) ) ;
        
        /* one can replace a char with a char
         * or a string with a string
         * not a char with a string
         * or a string with a char 
         * or it'll throw : no suitable method found for replace(java.lang.String,char) */
        
        System.out.println () ;
        
        
        
        
        // substring
        
        System.out.print ( "Printing from 0 index till 5 : " ) ;
        System.out.println ( str.substring( 0 , 5 ) ) ;
        
        /* prints from 0 index till 5
         * and yes till 5 
         * means from 0 to 4 actually */
        
        System.out.println () ;
        
        
        
        
        // toCharArray
        
        char [] arr = str.toCharArray() ;
        
        /* string is actually an array of chars
         * though this method denotes that perfectly */
        
        System.out.print ( "The character array is : " ) ;
        for ( char count : arr ) {
            System.out.print ( " " + count ) ; 
        }
        System.out.println () ;
        
        System.out.println () ;
        
        
        
        
        // toLowerCase
        
        System.out.print ( "In lower case : " ) ;
        System.out.println ( str.toLowerCase() ) ; // turns the whole string in lower case
        
        System.out.println () ;
        
        
        
        
        // toUpperCase
        
        System.out.print ( "In upper case : " ) ;
        System.out.println ( str.toUpperCase() ) ; // turns the whole string in upper case
        
        System.out.println () ;
        
        
        
        
        // trim
        
        String strBackupWithWhiteSpace = "        " + str + "        " ;
        
        System.out.println ( "String with white space : " + strBackupWithWhiteSpace ) ;
        System.out.print ( "String without white space or after trimming : " ) ;
        System.out.println(strBackupWithWhiteSpace.trim() );
        
        // trims the white space of back and front
        
        System.out.println () ;
        
        
        
        
        // valueOf
        
        String strBackupWithNumbers = "19" + str + "47" ;
        System.out.println ( "Output in string : " ) ;
        System.out.println ( String.valueOf(strBackupWithNumbers) ) ;
        
        /* literally prints everything as string
         * even prints strings as string 
         * which doesn't even make any sense :3 */
        
    }
}
        