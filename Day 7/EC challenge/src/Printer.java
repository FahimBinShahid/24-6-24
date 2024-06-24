public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagePrinted =0;
        this.tonerLevel = (tonerLevel >=0 && tonerLevel<=100)? tonerLevel: -1;
        this.duplex = duplex;
    }

    public int addTurner(int turnerAmount){
        int tempAmount = turnerAmount + tonerLevel;
        if(tempAmount > 100 || tempAmount<0){
            return -1;
        }
        tonerLevel += turnerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagePrinted += jobPages;
        return jobPages;
    }
    public int getPagePrinted(){
        return pagePrinted;
    }
}
