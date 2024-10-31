package sp2;
public abstract class  Title {
    String title;
    String literatureType;
    int copies;
    double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }
    public double calculateRoyality(){
        double royalty = rate * calculatePoints();
        return royalty;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints(String literatureType);
}
