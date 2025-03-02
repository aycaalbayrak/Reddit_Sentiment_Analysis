import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SentimentAnalyzer {
    private static final Set<String> positiveWords = new HashSet<>(Arrays.asList(
            "good", "great", "excellent", "amazing", "happy", "love", "like", "awesome", "fantastic", "wonderful"
    ));

    private static final Set<String> negativeWords = new HashSet<>(Arrays.asList(
            "bad", "worst", "terrible", "awful", "hate", "horrible", "sad", "angry", "disgusting", "poor"
    ));

    public static String analyzeSentiment(String text) {
        String lowerText = text.toLowerCase();
        int positiveScore = 0;
        int negativeScore = 0;

        for (String word : lowerText.split("\\s+")) {
            if (positiveWords.contains(word)) {
                positiveScore++;
            }
            if (negativeWords.contains(word)) {
                negativeScore++;
            }
        }

        if (positiveScore > negativeScore) {
            return "Pozitif";
        } else if (negativeScore > positiveScore) {
            return "Negatif";
        } else {
            return "Nötr";
        }
    }
}
