import java.util.*;
import java.util.List;

public class StringCollection {

    private StringBuilder finalResult = new StringBuilder();

    public StringBuilder displayingWordsAlphabeticallyAndNumberTheirOccurrences(String inputText) {
        char firstLetter = ' ';
        List<String> listText = new ArrayList<>(Arrays.asList(inputText.toLowerCase().split("\\W+")));
        Map<String, Long> mapWordsWithOccurrencesWord = new TreeMap<>();
        for (String word : listText) {
            long occurrencesWords = listText.stream().filter(w -> w.equals(word)).count();
            mapWordsWithOccurrencesWord.put(word, occurrencesWords);
        }
        for (Map.Entry e : mapWordsWithOccurrencesWord.entrySet()) {
            String s = (String) e.getKey();
            if (s.toUpperCase().charAt(0) == firstLetter) {
                finalResult.append("    ")
                        .append(e.getKey())
                        .append(" ")
                        .append(e.getValue())
                        .append("\n");
            } else {
                finalResult.append(s.toUpperCase().charAt(0))
                        .append(" : ")
                        .append(e.getKey())
                        .append(" ")
                        .append(e.getValue())
                        .append("\n");
                firstLetter = s.toUpperCase().charAt(0);
            }
        }
        return finalResult;
    }
}


