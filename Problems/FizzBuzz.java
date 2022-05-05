public class FizzBuzz {
  public static void fizzBuzz () {
    System.out.println();
    System.out.println("FizzBuzz: ");
    for (int i = 0; i <= 100; i++) {
      System.out.println(i % 3 == 0 ? 
                         (i % 5 == 0 ? "FizzBuzz" : "Fizz") : 
                         (i % 5 == 0) ? "Buzz" : Integer.toString(i)
                        );      
    }
  }
}