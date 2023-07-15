

import java.util.Random;
import java.util.Scanner;

        class Game1{
            int computer;
            public Game1() {
                Random rand = new Random();
                computer = rand.nextInt(100);
                System.out.println("Guess the Number from 1 to 100 ");

            }
            public int computerNo() {
                return computer;
            }
        }
        public class GuessTheNumber {
            static int takeUserInput() {
                int user;
                System.out.println("Enter the Number ");
                Scanner sc = new Scanner(System.in);
                user = sc.nextInt();
                return user;
            }
            static void isCorrectNumber(int i,int j){
           if( i == j) {
            System.out.println("Your Guess is Correct ");
        }
        else if(i >j) {
            System.out.println("Your No. is Bigger than Computer No ");
        }
        else {
            System.out.println("Your No is Smaller than Computer No ");
        }
    }

    public static void main(String[] args) {
        int user = 0, computer = 0, iteration = 0;
        Game g = new Game();
        do{
            user = takeUserInput();
            computer = g.computerNo();
            isCorrectNumber(user,computer);
            iteration++;
        }
        while (user != computer);
        System.out.println("You Guess No.In " + iteration + "Iterationns");
    }
}


