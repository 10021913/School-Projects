class Geometry  {
  public static void main(String[] args) {
    // vars
    double l = 10;
    double w = 10;
    double s = 10;
    double b = 10;
    double h = 10;
    double d = 10;
    double r = 10;

    // Output
    System.out.println("Rectangle: " + rectangele(l,w));
    System.out.println("Square: " + square(s));
    System.out.println("traingle: " + triangles(b,h));
    System.out.println("Circumfrance D: " + circumfrance_d(d));
    System.out.println("circumfrance R: " + circumfrance_r(r));

  }
  // rectangle
  public static double rectangele(double l, double w) {
  double  sum = l * w;
    return sum;
  }
  // square
  public static double square(double s) {
  double  sum = s * 4;
    return sum;
  }
  // traingles
  public static double triangles(double b, double h) {
  double  sum = b * h * 0.5;
    return sum;
  }
  // circumfrance_d
  public static double circumfrance_d(double d) {
  double  sum = d * 3.1415;
    return sum;
  }
  //circumfrance_r
  public static double circumfrance_r(double r) {
  double  sum = r * 2 * 3.1415;
    return sum;
  }
}
