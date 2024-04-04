import java.util.HashMap;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase to consider case-insensitive duplicates
        str = str.toLowerCase();

        // Iterate through the characters of the string and count their occurrences
        for (char ch : str.toCharArray()) {
            // Ignore spaces
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the duplicate characters along with their counts
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + ": " + charCountMap.get(ch));
            }
        }
    }

    public static void main(String[] args) {
        String str = "Programming";
        
        // Find and print duplicate characters in the string
        findDuplicateCharacters(str);
    }
}