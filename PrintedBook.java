package sp2;
 class PrintedBook extends Title {
    int pages;


    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints(){
        return copies * pages * calculateLiteraturePoints(literatureType);
    }

    protected double calculateLiteraturePoints(String literatureType) {
        double value;
        //String noMatch;


        switch (literatureType) {
            case "BI":
                value = 3;
                break;
            case "TE":
                value = 3;
                break;
            case "LYRIK":
                value = 6;
                break;
            case "SKØN":
                value = 1.7;
                break;
            case "FAG":
                value = 1;
                break;
            default:
                value = -1; // Default value if no match
                break;
        }
        return value;
    }
}