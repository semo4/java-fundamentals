package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public String name;
    public String price;
    public int star;
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String price){
        this.name = name;
        this.price = price;
        this.star = 0;
    }

    public String toString(){
        return "Name: " + this.name + ", Price: " + this.price + ", Rating: " + this.star;
    }


    public void addReview(Review review){
        reviews.add(review);
        review.restaurant = this;
        updateStars();
    }

    private void updateStars(){
        int total = 0;
        for (int i = 0; i < reviews.size(); i++){
            total += reviews.get(i).stars;
        }
        total /= reviews.size();
        this.star = total;
    }





}
