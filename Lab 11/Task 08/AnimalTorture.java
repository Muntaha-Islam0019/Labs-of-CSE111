//Driver class
public class AnimalTorture {
    
    private void hugAnimal(SoundSource a){
        a.makeSound();
    }
    
    public static void main(String[] args) {
        Dog d = new Dog("Rover");
        AnimalTorture at = new AnimalTorture();
        at.hugAnimal(d);
    }
}