public class SwitchStatement {
    public static void main(String[] args) {
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt.");
                break;
            case "cloudy":
                System.out.println("You should wear a sweater.");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat.");
                break;
            case "snowy":
                System.out.println("You should wear a jacket");
                break;
            default:
                System.out.println("You can wear whatever you want lol.");

                int role = 2;
                switch (role) {
                    case 1:
                        System.out.println("admin");
                    case 2:
                        System.out.println("editor");
                    case 3:
                        System.out.println("user");
                    default:
                        System.out.println("Please contact HR.");

                        int temperature = 75;
                        int humidity = 65;

                        if (temperature >= 80 && humidity >= 60) {
                            System.out.println("It's too hot and humid");
                        } else if (temperature >= 80) {
                            System.out.println("It's too hot\n");
                        } else if (temperature <= 80 && humidity <= 65) {
                            System.out.println("It's cold but and humid\n");
                        } else if (temperature <= 60) {
                            System.out.println("It's comfortable\n");
                        }

                        int age = 25;
                        int income = 5000;

                        if (age >= 18 && age <= 60 && income >= 3000) {
                            System.out.println("Congrats. You can get a credit card");
                        } else {
                            System.out.println("You are not eligible.");
                        }

                        String lightColor = "green";
                        switch (lightColor) {
                            case "green":
                                System.out.println("Go");
                                break;
                            case "red":
                                System.out.println("Stop");
                                break;
                            case "yellow":
                                System.out.println("Wait");
                                break;
                            default:
                                System.out.println("Get to the line.");
                        }
                }
        }
    }
}
