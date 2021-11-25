import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean keepAlive = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome! I am the Java Task Master 3000.");
        
        while (keepAlive) {
            try {
                System.out.println("Please enter the number of the exercise you want to run. (Enter -1 to exit)");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Ex1(sc);
                        break;
                    case 2:
                        Ex2(sc);
                        break;
                    case 3: 
                        Ex3(sc);
                        break;
                    case 4: 
                        Ex4(sc);
                        break;
                    case -1:
                        System.out.println("Thank you for your time. Goodbye.");
                        keepAlive = false;
                        break;
                    default:
                        break;
                };
            } catch (Exception e) {
                System.out.println("That is not a valid number.");
            }
        };
    }

    public static void Ex1(Scanner sc){
        System.out.println("Please enter a number.");
        int x = sc.nextInt();

        System.out.println("Please enter the number you want to add.");
        int y = sc.nextInt();

        System.out.println("The sum of your numbers are: " + (x + y));
    }

    public static void Ex2(Scanner sc){
        System.out.println("Please enter a number.");
        int x = sc.nextInt();

        System.out.println("Please enter the number you want to divide with.");
        int y = sc.nextInt();

        System.out.println("The division between your numbers are: " + (x / y));
    }

    public static void Ex3(Scanner sc){
        System.out.println("Please enter a number.");
        int x = sc.nextInt();

        System.out.println("Please enter the number you want to multiply with.");
        int y = sc.nextInt();

        System.out.println("The product your numbers are: " + (x * y));
        System.out.println("Your equation is: " + x + "x" + y + "=" + (x * y));
    }

    public static void Ex4(Scanner sc){
        System.out.println("Please enter a number.");
        int x = sc.nextInt();
        System.out.println("The multiplication table for your number is as follows: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "x" + i + "=" + (x * i));
        }
    }

    
}
