import java.util.Scanner; // libray to import inputs
public class switchs {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a Planet: ");
    String planet = reader.nextLine();

    System.out.print("Enter a Wight: ");
    int weight = reader.nextInt();


   switch (planet){
    case "mercry": System.out.println("Weight: " + ((weight * 0.38)));
      break;
    case "venus": System.out.println("Weight: " + (weight * 0.78));
      break;
    case "earth": System.out.println("Weight: " + (weight));
      break;
    case "mars": System.out.println("Weight: " + (weight * 0.39));
      break;
    case "jupiter": System.out.println("Weight: " + (weight * 2.65));
      break;
    case "saturn": System.out.println("Weight: " + (weight * 1.17));
      break;
    case "uranus": System.out.println("Weight: " + (weight * 1.05));
      break;
    case "neptune": System.out.println("Weight: " + (weight * 1.23));
      break;
    default : System.out.println("\nError: could not find or load your choice of planet\nCaused by: java.choice.PlanteNotFoundException: " + planet);
      break;
    }
  }
}
