public class Animal {
    
    protected String name;
    
    Animal () {
        name = "Default name";
    }
    
    public String getName () {
        return name;
    }
    
    public String getNoise () {
        return "Default noise";
    }   
}