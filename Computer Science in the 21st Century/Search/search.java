import java.util.Scanner;
class search {
  public static void main(String[] args) {
    int points = 0;
    Scanner reader = new Scanner(System.in);
    System.out.println("Number Guessing Game: \n\n");
    System.out.print("Choose difficulty(Larger Numbers Are easy) : ");
    int n = reader.nextInt();
    boolean procced = true;

    while(procced != false){
      int[] numbers = new int[n];
      for (int i = 0; i < numbers.length - 1; i++){
            numbers[i] =  ((int)(Math.random() * (12000 - 1 + 1)) + 1);
          }
      for (int i = 1; i< numbers.length; i++) {
        int j = i;
        while (j > 0 && numbers[j] < numbers[j - 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j - 1];
          numbers[j - 1] = temp;
          j--;
        }
      }
      System.out.print("Enter Your Guess: ");
      int guess = reader.nextInt();

      int low = 0;
      int high = numbers.length - 1;
      int key = guess;

      while(high >= low) {
      	int middle = (low + high) / 2;
      	if(numbers[middle] == key) {
          System.out.println("Your Guess Was Found");
          points++;
          break;
      }
      	else if(numbers[middle] < key) {
      		low = middle + 1;

      	}
      	else if(numbers[middle] > key) {
      		high = middle - 1;

      	}
        if (high < low){
          System.out.println("Your number wasn't found\n You had " + points + " points");
          System.exit(0);
        }

      }

      System.out.println("You Have " + points);
      System.out.print("Do  You Want to Continue: ");
      String noooo  = reader.nextLine();

      if (noooo.equals("No"))
        System.exit(0);

    }


  }
}
