package sp2;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author = new Author("Oscar Børjesen");

        Title title1 = new PrintedBook("Adams Apples", "FAG", 30, 400);
        Title title2 = new PrintedBook("Ay-brother Benz", "BI", 100, 350);
        Title title3 = new AudioBook("Listening with main man", "TE", 200, 300);

        author.addTitle(title1);
        author.addTitle(title2);
        author.addTitle(title3);

        System.out.println("Author: " + author.getName() + " = " + author.calculateTotalPay() + " DKK");
    }
}
