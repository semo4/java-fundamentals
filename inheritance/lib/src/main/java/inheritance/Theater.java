package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    public String name;
    public String price;
    public int star;
    ArrayList<Review> reviews = new ArrayList<>();
    ArrayList<Movie> movies = new ArrayList<>();

    public Theater(String name, String price){
        this.name = name;
        this.price = price;
        this.star = 0;
    }

    public Theater(String name, String price, int rating){
        this.name = name;
        this.price = price;
        this.star = rating;
    }




    public void addReview(Review review){
        reviews.add(review);
        review.theater = this;
        updateStars();
    }

    public void addMovie(Movie movie) {

        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        if(movies.contains(movie))
            movies.remove(movie);
    }


    private void updateStars(){

        int total = 0;
        for (int i = 0; i < reviews.size(); i++){
            total += reviews.get(i).stars;
        }
        total /= reviews.size();
        this.star = total;
    }

    public String toString(){
        return "Name: " + this.name + ", Price: " + this.price + ", Rating: " + this.star;
    }
}
