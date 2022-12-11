import java.util.Scanner; // Imports #1
class quiz {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);    // defining Scanner  #1

    // Varibales
    double pi = 3.14; // #3

    // user input
    System.out.print("Enter Your Birth Month: "); // # 2
    String month = reader.nextLine(); // # 2

    System.out.print("\nEnter Radius: "); // #3
    int r = reader.nextInt(); // #3

    System.out.print("Enter Height: "); //#3
    int h = reader.nextInt(); // #3


    // calcualtions
    double v = (1.0/3) * pi * r * r * h; // #3
    double v2 = (1.0/3) * pi * r * r * h / 2; // #3
    int number = (int)((Math.random()*15) + 20); // #3
    int number3 = number*number*number; // #3
    // Output
    System.out.println("\n\n\n\"Your Where Born In\" " + month); // # 2
    System.out.println("Volume of the Cone:  " + v ); // #3
    System.out.println("Half Volume of the Cone: " + v2); // #3
    System.out.println("Random number: " + number); // #3
    System.out.println("Radndom number Cubed: " + number3); // #3




  }
}
