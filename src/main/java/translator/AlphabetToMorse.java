package translator;

import java.util.HashMap;
import java.util.Map;

class AlphabetToMorse {
    private Map<Character, String> alphabet = new HashMap<>();

    AlphabetToMorse() {
        alphabet.put(' ', "|");
        alphabet.put('a', ".-");
        alphabet.put('b', "-...");
        alphabet.put('c', "-.-.");
        alphabet.put('d', "-..");
        alphabet.put('e', ".");
        alphabet.put('f', "..-.");
        alphabet.put('g', "--.");
        alphabet.put('h', "....");
        alphabet.put('i', "..");
        alphabet.put('j', ".---");
        alphabet.put('k', "-.-");
        alphabet.put('l', ".-..");
        alphabet.put('m', "--");
        alphabet.put('n', "-.");
        alphabet.put('o', "---");
        alphabet.put('p', ".--.");
        alphabet.put('q', "--.-");
        alphabet.put('r', ".-.");
        alphabet.put('s', "...");
        alphabet.put('t', "-");
        alphabet.put('u', "..-");
        alphabet.put('v', "...-");
        alphabet.put('w', ".--");
        alphabet.put('x', "-..-");
        alphabet.put('y', "-.--");
        alphabet.put('z', "--..");
        alphabet.put('1', ".----");
        alphabet.put('2', "..--");
        alphabet.put('3', "...--");
        alphabet.put('4', "....-");
        alphabet.put('5', ".....");
        alphabet.put('6', "-....");
        alphabet.put('7', "--...");
        alphabet.put('8', "---..");
        alphabet.put('9', "----.");
        alphabet.put('0', "-----");
    }

    String searchLetter(char letter){
        return alphabet.get(letter);
    }
}
