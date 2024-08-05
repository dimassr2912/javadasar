public class RecursiveMethod {
    public static void main(String[] args) {
       var result = factorial(5);
       System.out.println(result);

        System.out.println(nonRecursive(5));
    }

    // Non Recursive
    static int nonRecursive(int values) {
        int total = 1;

        for (int i = values; i >= 1; i--) {
          total *= i;
      }
        return total;
    };
    // Recursive
    static int factorial(int values) {
      if (values == 1) {
          return 1;
        } else {
          return values * factorial(values - 1);
        }
    };
}
