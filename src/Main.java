
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {

        //Test 1
        test(3,400);

        //Test 2
        test(7.5,1200);

        //Test 2
        test(5.5,1200);

        // Test 3
        Scanner myObj = new Scanner(System.in);  // Scanner

        System.out.println("Enter hours worked:");
        String hoursString = myObj.nextLine();  // Read user input
        System.out.println("Enter packages:");
        String packagesString = myObj.nextLine();  // Read user input

        //converting String to double
        double hours = Double.parseDouble(hoursString);
        int packages = Integer.parseInt(packagesString);

        test(hours,packages);
        // Test 3 end
    }

    //Function to Calculate packages per hour
    public static double packageHour(double hours, int packages) {
        return packages/hours;
    }

    //Tester
    public static void test(double hours, int packages) {
        System.out.println("Input: [" + hours + "," + packages + "]");
        System.out.println("Output: " + String.format("%.2f", packageHour(hours,packages)));
    }
}
