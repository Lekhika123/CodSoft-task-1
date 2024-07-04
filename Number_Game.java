// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class Number_Game {
   public Number_Game() {
   }

   public static void numberGame() {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int num = rand.nextInt(101);
      int count = 5;
      System.out.println("Guess the number between 0 to 100 within five trials");

      for(int i = 1; i <= count; i++) {
         System.out.println("Enter Number");
         int guess = sc.nextInt();
         if (num == guess) {
            System.out.println("Congratulations! Your guess is correct");
            break;
         }

         if (num > guess) {
            System.out.println("Number is too Small");
            if (i==count) {
               System.out.println("Oops! Yout Lost the Game");
            }
         } else {
            System.out.println("Number is too big ");
            if (i==count) {
               System.out.println("Oops! Yout Lost the Game");
            }
         }
      }

      System.out.println("Do you want to play agian? Answer in Yes or No");
      String var6 = sc.next();
      if (var6.equals("yes")) {
         numberGame();
      } else {
         System.out.println("Thank you for your response");
      }

   }

   public static void main(String[] var0) {
      numberGame();
   }
}

