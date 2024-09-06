package section5;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));     // false
        System.out.println(isCatPlaying(false, 36));    // false
        System.out.println(isCatPlaying(false, 35));    // true
        System.out.println(isCatPlaying(false, 25));    // true
        System.out.println(isCatPlaying(true, 45));     // true
    }
    // write code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int difference = summer ? 10 : 0;
        return temperature >= 25 && temperature <= 35 + difference;
    }
}
