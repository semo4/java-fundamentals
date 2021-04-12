package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    String name;
    String description;
    int numberOfDollar;
    int numberStars;
    Review r;
    List<Integer> stars = new ArrayList<>();

    public Shop(String name, String description, int numberOfDollar) {
        this.name = name;
        this.description = description;
        this.numberOfDollar = numberOfDollar;
    }

    public void addReview(String body, String author, int numberOfStars){
        stars.add(numberOfStars);
        r = new Review(this.name,body,author,numberOfStars);
        updateStars();
    }

    public void updateStars(){
        int total = 0;
        for (int i = 0; i < stars.size(); i++) {
            total = total + stars.get(i);
        }
        total = total/ stars.size();
        this.numberStars = total;
    }

    public String toString(){
        return this.name+" Shop name "+ "Shop Info "+ this.description + " "+ this.numberOfDollar +" Rating "+numberStars;
    }
}
