public class Employee extends Person {
    
    EmployeeRecord e;
    
    Employee () {
        e = new EmployeeRecord();
    }
    
    Employee (String str1, double d, int i, String str2) {
        e = new EmployeeRecord(str1,d,i,str2);
    }
    
    public void setName (String str) {
        e.setName(str);
    }
    
    public void setAnnualSalary (double d) {
        e.setAnnualSalary(d);
    }
    
    public void setWorkStart (int i) {
        e.setWorkStart(i);
    }
    
    public void setNationalInsuranceNumber (String str) {
        e.setNationalInsuranceNumber(str);
    }
    
    public String getName () {
        return e.getName();
    }
    
    public double getAnnualSalary () {
        return e.getAnnualSalary();
    }
    
    public int getWorkStart () {
        return e.getWorkStart();
    }
    
    public String getNationalInsuranceNumber () {
        return e.getNationalInsuranceNumber();
    }
    
    public boolean equals (Employee e) {
        
        boolean flag = true ;
        
        if ( (this.getName() == e.getName()) && (this.getAnnualSalary() == e.getAnnualSalary()) ) {
            flag = true;
        } else {
            flag = false;
        }
        
        return flag;
    }
}