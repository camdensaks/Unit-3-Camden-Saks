import java.util.Scanner;

public class WinPercentage{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of games played");
    double numOfGames = (double) scan.nextInt();
    System.out.println("Enter number of games won");
    double gamesWon = (double) scan.nextInt();

    while(numOfGames <= 0 || gamesWon>numOfGames || gamesWon < 0 || Math.round(gamesWon) != gamesWon || Math.round(numOfGames)!= numOfGames){
      if(numOfGames <= 0){
        System.out.println("Games played has to be more than zero");
      }
    else  if(gamesWon > numOfGames){
        System.out.println("Games played has to be more than games won");
      }
      else if(gamesWon < 0){
        System.out.println("Please enter a value greater than or equal to zero");
      }
      else if(Math.round(gamesWon)!= gamesWon){
        System.out.println("Please enter an integer value");
      }
      else if(Math.round(numOfGames)!= numOfGames){
        System.out.println("Please enter an integer value");
      }
      scan.next();
    }
    double percentage =  (gamesWon / numOfGames) * 100;
    System.out.println("Percentage of games won: " + percentage + "%");

 }
}
