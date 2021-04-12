package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int numberOfStars;
    private String price;
    List<Integer> stars = new ArrayList<>();

    private Review r ;

    public Restaurant(String name, int numberOfStars, int price) {
        this.name = name;
        if(numberOfStars <0){
            this.numberOfStars = 0;
        }else if(numberOfStars >5){
            this.numberOfStars = 5;
        }else{
            this.numberOfStars = numberOfStars;
        }
        String sign = "";
        for(int i =0; i< price;i++){
            sign=sign+"$";
        }
        this.price = sign;

    }

    public Restaurant(String name) {
        this.name = name;
    }
    public void addReview(String body, String author, int numberOfStars){
        this.numberOfStars = numberOfStars;
        r = new Review(this.name,body,author,numberOfStars);
        stars.add(numberOfStars);
        updateStars();
    }

    public void updateStars(){
        int total = 0;
        for (int i = 0; i < stars.size(); i++) {
            total = total + stars.get(i);
        }
        total = total/ stars.size();
        this.numberOfStars = total;
    }




    public String toString(){
        return "Restaurant Info "+this.name+ " Restaurant "+ this.numberOfStars +" Stars "+ this.price +" Number of Doller Sign "+"\n"+ r.toString();
    }
}
