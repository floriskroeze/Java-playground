public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {

        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        int newAmount = tonerAmount + tonerLevel;

        if (newAmount > 100 || newAmount < 0) {
            return -1;
        }

        tonerLevel = newAmount;
        return newAmount;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
