package inheritance;

public class Review {

    public String body;
    public String author;
    public int stars;
    public Restaurant restaurant;
    public Shop shop;
    public Theater theater;
    public String movieName;

    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String body, String author, int stars, String movieName) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movieName = movieName;
    }

    public String toString(){
        return "My name is : "+this.author + " And my review : " + this.body+" I give you "+ this.stars;
    }

    public String getMovieName(){
        return this.movieName;
    }
}
