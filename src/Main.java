public class Main {

    public static void main(String[] args) {

        //Test 1
        double hours = 8;
        int packages = 1200;
        double packageHour = packageHour(hours,packages);
        System.out.println("Input: [" + hours + "," + packages + "]");
        System.out.println("Output: " + packageHour);

        //Test 1
        hours = 7.5;
        packages = 1250;
        packageHour = packageHour(hours,packages);
        System.out.println("Input: [" + hours + "," + packages + "]");
        System.out.println("Output: " + packageHour);

    }

    //Function to Calculate packages per hour
    public static double packageHour(double hours, int packages) {
        return packages/hours;
    }
}
