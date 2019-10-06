public class Author {
    
    private String name;
    private String email;
    private char gender;
    
    Author(String str1, String str2, char ch) {
        name = str1;
        email = str2;
        gender = ch;
    }
    
    public boolean isMale() {
        
        boolean flag = false ;
        
        if (gender == 'm') {
            flag = true;
        } else if (gender == 'f') {
            flag = false;
        }
        
        return flag;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String str) {
        email = str;
    }
    
    public char getGender() {
        return gender;
    }
    
    public String toString () {
        String str = name + " (" +gender+ ") at " +email ;
        return str;
    }
}