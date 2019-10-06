public class EmployeeRecord extends Person {
    
    private double annualSalary; 
    private int workStart;
    private String nationalInsuranceNumber;
    
    EmployeeRecord () {
        
    }
    
    EmployeeRecord (String str1, double d, int i, String str2) {
        this.setName(str1);
        this.setAnnualSalary(d);
        this.setWorkStart(i);
        this.setNationalInsuranceNumber(str2);
    }
    
    public void setName (String str) {
        super.name = str;
    }
    
    public void setAnnualSalary (double d) {
        annualSalary = d;
    }
    
    public void setWorkStart (int i) {
        workStart = i;
    }
    
    public void setNationalInsuranceNumber (String str) {
        nationalInsuranceNumber = str;
    }
    
    public String getName () {
        return super.name;
    }
    
    public double getAnnualSalary () {
        return annualSalary;
    }
    
    public int getWorkStart () {
        return workStart;
    }
    
    public String getNationalInsuranceNumber () {
        return nationalInsuranceNumber;
    }
}