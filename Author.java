package sp2;

import java.util.ArrayList;

public class Author {

    String name;
    ArrayList<Title> titles;

    public Author(String name) {

        this.name = name;
        titles = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void addTitle(Title title) {

        titles.add(title);

    }

    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title title : titles) {
            totalPay += title.calculateRoyality();
        }
        return totalPay;
    }
}
