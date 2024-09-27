public class Ifelseifelse {

    public static void main(String[] args) {

        String weather = "rainy";

        if (weather.equals("sunny")) {
            System.out.println("It's a nice day for a walk.");

        } else if (weather.equals(weather)) {
            System.out.println("Better bring an umbrella.");
        } else {
            System.out.println("Better stay inside.");
        }

        int score = 85;

        if (score >= 80) {
            System.out.println("You got an A!");
        } else if (score >= 70) {
            System.out.println("You got a B! ");
        } else if (score >= 60) {
            System.out.println("You got a C!");
        } else if (score >= 50) {
            System.out.println("You got a D");
        } else {
            System.out.println("You failed. :()");
        }

        String jobTitle = "manager";

        // if (jobTitle.equals("CEO")) {
        // System.out.println("You're the boss.");
        // } else if (jobTitle.equals("manager")) {
        // System.out.println("You are a charge of a team.");
        // } else {
        // System.out.println("You are just an employee.");
        // }

        if (jobTitle.equals(jobTitle)) {
            System.out.println("You're the boss");
        } else if (!jobTitle.equals("CEO")) {
            System.out.println("You are not the CEO");
        } else {
            System.out.println("You are an employee.");
        }

        char grade = 'D';

        if (grade == 'A') {
            System.out.println("Excellent work.");
        } else if (grade == 'B') {
            System.out.println("Good job.");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Goo");
        } else {
            System.out.println("Why bother? :/");
        }

    }
}