public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(40,true);
        System.out.println("Initial page count =" +printer.getPagePrinted());

        int pagePrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer Total: %d %n" ,
                pagePrinted, printer.getPagePrinted());

        pagePrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, Printer Total: %d %n" ,
                pagePrinted, printer.getPagePrinted());

    }
}