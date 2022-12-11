// imports
import java.util.Scanner;

// Main
class MAGIC_SQUARE {
  public static void main(String[] args) {
    // initiazation
    Scanner reader = new Scanner(System.in);
    int[][] magic = new int[4][4];
    int[][] sum_array = new int[8][4];
    int sum = 0;
    String temp;
    int one = 1;
    int sum_row_1;
    int sum_row_2;
    int sum_row_3;
    int sum_row_4;

    int sum_col_1;
    int sum_col_2;
    int sum_col_3;
    int sum_col_4;

    int sum_diagnal_1;
    int sum_diagnal_2;

    String true_false;
    int storage;

    // input
    System.out.println("Enter numbers --> ");
    for (int row = 0; row < magic.length; row++) {
      for (int col = 0; col < magic[row].length; col++) {
        storage = reader.nextInt();

        // Extra-credit code
        true_false = Check_if_already_there(storage, magic);
        if (true_false == "false") {
          magic[row][col] = storage;
        }
        if (true_false == "true") {
          col--;
          System.out.println("You Have Already Inputed That Number");
        }

      }
    }
    // Printing array
    System.out.println("Square : ");
    for (int row1 = 0; row1 < magic.length; row1++) {
      for (int col1 = 0; col1 < magic[row1].length; col1++) {
        System.out.print(magic[row1][col1] + "\t");

      }
      System.out.println();

    }
    // Finding the sum of each row and storing it in an array (rows 1 - 4)
    for (int row = 0; row < magic.length; row++) {
      for (int col1 = 0; col1 < magic[row].length; col1++) {
        sum_array[row][col1] = Sum_row(magic[row][0], magic[row][1], magic[row][2], magic[row][3]);

      }
    }
    // finding the sum of each colomn and storing it in an array (rows 4 - 8)
    for (int row = 0; row < magic.length; row++) {
      for (int col1 = 0; col1 < (magic[row].length); col1++) {
        sum_array[row + 4][col1] = Sum_col(magic[0][col1], magic[1][col1], magic[2][col1], magic[3][col1]);

      }
    }
    // checking if it is a magic square
    if (sum_array[0][0] == sum_array[1][0]) {
      if (sum_array[1][0] == sum_array[2][0]) {
        if (sum_array[2][0] == sum_array[3][0]) {
          if (sum_array[3][0] == sum_array[4][0]) {
            if (sum_array[5][0] == sum_array[6][0]) {
              if (sum_array[6][0] == sum_array[7][0]) {
                if (sum_array[7][0] == sum_array[0][0]) {
                  if (sum_array[0][0] == (magic[0][0] + magic[1][1] + magic[2][2] + magic[3][3])) {
                    if (sum_array[0][0] == (magic[3][0] + magic[2][1] + magic[1][2] + magic[0][3])) {
                      System.out.println("\nIT IS A MAGIC SQARE"); // print if it's a magic sqare
                      while (one == 1)
                        temp = reader.nextLine();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    // if not a magic sqare
    System.out.println("\nit is NOT  a magic sqare");
  }
  // sum calculator for row
  public static int Sum_row(int a, int b, int c, int d) {
    int sum = a + b + c + d;
    return sum;
  }
  // sum calculator for col
  public static int Sum_col(int a, int b, int c, int d) {
    int sum = a + b + c + d;
    return sum;
  }
  public static String Check_if_already_there(int a, int magic[][]) {

    String true_false;
    String av;
    av = "false";
    for (int row31 = 0; row31 < magic.length; row31++) {
      for (int col31 = 0; col31 < magic[row31].length; col31++) {
        if ((magic[row31][col31] == a)) {
          av = "true";
        }

      }

    }

    return av;
  }
}
