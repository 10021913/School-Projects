class test_practice1 {
  public static void main(String[] args) {

    // vars
    int a = 1;
    int b = 1;
    int c = 1;
    int d = 1;
    double e = 1;

    // out put
    System.out.println("SUM1: " + sum1(a,b));
    System.out.println("SUM2: " + sum2(a,b,c));
    System.out.println("SUM3: " + sum3(a,b,c,d));
    System.out.println("Quot: " + quot(a,e));

  }
  // sum1
  public static int sum1(int a, int b) {
    int  sum =  a + b;
    return sum;
  }
  // sum2
  public static int sum2(int a, int b, int c) {
  int  sum =  a + b + c;
    return sum;
  }
  //sum 3
  public static int sum3(int a, int b, int c, int d) {
    int  sum =  a + b + c + d;
    return sum;
  }
  // quot
  public static double quot(int a, double e) {
    double  sum =   a / e;
    return sum;
  }
}
