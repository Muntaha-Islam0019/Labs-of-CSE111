public class VehicleUser{
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        System.out.println(car.toString());
        car.moveUp();
        System.out.println(car.toString());
        car.moveLeft();
        System.out.println(car.toString());
        car.moveDown();
        System.out.println(car.toString());
        car.moveRight();

// see, output for following two lines are same because toString() is automatically called. So, you can omit toString when printing.
        System.out.println(car.toString());
        System.out.println(car); 
    }
}
