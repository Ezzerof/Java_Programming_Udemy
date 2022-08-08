package encapsulation_challenge;

public class Printer {
    private double toner = 100;
    private int pagePrinted = 0;
    private String type;

    public Printer(double toner) {
        if (toner <= 0 || toner >= 100){
            this.toner = 100;
        }
    }

    public String getType() {
        return type;
    }

    private void decreasingToner(int pages){
        this.toner -= 0.5 * pages;
    }

    public void fillingToner(double ink){
        if (ink + this.toner > 100) {
            double leftInk = (this.toner + ink) - 100;
            this.toner = 100;
            System.out.println("Have left: " + leftInk + " toner");
        }
        else {
            this.toner += ink;
        }
    }

    public void pagesToPrint(int pages, String type){
        this.type = type;

        System.out.println("Printing pages...");

        if (pages >= 0)
            pagePrinted += pages;

        decreasingToner(pages);
        System.out.println("Was printed " + pages + " pages in a " + getType());
    }

    public double getToner() {
        return toner;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
