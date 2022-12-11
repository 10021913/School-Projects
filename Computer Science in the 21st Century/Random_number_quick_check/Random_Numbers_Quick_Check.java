// Imports
import java.util.Scanner;

class Random_Numbers_Quick_Check {
  public static void main(String[] args) {

    // getting the Random number
    int number1  = ((int)(Math.random()* (27)));
    int number2 = ((int)(Math.random() * (11)) - 6);
    int number3 = ((int)(Math.random() * (16)) + 9);
    int number4 = (int)(Math.random() * (93 - 35 + 1)) + 35;

    // Calcualations
    int sum = number1 + number2 + number3 + number4;
    double avarage = sum/4.0;

    //  Prnting the random numbers
    System.out.println("Random #1: " + number1);
    System.out.println("Random #2: " + number2);
    System.out.println("Random #3: " + number3);
    System.out.println("Random #4: " + number4);
    System.out.println("\nSum = " + sum);
    System.out.println("Average = " + avarage);


  }
}
