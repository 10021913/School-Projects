import java.util.Scanner;

class Eqaution {
  public static void main(String[] args) {
    // variables
    Scanner reader = new Scanner(System.in);

    // getting data
    System.out.print("Enter x1: ");
    double x1 = reader.nextDouble();

    System.out.print("\nEnter x2: ");
    double x2 = reader.nextDouble();

    System.out.print("\nEnter x3: ");
    double y1 = reader.nextDouble();

    System.out.print("\nEnter x4: ");
    double y2 = reader.nextDouble();

    // calculations
    double slope = (y2-y1)/(x2-x1);


    //Output
    System.out.println("(y - " + y1 + ") = " + slope + "(x - " + x1 + ")" );



  }
}
