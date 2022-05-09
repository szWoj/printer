public class Printer {

    private int sheetsLeft;
    private int tonerVolume;


    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void setSheetsLeft(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }

    public String print(int pagesNo, int copiesNo){
        int newSheetsLeft;

        if(getSheetsLeft() >= pagesNo * copiesNo)
        {
            newSheetsLeft = getSheetsLeft() - (pagesNo * copiesNo);
            setSheetsLeft(newSheetsLeft);
            setTonerVolume(getTonerVolume()-(pagesNo * copiesNo));
            return "Printed successfully";

        } else {
            return "Cannot be Printed";
        }

    }
}
