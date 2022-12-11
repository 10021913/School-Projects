// Imports
import java.util.Scanner;

// Class
class Scanner123 {
  public static void main(String[] args) {
    //Defining Scanner
    Scanner reader = new Scanner(System.in);


    //practice 1
    System.out.println("Enter A number to be sqared: ");
    int number = reader.nextInt();
    System.out.println(number * number);


     //Practice 2





     //Practice 3
     //Getting inputs inputs
    System.out.print("\n\n\n\nEnter Your name: ");
    String name = reader.nextLine();

    System.out.print("\nEnter Score number 1: ");
    int number1 = reader.nextInt();

    System.out.print("\Enter Score number 2: ");
    int number2 = reader.nextInt();

     Output
    System.out.println("\n" + (((double)number1 + (double)number2)/2) + "%");'



  }
}
