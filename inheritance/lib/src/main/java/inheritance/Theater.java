package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    String name;
    ArrayList<String> movie = new ArrayList<>();
    private Review r ;
    int numberStars;
    List<Integer> stars = new ArrayList<>();


    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie){
        this.movie.add(movie);
    }


    public void removeMovie(String movie){
        if (this.movie.contains(movie)) {
            this.movie.remove(movie);
        }
    }

    public void addReview(String movie ,String body, String author, int numberOfStars){
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
        String movies = "";
        for(int i = 0; i< this.movie.size();i++){
            movies = movies+ this.movie.get(i) + " - ";
        }

        return "Name Theater "+ this.name + " Movies " + movies +" Rating "+numberStars ;
    }
}
