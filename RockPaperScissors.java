import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int ROCK = 0;
    int PAPER = 1;
    int SCISSORS = 2;
    int Games_Played = 0;
    int Games_Won = 0;
    double winPercent = 0;
    System.out.println("Do you want to play? Enter y or n");
    String Play = scan.next();
    while (Play.equals("y")){
      System.out.println("Please enter one of the following: 0, 1, 2");
      System.out.println("0 is Rock, 1 is Paper, 2 is Scissors");
      int USER_INPUT = scan.nextInt();
        if(USER_INPUT > 2 || USER_INPUT < 0){
        System.out.println("Please enter 0, 1, or 2");
        continue;
      }
      System.out.println("You chose " + USER_INPUT);
      //1 def. 0, 2 def. 1, 0 def. 2
      Random rand = new Random();
      int PROG_INPUT = rand.nextInt(3);
      System.out.println("The computer chose " + PROG_INPUT);
      if(USER_INPUT == 1 && PROG_INPUT == 0){
        System.out.println("YOU WIN! Paper defeats Rock");
        Games_Played++;
        Games_Won++;
      }
      else if (USER_INPUT == 0 && PROG_INPUT == 2) {
         System.out.println("YOU WIN! Rock defeats Scissors");
         Games_Played++;
         Games_Won++;
      }
      else if (USER_INPUT == 2 && PROG_INPUT == 1){
        System.out.println("YOU WIN! Scissors defeats Paper");
        Games_Played++;
        Games_Won++;
      }
      else if(USER_INPUT == PROG_INPUT ){
        System.out.println("TIE! Please try again");
        Games_Played++;
      }
      else if(USER_INPUT == 0 && PROG_INPUT == 1){
        System.out.println("YOU LOSE! Paper defeats Rock");
        Games_Played++;
      }
      else if (USER_INPUT == 2 && PROG_INPUT == 0) {
           System.out.println("YOU LOSE! Rock defeats Scissors");
           Games_Played++;
         }
      else if (USER_INPUT == 1 && PROG_INPUT == 2){
             System.out.println("YOU LOSE! Scissors defeats Paper");
             Games_Played++;
        }
      System.out.println("Do you want to play again? Enter y or n");
      Play = scan.next();
      winPercent = ((double) Games_Won / (double) Games_Played) * 100.0;
    }
    if(Play.equals("n")){
      System.out.println("Thanks for playing!");
    }
    if(Games_Played >= Games_Won && Games_Played > 0 && Games_Won >= 0){
      System.out.println("Your Win Percentage: " + winPercent + "%");
}
      }
    }
