class program_2 {
  public static void main(String[] args) {
    // integers
    int min = 10;
    int max = 30;

    // calculations
    int integer1 = random(min,max);
    int intger2 = random(min,max);
    int intger3 = random(min,max);
    int intger4 = random(min,max);
    double Avarage1 = avarage(intger2 , integer1 );
    double Avarage2 = avarage(intger4, intger3);
    double Avarage3 = avarage(Avarage1, Avarage2);

    System.out.print("\nInteger 1: " + integer1 + "\nInteger 2: " + intger2 + "\nInteger 3: " + intger3 + "\nInteger 4: " + intger4 + "\n" );
    System.out.println("Avarage: " + Avarage3);
  }
  public static int random(int min, int max) {
    int integers = ((int)(Math.random() * ( max - min + 1)) + min);
    return  integers;
  }
  public static double  avarage(double a, double b) {
    double integers123 = ((double) a +(double) b)/2.0;
    return  integers123;
  }

}
