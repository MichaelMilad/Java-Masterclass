public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel =
                (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public Printer() {
        this(100, false);
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount <= 0 || tonerAmount > 100) return -1;
        int newTonerLevel = this.tonerLevel + tonerAmount;

        if (newTonerLevel > 100) return -1;

        this.tonerLevel = newTonerLevel;
        return newTonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (int) Math.ceil((double) pages / (this.duplex ? 2 : 1));
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
