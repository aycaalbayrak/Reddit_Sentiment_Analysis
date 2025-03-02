import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RedditScraper {
    private static final List<String> posts = new ArrayList<>();

    public static void main(String[] args) {
        scrapeReddit();
    }

    public static void scrapeReddit() {
        String[] subreddits = {"love", "happy", "hate", "angry", "sad" };
        int totalPosts = 1500;
        int batchSize = 100;

        try {
            for (String subreddit : subreddits) {
                String after = "";

                while (posts.size() < totalPosts) {
                    String url = "https://www.reddit.com/r/" + subreddit + "/new.json?limit=" + batchSize + "&after=" + after;
                    Document doc = Jsoup.connect(url)
                            .ignoreContentType(true)
                            .userAgent("Windows:VIBECODING:1.0 (by/u/Cool_Writer_294")
                            .get();

                    JSONObject json = new JSONObject(doc.body().text());
                    JSONArray children = json.getJSONObject("data").getJSONArray("children");

                    if (children.length() == 0) break;

                    for (int i = 0; i < children.length(); i++) {
                        JSONObject postData = children.getJSONObject(i).getJSONObject("data");
                        String title = postData.getString("title");
                        String text = postData.optString("selftext", "");
                        posts.add(title + " - " + text);

                        if (posts.size() >= totalPosts) break;
                    }

                    after = json.getJSONObject("data").optString("after", "");
                    if (after.isEmpty()) break;
                }

                if (posts.size() >= totalPosts) break;
            }

            System.out.println("Toplam " + posts.size() + " gönderi alındı.");
        } catch (IOException e) {
            System.err.println("Reddit API'den veri çekerken hata oluştu: " + e.getMessage());
        }
    }

    public static List<String> getPosts() {
        return posts;
    }
}
