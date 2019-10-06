class Main {
    public static void main(String[] args) {

        /*
         * Student john = new Student() ; Student mike = new Student() ; Student carol =
         * new Student() ;
         */

        Student john = new Student("John Legend", "1910AB1056", "Road 5/A", 3.6);
        Student mike = new Student("Mike Sinodha", "1920AD1056", "Road 7/B", 3.3);
        Student carol = new Student("Carol Jane", "1930GB1056", "Road 3/C", 3.9);

        /*
         * john.setName("John Legend") ; mike.setName("Mike Sinodha") ;
         * carol.setName("Carol Jane") ;
         * 
         * john.setID("1910AB1056") ; mike.setID("1920AD1056") ;
         * carol.setID("1930GB1056") ;
         * 
         * john.setAddress("Road 5/A") ; mike.setAddress("Road 7/B") ;
         * carol.setAddress("Road 3/C") ;
         * 
         * john.setCGPA(3.6) ; mike.setCGPA(3.3) ; carol.setCGPA(3.9) ;
         */

        System.out.println("The name of the student is : " + john.getName());
        System.out.println("The ID of the student is : " + john.getID());
        System.out.println("The address of the student is : " + john.getAddress());
        System.out.println("The CGPA of the student is : " + john.getCGPA());
        System.out.println();

        System.out.println("The name of the student is : " + mike.getName());
        System.out.println("The ID of the student is : " + mike.getID());
        System.out.println("The address of the student is : " + mike.getAddress());
        System.out.println("The CGPA of the student is : " + mike.getCGPA());
        System.out.println();

        System.out.println("The name of the student is : " + carol.getName());
        System.out.println("The ID of the student is : " + carol.getID());
        System.out.println("The address of the student is : " + carol.getAddress());
        System.out.println("The CGPA of the student is : " + carol.getCGPA());
        System.out.println();
    }
}