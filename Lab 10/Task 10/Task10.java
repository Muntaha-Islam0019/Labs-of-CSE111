// Still Partially solved, 50% output is wrong

import java.util.Scanner;

public class Task10 {

    static int xOfRobot;
    static int yOfRobot;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // x co-ordinate of upper-right corner of the ground : 
        int xOfGround = sc.nextInt();

        // y co-ordinate of upper-right corner of the ground : 
        int yOfGround = sc.nextInt();

        int[][] arrOfPositons = new int[xOfGround+1][yOfGround+1];

        
        do {
            
            // initial x co-ordinate of the robot : 
            xOfRobot = sc.nextInt();

            // initial y co-ordinate of the robot : 
            yOfRobot = sc.nextInt();

            // orientation of the robot : 
            String orientation = sc.next();

            String[] arrOfOrders = sc.next().split("");

            String lostOrNot = "" ;
            
            for (String arrOfOrder : arrOfOrders) {

                if (!(arrOfOrder.equals("F"))) {
                    orientation = findOrientation(orientation, arrOfOrder);
                } else {

                    if (arrOfPositons[xOfRobot][yOfRobot] != 1) {
                        
                        switch (orientation) {
                            case "N":
                                yOfRobot++;
                                break;
                            case "S":
                                yOfRobot--;
                                break;
                            case "E":
                                xOfRobot++;
                                break;
                            case "w":
                                xOfRobot--;
                                break;
                            default:
                                break;
                        }

                        if (xOfRobot > xOfGround || yOfRobot > yOfGround || xOfRobot < 0 || yOfRobot < 0) { 

                            switch (orientation) {
                                case "N":
                                    yOfRobot--;
                                    break;
                                case "S":
                                    yOfRobot++;
                                    break;
                                case "E":
                                    xOfRobot--;
                                    break;
                                case "w":
                                    xOfRobot++;
                                    break;
                                default:
                                    break;
                            }

                            arrOfPositons[xOfRobot][yOfRobot] = 1 ;
                            lostOrNot = " LOST" ;
                            break ;
                        } else {
                            lostOrNot = "" ;
                        }
                    }
                }
            }

            System.out.println (xOfRobot + " " + yOfRobot + " " + orientation + lostOrNot );

        } while (sc.hasNext()) ;
    }

    static String findOrientation(String str1, String str2) {

        String finalOrientation = "";

        switch (str1) {
            case "N":
                if (str2.equals("L")) {
                    finalOrientation = "W";
                } else if (str2.equals("R")) {
                    finalOrientation = "E";
                }
                break;
            case "S":
                if (str2.equals("L")) {
                    finalOrientation = "E";
                } else if (str2.equals("R")) {
                    finalOrientation = "W";
                }
                break;
            case "E":
                if (str2.equals("L")) {
                    finalOrientation = "N";
                } else if (str2.equals("R")) {
                    finalOrientation = "S";
                }
                break;
            case "W":
                if (str2.equals("L")) {
                    finalOrientation = "S";
                } else if (str2.equals("R")) {
                    finalOrientation = "N";
                }
                break;
            default:
                break;
        }

        return finalOrientation;
    }
}
