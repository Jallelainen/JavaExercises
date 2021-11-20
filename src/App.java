import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean keepAlive = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome! I am the Java Task Master 3000. Please enter the number of the exercise you want to run. (Enter -1 to exit)");
        String userInput = HandleInput(sc);

        do {
            switch (userInput) {
                case "1":
                    Ex1(sc);
                    userInput = HandleInput(sc);
                    break;
                

                case "-1":
                    System.out.println("Thank you for this time. Goodbye.");
                    keepAlive = false;
                    break;
                default:
                    break;
            }
        } while (keepAlive);
    }

    public static void Ex1(Scanner sc){
        System.out.println("Please enter a number.");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter another number.");
        int y = Integer.parseInt(sc.nextLine());

        System.out.println("The sum of your numbers are: " + (x + y));
    }

    public static String HandleInput(Scanner sc) {
        String userInput = sc.nextLine();

        return userInput;
    }

    
}
