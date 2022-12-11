// imports
import java.util.Scanner;

class fraction_addition {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    // inputs
    System.out.print("\nWhat is the numerator of the first fraction:  ");
    double num1 = reader.nextDouble();

    System.out.print("\nWhat is the denominator of the first fractrion: ");
    double dum1 = reader.nextDouble();

    System.out.print("\nWhat is the numerator of the second fraction: ");
    double num2 = reader.nextDouble();

    System.out.print("\nWhat is the denominator of the second fraction: ");
    double dum2 = reader.nextDouble();

    // calculations
     double answer = ((num1 * dum2) + (num2 * dum1)) / (dum1 * dum2);
     System.out.println("\nThe answer is: " + answer);


  }
}
