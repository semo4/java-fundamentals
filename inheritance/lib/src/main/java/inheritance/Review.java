package inheritance;

public class Review extends Restaurant{
    private String body;
    private String author;
    private int numberOfStars;


    public Review( String name,String body, String author,  int numberOfStars) {
        super(name);
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;

    }



    public String toString(){
        return "Review Info "+body+ " "+  author +" Author who Add Review And I give Your Restaurant "+ numberOfStars+" Stars";
    }
}
