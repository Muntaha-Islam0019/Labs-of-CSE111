class Student {
    
    String name = "default name" ; 
    static int numberOfStudents = 0 ;
    
    Student () {
        numberOfStudents++ ;
    }
    
    Student (String str) {
        name = str ;
        numberOfStudents++ ;
    }
    
    String getName () {
        return name ;
    }
}
    
    