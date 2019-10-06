public class TesterClass {
    public static void main ( String [] args ) {
        
        Employee e1 = new Employee() ;
        Employee e2 = new Employee() ;
        
        e1.setName("Ahsan");
        e1.setAnnualSalary(1000000.0);
        e1.setWorkStart(2022);
        e1.setNationalInsuranceNumber("18QA23");
        
        e2.setName("Moony");
        e2.setAnnualSalary(10.0);
        e2.setWorkStart(3022);
        e2.setNationalInsuranceNumber("19PP46");
        
        System.out.println ( e1.getName() + " equals to " + e2.getName() + ": " + e1.equals(e2) ) ;
    }
}