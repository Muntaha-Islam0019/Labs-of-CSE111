abstract public class Animal {
    //Name of the Animal
    private String name;
    
    //Constructor
    Animal(String _name){
        this.name = _name;
    }
    
    //Return name
    protected String getName(){
        return name;
    }
}
