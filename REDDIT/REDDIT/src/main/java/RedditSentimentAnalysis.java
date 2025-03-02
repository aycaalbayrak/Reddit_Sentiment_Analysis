import java.util.List;

public class RedditSentimentAnalysis {
    public static void main(String[] args) {

        RedditScraper.scrapeReddit();

        List<String> redditPosts = RedditScraper.getPosts();

        int positive = 0, negative = 0, neutral = 0;

        for (String post : redditPosts) {
            String sentiment = SentimentAnalyzer.analyzeSentiment(post);
            System.out.println("[" + sentiment + "] " + post);

            switch (sentiment) {
                case "Pozitif" -> positive++;
                case "Negatif" -> negative++;
                case "Nötr" -> neutral++;
            }
        }

        System.out.println("🔹 Toplam Pozitif: " + positive);
        System.out.println("🔹 Toplam Negatif: " + negative);
        System.out.println("🔹 Toplam Nötr: " + neutral);


        SentimentChart.drawChart(positive, negative, neutral);
    }
}
