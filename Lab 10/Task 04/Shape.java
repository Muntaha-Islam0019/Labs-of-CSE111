public abstract class Shape {
    
    protected String shapeName;
    
    public abstract double area();
    
    @Override
    public String toString() {
        String str = "Default shape.";
        return str;
    }
}