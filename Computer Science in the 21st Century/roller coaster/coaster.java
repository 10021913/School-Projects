// ice_cream
//menu

import java.util.Scanner; // libray to import inputs
class coaster {
  public static void main(String[] args) {
    // vars
    Scanner reader = new Scanner(System.in);
    double monday = 5.00 ;
    double tuesday = 4.00 ;
    double wednesday = 3.00 ;
    double other = 2.00 ;
    double hotdog = 2.00;
    double fries = 3.00;
    double apple_pie = 5.00;
    double ice_creams = 1.00;

    // menu
    System.out.println("\nTicket price: ");
    System.out.println("Monday:          $5.00");
    System.out.println("Tuesday:         $4.00");
    System.out.println("Monday:          $3.00");
    System.out.println("Other:           $2.00\n\n");


    System.out.println("Food Cost");
    System.out.println("hotdog:          $2.00");
    System.out.println("fries:           $3.00");
    System.out.println("apple pie:       $5.00");
    System.out.println("ice cream:       $1.00\n\n\n");

    System.out.println("Only if you order apple pie you will have a choice of ice cream");


    // input
    System.out.println("Enter days with the first letter capitalized Ex: Monday\n");

    System.out.print("What day would you like to visit: ");
    String day = reader.nextLine();

    System.out.print("What would you like to eat: ");
    String Food = reader.nextLine();

// switch
    switch (day){
      case "Monday":
            switch (Food){
              case "fries":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (monday + fries )+".");
                break;
              case "hotdog":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (monday + hotdog )+".");
                break;
                default :
                    System.out.print("Would you like ice cream:");
                    String ice_cream = reader.nextLine();
                    switch (ice_cream){
                      case "yes" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and ice cream .The total cost of the trip is "+ (monday + apple_pie +ice_creams  )+".");
                        break;
                      case "no" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and no ice cream .The total cost of the trip is "+ (monday + apple_pie)+".");
                        break;
                      }
              }
        break;
      case "Tuesday":
            switch (Food){
              case "fries":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (tuesday + fries )+".");
                break;
              case "hotdog":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (tuesday + hotdog )+".");
                break;
                default :
                    System.out.print("Would you like ice cream:");
                    String ice_cream = reader.nextLine();
                    switch (ice_cream){
                      case "yes" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and ice cream .The total cost of the trip is "+ (tuesday + apple_pie +ice_creams  )+".");
                        break;
                      case "no" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and no ice cream .The total cost of the trip is "+ (tuesday + apple_pie)+".");
                        break;
                      }
              }
        break;
      case "Wednesday":
            switch (Food){
              case "fries":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (wednesday + fries )+".");
                break;
              case "hotdog":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (wednesday + hotdog )+".");
                break;
                default :
                    System.out.print("Would you like ice cream:");
                    String ice_cream = reader.nextLine();
                    switch (ice_cream){
                      case "yes" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and ice cream .The total cost of the trip is "+ (wednesday + apple_pie +ice_creams  )+".");
                        break;
                      case "no" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and no ice cream .The total cost of the trip is "+ (wednesday + apple_pie)+".");
                        break;
                      }
              }
        break;
      default :
        switch (Food){
          case "fries":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (other + fries )+".");
            break;
          case "hotdog":System.out.println("You visited the park on " + day +" and ordered "+ Food +" .The total cost of the trip is "+ (other + hotdog )+".");
            break;
          default :
              System.out.print("Would you like ice cream: ");
              String ice_cream = reader.nextLine();
              switch (ice_cream){
                case "yes" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and ice cream .The total cost of the trip is "+ (other + apple_pie +ice_creams  )+".");
                  break;
                case "no" : System.out.println("You visited the park on " + day +" and ordered "+ Food +" and no ice cream .The total cost of the trip is "+ (other + apple_pie)+".");
                  break;
                }

            break;
          }
          break;
  }

// ascii art
System.out.println("\n\nThanks For visiting\n");
System.out.println("       /\\");
System.out.println("      /**\\");
System.out.println("     /****\\   /\\");
System.out.println("    /      \\ /**\\");
System.out.println("   /  /\\    /    \\        /\\    /\\  /\\      /\\            /\\/\\/\\  /\\");
System.out.println("  /  /  \\  /      \\      /  \\/\\/  \\/  \\  /\\/  \\/\\  /\\  /\\/ / /  \\/  \\");
System.out.println(" /  /    \\/ /\\     \\    /    \\ \\  /    \\/ /   /  \\/  \\/  \\  /    \\   \\");
System.out.println("/  /      \\/  \\/\\   \\  /      \\    /   /    \\");
System.out.println("__/_/______/___/__\\___\\__________________________________________________");
  }
}
