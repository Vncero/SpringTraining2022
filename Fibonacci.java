public class Fibonacci {
  public static void sequence(int n) {
    System.out.println("N Fibonacci Numbers: ");
    System.out.print(0 + ", ");
    sequence(n, 0, 1);
  }

  public static void sequence(int n, int prev, int curr) {
    n--;
    if (n != 0) {
      System.out.print(curr + ", ");
    sequence(n, curr, prev + curr);
    } else {
      System.out.print(curr);
    }    
  }
}