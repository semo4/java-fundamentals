package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStars;
    String name;

    public Review( String name,String body, String author,  int numberOfStars) {
        this.name = name;
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }


    public String toString(){
        return "Review Info "+this.body+ " "+  this.author +" Author who Add Review And I give Your Restaurant "+ this.numberOfStars+" Stars";
    }
}
