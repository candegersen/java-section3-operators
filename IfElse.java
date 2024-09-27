public class IfElse {
    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;

        System.out.println("Hi Java: Did I score better than biolog?");

        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes you did, congrats!");
        } else {
            System.out.println("No you didn't, better luck next time.");
        }

        double sales = 37.55;
        double costs = 5.55;

        System.out.println("Hi Java did I make money?");

        if (sales > costs) {
            System.out.println("Yes you did. :)");
        } else {
            System.out.println("No you did not. :()");
        }

        int age = 28;
        int age2 = 32;

        System.out.println("Am I older than lb dj?");

        if (age < age2) {
            System.out.println("No, you still have time. :D ");
        } else {
            System.out.println("Get in, (shows spongebob death meme)");
        }

        char myGrade = 'A';
        char bestGrade = 'A';

        System.out.println("Did I get the best grade?");

        if (myGrade == bestGrade) {
            System.out.println("Yes you did get the best grade");
        } else {
            System.out.println("No, here's the door.");
        }

        String word = "You do all sorts of ammuniton in your arsenal";
        String word2 = "It's the same always";

        if (word.equals(word2)) {
            System.out.println("You hit the jackpot x1224 times.");
        } else {
            System.out.println("You're gonna get out of this.");
        }
    }
}
