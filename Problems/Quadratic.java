public class Quadratic {
  public static void solve (double a, double b, double c) {
    double discrim = Math.pow(b, 2) - (4*a*c);
    if (discrim < 0) {
      if (Math.sqrt(discrim) - Math.floor(Math.sqrt(discrim)) == 0) {
        
      } else {
        
      }
    } else {
      double one = (-1*b + Math.sqrt(discrim))/(2*a);
      double two = (-1*b - Math.sqrt(discrim))/(2*a);
    }
    
    // if (one == two) {System.out.println("+/-" + Math.abs(one) + " : +/-" + Math.abs(two));
    // }
  }
}