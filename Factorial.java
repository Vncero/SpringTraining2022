public class Factorial {
  public static void nFactorial(int n){
    System.out.println("N Factorial: ");
    System.out.println(n);
    nFactorial(n, n-1);
  }
  
  public static void nFactorial(int n, int m) {
    n *= m;
    m--; 
    if (m != 0) {
      System.out.println(n);
      nFactorial(n, m);
    } else {
      System.out.println("Final answer is: " + n);
    }
  }
}