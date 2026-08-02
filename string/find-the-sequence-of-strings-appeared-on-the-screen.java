import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder currentscreen = new StringBuilder();
        
        for (char tar : target.toCharArray()) {
            // Step 1: Append 'a' using Key 1
            currentscreen.append('a');
            result.add(currentscreen.toString()); // Add current state after appending 'a'

            // Step 2: Change the last character to the target character using Key 2
            char lastchar = currentscreen.charAt(currentscreen.length() - 1);
            int clockwise = (tar - lastchar + 26) % 26;

            // Apply Key 2 presses to match the target character
            for (int i = 0; i < clockwise; i++) {
                lastchar = (char) ((lastchar - 'a' + 1) % 26 + 'a');
                currentscreen.setCharAt(currentscreen.length() - 1, lastchar);
                result.add(currentscreen.toString()); // Add current state after each Key 2 press
            }
        }
        
        return result;
    }
}
