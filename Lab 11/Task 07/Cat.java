public class Cat extends Animal {
    
    Cat (String str) {   
        super(str);
    }
    
    @Override
    public String makeSound() {
        return super.sound;
    }
}