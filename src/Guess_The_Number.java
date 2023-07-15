import java.util.*;

 class Game {
     int computer;

     public Game() {
         Random rand = new Random();
         computer = rand.nextInt(100);
         System.out.println("Guess The Number From 0 To 100");
     }

     public int computerNo() {
         return computer;
     }

     public class Guess {
         static int takeUserInput() {
             int user;
             System.out.println("Enter the Number ");
             Scanner sc = new Scanner(System.in);
             user = sc.nextInt();
             return user;
         }

         static void isCorrectNumber(int i, int j) {
             if (i == j) {
                 System.out.println("Guess is Corerct ");
             } else if (i > j) {
                 System.out.println("Your no. is Bigger than Computer No.");
             } else {
                 System.out.println("Your no. is Smaller than Computer No.");
             }
         }

         public static void main(String[] args) {
             int user = 0, computer = 0, iteration = 0;
             Game g = new Game();
             do {
                 user = takeUserInput();
                 computer = g.computerNo();
                 isCorrectNumber(user, computer);
                 iteration++;
             }
             while (user != computer);
             System.out.println("You Guess no. in " + iteration + " Iterations ");
         }
     }
 }
