public class Dog extends Animal {
    
    Dog (String str) {   
        super(str);
    }
    
    @Override
    public String makeSound() {
        return super.sound;
    }
}