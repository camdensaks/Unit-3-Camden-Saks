import java.util.Scanner;

public class MinofThree{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Provide three integers");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    int x = Math.min(num1, num2);
    int min = Math.min(x, num3);
    System.out.println(min);
  }
}
