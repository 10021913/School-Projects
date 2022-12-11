class random_integer {
  public static void main(String[] args) {
    // random numbers
    int a = ((int)(Math.random() * (45 - 2 + 1)) + 2);
    int b = ((int)(Math.random() * (45 - 2 + 1)) + 2);
    int c = ((int)(Math.random() * (45 - 2 + 1)) + 2);

    //calculations
     double left = b * c;
     double d = left/a;

   // Output
     System.out.println("a   c\n--=--\nb   d\n\nInitial Values: \n");

     System.out.println("a = " + a);
     System.out.println("b = " + b);
     System.out.println("c = " + c);
     System.out.println(d);

     System.out.println(a + "   " + c + "\n-- = --\n" + b + "a   " + d + "\n\n\n");

     System.out.println("d = " + d);
    

  }
}
