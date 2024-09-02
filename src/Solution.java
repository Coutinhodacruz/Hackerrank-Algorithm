import java.util.List;

public class Solution {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcm_a = lcm(a); // Find the least common multiple (LCM) of array a
        int gcd_b = gcd(b); // Find the greatest common divisor (GCD) of array b
        int count = 0;

        // Count the number of multiples of lcm_a that evenly divide gcd_b
        for (int i = lcm_a; i <= gcd_b; i += lcm_a) {
            if (gcd_b % i == 0) {
                count++;
            }
        }

        return count;
    }

    // Helper method to calculate GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method to calculate GCD of a list of numbers
    private static int gcd(List<Integer> list) {
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = gcd(result, list.get(i));
        }
        return result;
    }

    // Helper method to calculate LCM of two numbers
    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Helper method to calculate LCM of a list of numbers
    private static int lcm(List<Integer> list) {
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = lcm(result, list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> a = List.of(2, 4);
        List<Integer> b = List.of(16, 32, 96);
        int result = getTotalX(a, b);
        System.out.println(result); // Output: 3
    }
}
