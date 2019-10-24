import java.util.Scanner;

public class Multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a positive integer");
    int Value = scan.nextInt();
    if(Value < 1){
      System.out.println("Value has to be a positive integer");
      Value = scan.nextInt();
    }
    System.out.println("Please enter an upper limit");
    int Limit = scan.nextInt();
    if(Limit <= 0){
      System.out.println("Limit has to be greater than 0");
      Limit = scan.nextInt();
    }
    int Mult = 0;
    for(Mult = Value; Mult<=Limit; Mult+=Value ){
    System.out.println("Multiples of " + Value + " are: " + Mult);
  }
  }
}
