public class Dog extends Animal implements SoundSource {
    
    Dog (String str) {
        super(str);
    }
    
    public void makeSound() {
        System.out.println(super.getName() + " is crying");
    }
}
    