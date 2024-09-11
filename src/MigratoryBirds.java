import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        int[] birdCounts = new int[6];
        

        for (int birdType : arr) {
            birdCounts[birdType]++;
        }
        

        int maxCount = 0;
        int mostFrequentBird = 0;
        

        for (int i = 1; i <= 5; i++) {
            if (birdCounts[i] > maxCount) {
                maxCount = birdCounts[i];
                mostFrequentBird = i;
            }
        }
        
        return mostFrequentBird;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int n = scanner.nextInt();
        

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        

        int result = migratoryBirds(arr);
        System.out.println(result);
        
        scanner.close();
    }
}
