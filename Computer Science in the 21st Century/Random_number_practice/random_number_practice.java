class random_number_practice {
  public static void main(String[] args) {
    // Random Number Practice 3
    //random number
    int six_sided_die = (int)((Math.random()*6) + 1);
    int ten_sided_die = (int)((Math.random()*10)+1);
    int twenty_sided_die = (int)((Math.random()*20)+1);

    // calculations
    int Sum_of_dice = six_sided_die + ten_sided_die + twenty_sided_die;
    int product_of_dice = six_sided_die * ten_sided_die * twenty_sided_die;
    double avarage_of_dice = Sum_of_dice/3.0;

    // Printing data
    System.out.println("6-Sided Die:" + six_sided_die);
    System.out.println("10-Sided Die:" + ten_sided_die);
    System.out.println("20-Sided Die:" + twenty_sided_die);
    System.out.println("Sum of Dice:" + Sum_of_dice);
    System.out.println("Product of Dice:" + product_of_dice);
    System.out.println("Avargae of Dice:" + avarage_of_dice);
//==================================================================\\

    int total_seconds = (int)((Math.random()*999500) + 500);
    int seconds = total_seconds%60;
    int minutes = total_seconds%60;
    int hours = minutes%60;
    int days = hours%24;
    System.out.println("\n\n\n\n\nTime " + days +":"+  hours +":"+ minutes +":"+ seconds);


  }
}
