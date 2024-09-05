package section5;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);       // 2500 KB = 2 MB and 452 KB
        printMegaBytesAndKiloBytes(-1024);      // Invalid Value
        printMegaBytesAndKiloBytes(5000);       // 5000 KB = 4 MB and 904 KB

    }
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println((kiloBytes<0)? "Invalid Value": kiloBytes + " KB = " + kiloBytes/1024 + " MB and " + kiloBytes%1024 + " KB");
    }
}
