import java.util.Scanner;
class Chess {
  public static void main(String[] args) {
    // initializing  vars
    Scanner reader = new Scanner(System.in);
    String [][] board= new String[8][8];

    int A_x;
    int B_x;
    int C_x;
    int Q_x;

    int A_y;
    int B_y;
    int C_y;
    int Q_y;
    int number = 0;

    String redo;
    // filling array
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {

        board[row][col] = " - ";
      }
    }

    // Radomly assigning A, B, C, Q


    do {
      Q_x = (int)(Math.random() * 8);
      A_x = Q_x - 2;
      B_x = Q_x - 1;
      C_x = (int)(Math.random() * 8);

      Q_y = (int)(Math.random() * 8);
      A_y = Q_y + 2;
      B_y = Q_y + 1;
      C_y = (int)(Math.random() * 8);
      if((A_y == B_y) && (A_x == B_x)){
        redo = "True";
      }
    else{
      if((A_y == C_y) && (A_x == C_x)){//ac
        redo = "True";
      }
    else{
      if((A_y == Q_y) && (A_x == Q_x)){//aq
        redo = "True";
      }
    else{
      if((B_y == C_y) && (B_x == C_x)){//bc
        redo = "True";
      }
    else{
      if((B_y == Q_y) && (B_x == Q_x)){//bq
        redo = "True";
      }
    else{
      if((C_y == Q_y) && (C_x == Q_x)){//cq
        redo = "True";
      }
    else{
      redo = "False";

    }

    }

    }

    }

    }

    }

  } while(redo == "True");

    // filling in a, b, c, q into the array
    board[A_x][A_y] = " A ";
    board[B_x][B_y] = " B ";
    board[C_x][C_y] = " C ";
    board[Q_x][Q_y] = " Q ";




    // Printing the board
    System.out.println("\n    0   1   2   3   4   5   6   7");
    System.out.println("   ------------------------------- ");
    for (int row = 0; row < board.length; row++) {
      System.out.print((row) + " |");
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(""+ (board[row][col]) + "|");
      }
      System.out.println("\n   ------------------------------- ");
    }

    // Checking which pieces the queen can hit

    System.out.println("\nIf nothing is listed then the Queen can't hit anything: \n");

    // diagnal bottom
    int v = Q_x + 1;
    if (v <0 )
      v = 0;
    for(int i = Q_y + 1 ;i < board.length - 1;i++){
      System.out.println(v + " + " + i);
      if (v > 7)
        v--;
      if((board[v][i] != " - " )&&(board[v][i] != " Q ")){
        System.out.println("Queen Can hit" + board[v][i] + " by moving diagnally Down");
        i = board.length;
      }
      v++;

    }


    // diagnal top
    int j = Q_x - 1;
    if (j < 0 )
      j = 0;
    for(int i = Q_y + 1 ;i < board.length;i++){
      System.out.println(j + " + " + i);
      if (j < 0)
      j--;
      if((board[j][i] != " - " )&&(board[j][i] != " Q ")){
        System.out.println("Queen Can hit" + board[j][i] + " by moving diagnally Up");
        i = board.length;
      }
      j--;

    }



    // To the right
    for(int i = Q_y;i < board.length;i++){
      if((board[Q_x][i] != " - " )&&(board[Q_x][i] != " Q ")){
        System.out.println("Queen Can hit" + board[Q_x][i] + " by moving right");
        i = board.length;
      }
    }

    // To the left
    for(int i = Q_y;i > -1;i--){
      if((board[Q_x][i] != " - " )&&(board[Q_x][i] != " Q ")){
        System.out.println("Queen Can hit" + board[Q_x][i]  + " by moving left");
        i = -1;
      }
    }

    // top the bottom
    for(int i = Q_x;i < board.length;i++){
      if((board[i][Q_y] != " - " )&&(board[i][Q_y] != " Q ")){
        System.out.println("Queen Can hit" + board[i][Q_y] + " by moving down");
        i = board.length;
      }
    }

    // To the top
    for(int i = Q_x;i > -1;i--){
      if((board[i][Q_y] != " - " )&&(board[i][Q_y] != " Q ")){
        System.out.println("Queen Can hit" + board[i][Q_y] + " by moving up");
        i = -1;
      }
    }





  }
}
