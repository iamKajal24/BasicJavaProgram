package BasicProgram;

public class LeapYear {
    public static void isLeapYear(int year) {
        boolean isLeapYear = false;

        // Check for leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If divisible by 100, it must also be divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                // Divisible by 4 but not by 100
                isLeapYear = true;
            }
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " : Leap Year");
        } else {
            System.out.println(year + " : Non Leap Year");
        }
    }

    public static void main(String[] args) {
        isLeapYear(2000); // Leap Year
        isLeapYear(2021); // Non Leap Year
        isLeapYear(1900); // Non Leap Year
        isLeapYear(2400); // Leap Year
    }
}
