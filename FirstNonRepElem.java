//Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it.
// If there is no such character, return '_'.
//Example
//For s = "abacabad", the output should be
//firstNotRepeatingCharacter(s) = 'c'.
//There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
//For s = "abacabaabacaba", the output should be
//firstNotRepeatingCharacter(s) = '_'.
//There are no characters in this string that do not repeat.

package Basic_Coding_Quest;

import java.util.HashMap;

public class FirstNonRepElem {
    char firstNotRepeatingCharacter(String s){
        HashMap<Character, Integer> char_counts = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
        if(char_counts.containsKey(c)) {
            char_counts.put(c, char_counts.get(c) + 1);
        }else{
            char_counts.put(c, 1);
        }
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(char_counts.get(c) == 1)return c;
        }
        return '_';
    }
}
