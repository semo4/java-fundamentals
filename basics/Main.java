import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ClassOne {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);

        while (true) {
            try {
                clock();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static String pluralize(String name, int number) {
        if (number == 0 || number > 1) {
            return name + 's';
        } else {
            return name;
        }
    }

    public static void flipNHeads(int n) {

        int countFlipH = 0;
        int head = 0;
        while (head < n) {
            Random rand = new Random();
            double number = rand.nextDouble();

            if (number <= 0.5) {
                System.out.println("tails");
                countFlipH++;
                head = 0;
            }
            if (number > 0.5) {
                System.out.println("heads");
                countFlipH++;
                head++;

            }
        }
        System.out.println("it took " + countFlipH + " flips to flip " + head + " head in a row");

    }

    public static void clock() {
        LocalDateTime d = LocalDateTime.now();
        int h = d.getHour();
        int m = d.getMinute();
        int s = d.getSecond();
        String time = d.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
    }
}
