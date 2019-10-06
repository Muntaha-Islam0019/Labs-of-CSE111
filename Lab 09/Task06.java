import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the test case quantity: ");
        int tCase = sc.nextInt();

        while (tCase != 0) {

            System.out.print("Please enter a number: ");
            int num = sc.nextInt();

            String numToString = Integer.toString(num); // As we've to split

            happyNumberTester h = new happyNumberTester(numToString); // Check the static class below

            if (h.happyOrNot) {
                System.out.println("Case #" + happyNumberTester.tC + ": " + num + " is a Happy number.");
            } else {
                System.out.println("Case #" + happyNumberTester.tC + ": " + num + " is an Unhappy number.");
            }

            tCase--;
        }
    }

    static class happyNumberTester {

        boolean happyOrNot = false; // return value tbh
        static public int tC = 0; // for counting the case

        happyNumberTester(String str) {

            while (true) {

                String[] arr = str.split(""); // splitting to get all digits

                Integer sum = 0;

                for (String index : arr) {
                    int i = Integer.parseInt(index);
                    sum += (i * i); // Square
                }

                str = Integer.toString(sum);

                if (!(str.length() > 1)) {

                    happyOrNot = str.equals("1"); // The last digit should be 1 to make the number happy

                    break;
                }
            }

            ++tC;
        }
    }

}
