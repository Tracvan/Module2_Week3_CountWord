import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String text = "In a world full of challenges and opportunities, learning English has become an essential requirement." +
                " English is not only an international language but also a vital communication tool in many fields such as work, travel, education, and connecting with people around the world." +
                " Mastering English will open up new opportunities and make you more confident in life.";
    text = text.replaceAll("[^a-zA-Z ]", "");
    String[] words = text.split(" ");
        Map<String, Integer> wordCountMap = new TreeMap<>();
        for(String word : words){
            String lowercaseWord = word.toLowerCase();
            if (wordCountMap.containsKey(lowercaseWord)){
                int count = wordCountMap.get(lowercaseWord);
                wordCountMap.put(lowercaseWord, count +1 );
            }
            else {
                wordCountMap.put(lowercaseWord, 1);
            }
        }
        for (Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
