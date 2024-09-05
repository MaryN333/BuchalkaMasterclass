package section5;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));     // true
        System.out.println(shouldWakeUp (false, 2));    //false
        System.out.println(shouldWakeUp (true, 8));     //false
        System.out.println(shouldWakeUp (true, -1));    //false
    }

    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking){
            return barking;
        }
        barking = ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23) ? true : false;
        return barking;
    }
}
