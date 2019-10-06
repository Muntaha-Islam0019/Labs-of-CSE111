class Teacher {
    
    String name , dept , course ;
    Course [] crs = new Course [10] ;
    int courseNumber = 0 ;
    
    Teacher (String n , String d) {
        name = n ;
        dept = d ;
    }
    
    void addCourse ( Course c ) {
        crs[courseNumber] = c ;
        courseNumber++ ;
    }
    
    void printDetail () {
        
        String str = "========================\nName: " + name + "\nDepartment: " + dept + "\nList of courses\n========================\n" ;
        System.out.print(str) ;
        
        for (int count = 0 ; count < courseNumber ; count++) {
            System.out.print ( crs[count].cname + "\n" ) ;
        }
        
        System.out.println("========================") ;
        
    }
}