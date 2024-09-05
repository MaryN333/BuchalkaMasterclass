package section5;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));    // 1
        System.out.println(toMilesPerHour(10.25));  // 6
        System.out.println(toMilesPerHour(-5.6));  // -1
        System.out.println(toMilesPerHour(25.42));  // 16
        System.out.println(toMilesPerHour(75.114));  // 47

        printConversion(1.5);       // 1.5 km/h = 1 mi/h
        printConversion(10.25);     // 10.25 km/h = 6 mi/h
        printConversion(-5.6);      // Invalid Value
        printConversion(25.42);     //25.42 km/h = 16 mi/h
        printConversion(75.114);    // 75.114 km/h = 47 mi/h
    }

    // write code here
    public static long toMilesPerHour(double kilometersPerHour) {
        long result = -1;
        if (kilometersPerHour >= 0) {
            result = Math.round(kilometersPerHour / 1.609);
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
