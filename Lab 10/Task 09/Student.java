public class Student implements StInterface {
    
    String name;
    String id;
    String address_field;
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void setID(String id) {
        this.id = id;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getID() {
        return id;
    }
}
    
    