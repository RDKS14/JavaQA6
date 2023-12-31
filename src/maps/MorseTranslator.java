package maps;

import java.util.HashMap;

public class MorseTranslator {

    private HashMap<String, String> morseCode = new HashMap<>();

    public MorseTranslator() {

        morseCode.put(".-", "A");
        morseCode.put("-...", "B");
        morseCode.put("-.-.", "C");
        morseCode.put("-..", "D");
        morseCode.put(".", "E");
        morseCode.put("..-.", "F");
        morseCode.put("--.", "G");
        morseCode.put("....", "H");
        morseCode.put("..", "I");
        morseCode.put(".---", "J");
        morseCode.put("-.-", "K");
        morseCode.put(".-..", "L");
        morseCode.put("--", "M");
        morseCode.put("-.", "N");
        morseCode.put("---", "O");
        morseCode.put(".--.", "P");
        morseCode.put("--.-", "Q");
        morseCode.put(".-.", "R");
        morseCode.put("...", "S");
        morseCode.put("-", "T");
        morseCode.put("..-", "U");
        morseCode.put("...-", "V");
        morseCode.put(".--", "W");
        morseCode.put("-..-", "X");
        morseCode.put("-.--", "Y");
        morseCode.put("--..", "Z");
        morseCode.put(".----", "1");
        morseCode.put("..---", "2");
        morseCode.put("...--", "3");
        morseCode.put("....-", "4");
        morseCode.put(".....", "5");
        morseCode.put("-....", "6");
        morseCode.put("--...", "7");
        morseCode.put("---..", "8");
        morseCode.put("----.", "9");
        morseCode.put("-----", "0");
        morseCode.put("/", " ");

    }

    public String translator(String input) {
        String[] words = input.split(" / ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String character : letters) {
                output.append(morseCode.get(character));
            }
            output.append(" ");
        }


        return output.toString();
    }
}
