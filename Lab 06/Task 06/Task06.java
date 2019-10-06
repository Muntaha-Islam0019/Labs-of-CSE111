class Task06 {
    
    public static int [] arrayModifier (int arr [] , int size) {
        
        int negCount = 0 ;
        
        for (int index = 0 ; index < size ; index++) {
            if ( arr[index] < 0 ) {
                negCount++ ;
            }
        }
        
        int [] modifiedArray = new int [negCount] ;
        
        for (int index = 0 , indexOfModifiedArr = 0 ; index < size ; index++ , indexOfModifiedArr++ ) {
            if ( arr[index] < 0 ) {
                indexOfModifiedArr-- ;
            } else {
                modifiedArray[indexOfModifiedArr] = arr[index] ;
            }
        }
        
        return modifiedArray ;
    }
}
