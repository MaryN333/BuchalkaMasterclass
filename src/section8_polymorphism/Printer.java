package section8_polymorphism;

public class Printer {
    // write code here
    private int tonerLevel;     // percentage of how much toner level is left
    private int pagesPrinted;   // count of total pages printed by Printer
    private boolean duplex;     // if true, it can print on 2 sides of a single sheet of paper

    //Constructor
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    //Getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    //Methods
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
        return -1;
    }

    public int printPages(int pages) {
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            int pagesToPrint = (pages % 2 == 0) ? pages / 2 : pages / 2 + 1;
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        pagesPrinted += pages;
        return pages;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));           // 100
        System.out.println("initial page count = " +printer.getPagesPrinted()); // initial page count = 0
        int pagesPrinted = printer.printPages(4);       // Printing in duplex mode
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());    // Pages printed was 2 new total print count for printer = 2
        pagesPrinted = printer.printPages(2);           // Printing in duplex mode
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());    // Pages printed was 1 new total print count for printer = 3
    }
}
