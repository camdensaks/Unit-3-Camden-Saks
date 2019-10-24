import java.util.Scanner;

public class AgeRange{
  public static void main(String[] args){
    Scanner userAge = new Scanner(System.in);
    int age = userAge.nextInt();
    if(age >= 21){
      System.out.println("You are old enough to drink.");
    }
    else if(age >= 17){
      System.out.println("You can drive, but are not old enough to drink.");
    }
    else{
      System.out.println("You can't do either");
    }
  }
}
