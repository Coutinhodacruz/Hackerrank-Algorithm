import java.util.ArrayList;
import java.util.List;

public class BreakingBestRecord {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minBreaks = 0;
        int maxBreaks = 0;

        for (int index = 1; index < scores.size(); index++) {
            int score = scores.get(index);

            if (score < min) {
                min = score;
                minBreaks++;
            } else if (score > max) {
                max = score;
                maxBreaks++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxBreaks);
        result.add(minBreaks);
        return result;
    }

    public static void main(String[] args) {

        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> result = breakingRecords(scores);
        System.out.println(result.get(0) + " " + result.get(1));
    }

}
