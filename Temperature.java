import java.util.Scanner;

public class Temperature{
  public static void main(String[] args){
    Scanner userTemp = new Scanner(System.in);
    int temperature = userTemp.nextInt();
    if(temperature > 83){
      System.out.println("hot");
    }
    else if(temp <= 83 && temp >== 68){
      System.out.println("ideal");
    }
    else if(temp <= 67 && temp >= 45){
      System.out.println("cool");
    }
    else {
      System.out.println("cold");
    }
  }
}
