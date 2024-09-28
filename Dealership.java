import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java dealership");
        System.out.println("- Select option 'a' to buy a car.");
        System.out.println("- Select option 'b' to sell a car.");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("you chose option " + option);

                System.out.println("What is your budget");
                double budget = scan.nextDouble();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String licence = scan.nextLine();
                    System.out.println("What's your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && licence.equals("yes") && creditScore > 660) {
                        System.out.println("Sold! Pleasure doing business with you");
                    } else {
                        System.out.println("Sorry, we cannot sell you a car.");
                        scan.close();
                    }

                }

        }
    }
}
