import java.util.*;

public class Number_Game {
    public static void numberGame() {
        Scanner sc = new Scanner(System.in);

        // Generating random number
        Random rand = new Random();
        int num = rand.nextInt(101);

        // NO. of Given Trials
        int trial = 5;

        System.out.println("Guess the number between 0 to 100 within five trials");

        // checking the guess
        for (int i = 1; i <= trial; i++) {

            // Taking Input from user
            System.out.println("Enter Number");
            int guess = sc.nextInt();

            if (num == guess) {
                System.out.println("Congratulations! Your guess is correct");
                break;
            } else if (num > guess) {
                System.out.println("Number is too Small");
                if (i == trial) {
                    System.out.println("Oops! Yout Lost the Game");
                }
            } else {
                System.out.println("Number is too big ");
                if (i == trial) {
                    System.out.println("Oops! Yout Lost the Game");
                    System.out.println("Correct Number is "+num);
                }
            }
        }

        // Asking user to play again
        System.out.println("Do you want to play agian? Answer in Yes or No");
        String ans = sc.next();
        if (ans.equals("yes")) {
            numberGame();
        } else {
            System.out.println("Thank you for your response");
        }

    }

    public static void main(String[] args) {

        numberGame();

    }
}