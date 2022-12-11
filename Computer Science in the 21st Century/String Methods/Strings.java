import java.util.Scanner;

class Strings {
  public static void main(String[] args) {

    int some_int;
    boolean pass = true;

    // input
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a Sentence: ");
    String sentence = reader.nextLine();

    // replacnng all punctuaitons
    String[] animals = sentence.split(" ");
    sentence = sentence.replaceAll("\\p{Punct}","");
    sentence = sentence.trim();
    sentence = sentence.toUpperCase();

    // output
    System.out.println("\nUnsorted array: ");
    for (String animal : animals) {
      System.out.print(animal + " ");
    }
    System.out.println("\nWords Count is: " + animals.length);



    // sorting array
    int size = animals.length;
    for(int i = 0; i<size-1; i++) {
         for (int j = i+1; j<animals.length; j++) {
            if(animals[i].compareTo(animals[j])>0) {
               String temp = animals[i];
               animals[i] = animals[j];
               animals[j] = temp;
            }
         }
      }
    // Sorted array
    System.out.println("\nSorted Array: ");
    for (String animal : animals) {
        System.out.print(animal + " ");
    }

    // Shuffling
    System.out.println("\n\n\n");
    for(int lol = 0;lol<5;lol++){
      System.out.println("\nRandom Array " + (lol+1) + ":\n");
        int[] parallel_animals = new int[animals.length];
              int index;
              String temp;
              for (int i = animals.length - 1; i > 0; i--)
              {
                 index = ((int)(Math.random() * (animals.length - 1 + 0)) + 0);
                 temp = animals[index];
                 animals[index] = animals[i];
                 animals[i] = temp;
              }

        for (String animal : animals) {
            System.out.print(animal.trim() + " ");
        }

      }
  }

}
