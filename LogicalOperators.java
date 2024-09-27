public class LogicalOperators {
    public static void main(String[] args) {

        boolean hasDrivingLicense = true;
        boolean hasInsurence = true;

        if (hasInsurence && hasDrivingLicense) {
            System.out.println("You can legally drive.");
        } else {
            System.out.println("You can't legally drive");
        }

        int age = 25;
        double income = 45000;

        if (age >= 21 && income >= 40000) {
            System.out.println("You are eligible for a loan");
        } else {
            System.out.println("You are not eligible for a loan.");
        }

        String inputUsername = "Candeğer";
        String inputPassword = "Password123";

        String correctUsername = "Candeğer";
        String correctPassword = "Password123";

        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Invalid username and password");
        }

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;

        if (hasGoodPerformance || isLongTermEmployee) {
            System.out.println("The user is eligible for a promotion.");
        } else {
            System.out.println("Not eligible for a promotion.");
        }

        int userAge = 17;
        boolean isParentPresent = true;

        if (userAge >= 18 || isParentPresent) {
            System.out.println("You can enter the value");
        } else {
            System.out.println("You cannot enter the venue");
        }

        int memberAge = 16;
        boolean hasMembership = false;

        if (memberAge >= 18 || hasMembership == true) {
            System.out.println("The user can't enter the premises.");
        } else {
            System.out.println("The user can enter the premises.");
        }

        int memberAge1 = 16;
        boolean hasMembership1 = false;

        if (memberAge1 >= 18 || hasMembership1) {
            System.out.println("The can enter the premises.");
        } else {
            System.out.println("The user can't enter.");
        }

        String option = "cash";

        boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        boolean notCashOrCredit = option.equals("cash") || option.equals("credit");

        if (notCashOrCredit) {
            System.out.println("Please choose another payment method");
        } else {
            System.out.println("Sold. Pleasure doing business with you.");
        }

        char letter = 'A';

        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        boolean notVowel = !((letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter == 'U'));

        if (notVowel) {
            System.out.println("The letter " + letter + " is a consonant.");
        } else {
            System.out.println("The letter " + letter + "is  a vowel.");
        }

        String move = "stay";

        boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        boolean notHitOrSat = !(move.equals("hit") || move.equals("stay"));

        if (notHitOrSat) {
            System.out.println("Please choose a valid method");
        } else {
            System.out.println("You win 40 bucks");
        }

    }
}
