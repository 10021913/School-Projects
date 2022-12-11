class Physics  {
  public static void main(String[] args) {
    // variables
    double b = 100;
    double t = 3;
    double v0 = 5.0;
    double a = 5;
    double x2 = 50;
    double x1 = 100;

    // output
    double heigh1t =  hieght(t,b);
    double velocity = velocity1(t,v0);
    System.out.println("Height: " + heigh1t);
    System.out.println("Velocity: " + velocity);
    System.out.println("Avarage: " + avarage(x1,x2,b,a));

    }
  public static double hieght(double t, double b) {
    double  h =  (-4.9 * t * t) + b;
    return h;
    }
  public static double velocity1(double t, double v0) {
    double  v = v0 - (9.8 * t);
    return v;
    }
  public static double avarage(double x1, double x2, double b, double a) {
    double  avarage = (x2 - x1)/(b - a);
    return avarage;
    }
}
