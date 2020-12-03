import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Thirteen Silver Dollars", "It was a cold and cruel evenin' sneaking up on Speedy Creek");
        trackList.put("Big Iron", "To the town of Agua Fria rode a stranger one fine day");
        trackList.put("Kate McCannon", "Well the raven is a wicked bird");
        trackList.put("Happy Reunion", "I was ridin' my horse 'cross the pasture");

        // get an entry based on key value
        String trackName = trackList.get("Happy Reunion");
        System.out.println(trackList.get("Happy Reunion"));

        // containsKey returns a boolean
        System.out.println("The song is here: " + trackList.containsKey("Big Iron"));

        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        System.out.println(keys);

        // map through keys and values to print them all
        for(String key : keys) {
            System.out.println("-----------------------------------------------------");
            System.out.println(key + ": " + trackList.get(key)); 
        }
    }
}