public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n < 0){
        throw new IllegalArgumentException("Negatives can't have a square root.");
      }
      if (n == 0){
        return 0;
      }
      double guess = n/2;
      return sqrtHelper(n, guess, tolerance);
    }

    public static double sqrtHelper(double n, double guess, double tolerance){
      if ((n/(guess*guess) >= (1-tolerance/100)) && (n/(guess*guess) <= (1+tolerance/100))){
        return guess;
      } else {
        return sqrtHelper(n, (n/guess + guess)/2, tolerance);
      }
    }
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 0;
    }

    /*As Per classwork*/
    // public static ArrayList<Integer> makeAllSums(int n){
    //
    // }

    public static void main(String[] args){
      for (int i=0; i<20; i++){
        System.out.println(sqrt(i, 0.01));
      }
    }

}
