import java.util.Scanner;

public class PalindromeTester{
  public static void main(String[] args){
    String palindrome, letter = "y";
    int left, right;
    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to test a palindrome? (y/n)");
    letter = scan.nextLine();
  while(letter.equals("y")){
      System.out.println("Is your selected word/phrase a palindrome?");
      palindrome = scan.nextLine();
      left = 0;
      right = palindrome.length() - 1;
  while(palindrome.charAt(left) == palindrome.charAt(right) && left < right){
      left++;
      right--;
      }
      if(left < right){
        System.out.println("It is not a palindrome");
      }
      else{
        System.out.println("It is a palindrome");
      }
    }
  }
}
