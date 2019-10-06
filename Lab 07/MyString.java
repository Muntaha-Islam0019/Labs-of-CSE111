public class MyString{ 
    
    char [] arr ; 
    
    MyString(){ 
        
    } 
    
    MyString (char[ ] charSeq){ 
        arr = charSeq; 
    } 
    
    MyString (String str){ 
        arr = str.toCharArray(); 
    } 
    
    int length (){ 
        return arr.length; 
    } 
    
    char charAt (int n){ 
        return arr[n]; 
    } 
    
    boolean startsWith(MyString prefix){ 
        
        try {
            char [] c = prefix.arr; 
            
            boolean flag = false ;
            
            for ( int index = 0 ; index < c.length ; index++ ) { 
                
                if(this.arr[index] == c[index]){ 
                    flag = true; 
                }else{ 
                    flag = false; 
                    break ;
                } 
            }
            
            return flag ;
        } catch (Exception e) {
            return false ;
        }
    } 
    
    boolean startsWith(String prefix)
    {
        MyString tempObj = new MyString(prefix);
        return tempObj.startsWith(tempObj);
    }
    
    boolean endsWith(MyString suffix) { 
        
        
        char [] c = suffix.arr; 
        
        boolean flag = false ;
        
        for (int index = c.length - 1 , indexMain = arr.length - 1 ; index >= 0 ; index-- , indexMain--) { 
            
            if(this.arr[indexMain] == c[index]){ 
                flag = true; 
            }else{ 
                flag = false; 
                break ;
            } 
        }
        
        return flag ; 
        
    } 
    
    boolean endsWith(String suffix)
    {
        MyString tempObj = new MyString(suffix);
        return tempObj.endsWith(tempObj);
    } 
    
    MyString replaceFirst(char oldChar, char newChar){ 
        
        MyString tempObj = new MyString(arr);  
        
        for(int index = 0; index < arr.length; index++){ 
            if(tempObj.arr[index] == oldChar){ 
                tempObj.arr[index] = newChar; 
                break; 
            } 
        } 
        
        return tempObj; 
    } 
    
    MyString replaceAll(char oldChar, char newChar) { 
        
        MyString tempObj = new MyString(arr);  
        
        for(int index = 0; index < arr.length; index++){ 
            if(tempObj.arr[index] == oldChar){ 
                tempObj.arr[index] = newChar; 
            } 
        } 
        
        return tempObj; 
    } 
    
    MyString replaceLast(char oldChar, char newChar){
        
        MyString tempObj = new MyString(arr);  
        
        for(int index = arr.length-1; index >= 0; index--){ 
            if(tempObj.arr[index] == oldChar){ 
                tempObj.arr[index] = newChar; 
                break; 
            } 
        } 
        
        return tempObj; 
    } 
    
    MyString toLowerCase() { 
        
        MyString tempObj = new MyString(arr);  
        
        int lowerCount = 0; 
        for(int index = 0; index<arr.length; index++){ 
            if(((int)tempObj.arr[index] >= 97) && ((int)tempObj.arr[index] <= 122)){ 
                lowerCount++; 
            } 
        } 
        
        if(!(lowerCount == arr.length)) { 
            
            for(int index = 0; index<arr.length; index++){ 
                
                if(!((int)tempObj.arr[index] >= 97) ){ 
                    tempObj.arr[index] = (char) ((int)tempObj.arr[index] + 32); 
                } 
            } 
            
        } 
        
        return tempObj; 
    } 
    
    MyString toUpperCase(){ 
        
        MyString tempObj = new MyString(arr);  
        
        int upperCount = 0; 
        for(int index = 0; index<arr.length; index++){ 
            if(((int)tempObj.arr[index] >= 65) && ((int)tempObj.arr[index] <= 90)){ 
                upperCount++; 
            } 
        } 
        
        if(!(upperCount == arr.length)){ 
            
            for(int index = 0; index<arr.length; index++){ 
                
                if(!((int)tempObj.arr[index] <= 91) ){ 
                    tempObj.arr[index] = (char) ((int)tempObj.arr[index] - 32); 
                } 
            } 
            
        } 
        
        return tempObj; 
        
    } 
    
    boolean equals(MyString rightStr){ 
        
        try {
            char [] tempArr = rightStr.arr; 
            boolean flag = false; 
            
            for(int index = 0; index < arr.length; index++){ 
                
                if(arr[index] == tempArr[index]){ 
                    flag = true; 
                }else{ 
                    flag = false;
                    break ;
                } 
            } 
            
            return flag; 
            
        } catch ( ArrayIndexOutOfBoundsException e ) {
            
            return false ;
        }
        
    } 
    
    boolean equalsIgnoreCase(MyString rightString){ 
        
        rightString.toLowerCase() ;
        
        MyString tempObj = new MyString(arr) ;
        tempObj.toLowerCase() ;
        
        return tempObj.equals(rightString) ;
    }
    
    int compareTo(MyString str)
    {
        int returnValue = 0;
        
        for (int index = 0; index < arr.length; index++)
        {
            returnValue += arr[index] - str.arr[index] ;
        }
        
        return returnValue;
    }
    
    int compareToIgnoreCase (MyString str) {
        
        str.toLowerCase() ;
        
        MyString tempObj = new MyString(arr) ;
        tempObj.toLowerCase() ;
        
        return tempObj.compareTo(str) ;
    }
    
    MyString substring (int start) {
        
//        char [] c = new char [arr.length-start] ;
//        for ( int index = start , indexTemp = 0 ; index < arr.length ; index++ , indexTemp++ ) {
//            c[indexTemp] = arr [index] ;
//        }
//        
//        MyString tempObj = new MyString (c) ;
//        return tempObj ;
        
        int end = arr.length - 1 ;
        
        MyString tempObj = new MyString (arr) ;
        
        return tempObj.substring (start,end) ;
    }
    
    MyString substring (int start , int end) {
        
        char [] c = new char [end-start+1] ;
        for ( int index = start , indexTemp = 0 ; index <= end ; index++ , indexTemp++ ) {
            c[indexTemp] = arr [index] ;
        }
        
        MyString tempObj = new MyString (c) ;
        return tempObj ;
    }
    
    int indexOf (char ch) {
        
//        int index = -1 ;
//        
//        for ( int count = 0 ; count < arr.length ; count++ ) {
//            if ( arr[count] == ch ) {
//                index = count ;
//                break ;
//            }
//        }
//        
//        return index ;
        
        return indexOf ( ch , arr.length ) ;
    }
    
    int lastIndexOf (char ch) {
        
//        int index = -1 ;
//        
//        for ( int count = arr.length - 1 ; count >= 0  ; count-- ) {
//            if ( arr[count] == ch ) {
//                index = count ;
//                break ;
//            }
//        }
//        
//        return index ;
        
        return lastIndexOf ( ch , arr.length ) ;
    }
    
    int indexOf ( char ch, int start ) {
        
        int index = -1 ;
        
        for ( int count = start ; count < arr.length ; count++ ) {
            if ( arr[count] == ch ) {
                index = count ;
                break ;
            }
        }
        
        return index ;
    }
    
    int lastIndexOf (char ch, int start) {
        
        int index = -1 ;
        
        for ( int count = arr.length - 1 ; count >= start ; count-- ) {
            if ( arr[count] == ch ) {
                index = count ;
                break ;
            }
        }
        
        return index ;
    }
    
    int indexOf ( MyString str) {
        // Can we actually do it ?
        return -1 ;
    }
    
    int lastIndexOf (MyString str) {
        // Can we actually do it ?
        return -1 ;
    }
    
    int indexOf (String str) {
        // Can we actually do it ?
        return -1 ;
    }
    
    int lastIndexOf (String str) {
        // Can we actually do it ?
        return -1 ;
    }
    
    MyString concat (MyString str) {
        
        String s = "" ;
        
        for ( int index = 0 ; index < arr.length ; index++ ) {
            s += arr[index] ;
        }
        
        for ( int index = 0 ; index < str.arr.length ; index++ ) {
            s += str.arr[index] ;
        }
        
        MyString tempObj = new MyString (s) ;
        return tempObj ;
    }
    
    MyString concat (char[ ] charSeq) {
        
        MyString tempObj1 = new MyString (arr) ;
        MyString tempObj2 = new MyString (charSeq) ;
        
        return tempObj1.concat(tempObj2) ;
    }
    
    MyString concat (String str) {
        
        MyString tempObj1 = new MyString (arr) ;
        MyString tempObj2 = new MyString (str) ;
        
        return tempObj1.concat(tempObj2) ;
    }
}