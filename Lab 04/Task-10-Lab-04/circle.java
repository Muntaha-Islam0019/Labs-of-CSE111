public class circle {

    private double radius ;
    private String color ;

    circle () {
        radius = 1.0 ;
        color = "red" ;
    }

    circle (double rad) {
        radius = rad ;
    }

    double getRadius () {
        return radius ;
    }

    double area () {
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        return areaOfCircle ;
    }
}