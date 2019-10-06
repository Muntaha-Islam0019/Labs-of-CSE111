public abstract class Animal {
    protected String sound = "Animal Sound";
    public Animal(){
    }
    Animal(String _sound){
        this.sound = _sound;
    }
    public abstract String makeSound();
}