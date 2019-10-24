import java.util.Scanner;

public class StringTransformer {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a word or phrase of your choosing");
    String word = scan.nextLine();
    for(int i = 0; i <= word.length() - 1; i++){
      System.out.println(word.charAt(i));
    }
  }
}
