public class AnimaDriver{
    public static void printSound(Animal a){
        System.out.println(a.makeSound());
    }
    public static void main(String [] args){
        Dog d1 = new Dog("bark");
        Cat c1 = new Cat("meow");
        printSound(c1);
        printSound(d1);  
    }
}
