class Student {
    
    String name , id , add ;
    double cgpa ;
    
    
    Student () {
        name = "Ei name e kono student nai" ;
        id = "Student ei nai, abar id :P" ;
        add = "Naam nai .. thikana ashbe koi theke?" ;
        cgpa = -4.0 ;
    }
    
    Student (String str1 , String str2 , String str3 , double d) {
        name = str1 ;
        id = str2 ;
        add = str3 ;
        cgpa = d ;
    }
    
    String nameDao () {
        return name ;
    }
    
    String boloToAmiKe() {
        return id ;
    }
    
    String addressDao() {
        return add ;
    }
    
    double cgpaDao () {
        return cgpa ;
    }
    
    void nameBoshao (String str) {
        name = str ;
    }
    
    void addressBoshao (String str) {
        add = str ;
    }
    
    void idBoshao (String str) {
        id = str ;
    }
    
    void cgpaBoshao (double d) {
        cgpa = d ;
    }
    
    void standUp () {
        System.out.println ( name + " is now standing up!!" ) ;
    }
    
    String tellMeYourName() {
        String str = "Sir, my name is " + name ;
        return str ;
    }
    
    void call (String str) {
        System.out.println ( name + ": Hey, " + str + ", Sir is calling you!!" ) ;
    }
    
    int add2Numbers (int i1 , int i2) {
        return (i1+i2) ;
    }
}