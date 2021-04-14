package templateMethodPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class DocumentAnalyzer {

    /*----------hooks----------*/
    public void beforeAll(){};
    public void afterAll(){};
    /*-------------------------*/

    public abstract String  getTextFromFile(String filePath);


    public Map<String,Integer> wordCounter(String text)
    {
        String[] words=text.split(" ");
        Map<String,Integer> counter=new HashMap<>();
        Arrays.asList(words)
                .forEach(word->counter.put(word,counter.getOrDefault(word,0)+1));
        return counter;
    }

    public void analyzeText(String filePath)
    {
        beforeAll();
        String text=getTextFromFile(filePath);
        text=text.replaceAll("s+|\n"," ");
        Map<String,Integer> counts=wordCounter(text);
        counts.keySet().forEach(key->System.out.println(key + "->"+counts.get(key)));
        afterAll();
    }

}
