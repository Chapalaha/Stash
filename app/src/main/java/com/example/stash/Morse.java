package com.example.stash;

import java.util.HashMap;

public class Morse {

    static String[] ALPHA = { "a", "b", "w", "g", "d", "e", "v", "z", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s",
            "t", "u", "f", "h", "c", "", "", "q", "y", "x", "", "", "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", ",", "?",
            ".", "'" };


    static String[] RUS_ALPHA= { "а", "б", "в", "г", "д", "е", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с",
            "т", "у", "ф", "х", "ц", "ч", "ш", "щ","ы","ь","э", "ю", "я", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", ",", "?",
            ".", "'" };


    static String[] MORSE = { ".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "...-", "-.-.", "---.", "----", "--.-",
            "-.--","-..-", "..-..", "..--", ".-.-", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
            "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----." };

    public static HashMap<String, String> ALPHA_TO_MORSE = new HashMap<>();
    public static HashMap<String, String> MORSE_TO_ALPHA = new HashMap<>();

    public static HashMap<String, String> RUS_ALPHA_TO_MORSE = new HashMap<>();
    public static HashMap<String, String> MORSE_TO_RUS_ALPHA = new HashMap<>();


    static {
        for (int i = 0; i < ALPHA.length  &&  i < MORSE.length &&  i < RUS_ALPHA.length; i++) {
            ALPHA_TO_MORSE.put(ALPHA[i], MORSE[i]);
            MORSE_TO_ALPHA.put(MORSE[i], ALPHA[i]);
            RUS_ALPHA_TO_MORSE.put(RUS_ALPHA[i], MORSE[i]);
            MORSE_TO_RUS_ALPHA.put(MORSE[i], RUS_ALPHA[i]);
        }
    }

    public static String morseToAlpha(String morseCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = morseCode.trim().split("   ");

        for (String word : words) {
            for (String letter : word.split(" ")) {
                String alpha = MORSE_TO_ALPHA.get(letter);
                builder.append(alpha);
            }

            builder.append(" ");
        }

        builder = new StringBuilder(builder.substring(0, builder.length() - 1));

        return builder.toString().toUpperCase();
    }

    public static String alphaToMorse(String englishCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = englishCode.trim().split(" ");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String morse = ALPHA_TO_MORSE.get(word.substring(i, i + 1).toLowerCase());
                builder.append(morse).append(" ");
            }

            builder.append("  ");
        }

        builder = new StringBuilder(builder.substring(0, builder.length() - 3));

        return builder.toString();
    }



    public static String morseToRusAlpha(String morseCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = morseCode.trim().split("   ");

        for (String word : words) {
            for (String letter : word.split(" ")) {
                String alpha = MORSE_TO_RUS_ALPHA.get(letter);
                builder.append(alpha);
            }

            builder.append(" ");
        }


        builder = new StringBuilder(builder.substring(0, builder.length() - 1));

        return builder.toString().toUpperCase();
    }

    public static String rusAlphaToMorse(String rusCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = rusCode.trim().split(" ");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String morse = RUS_ALPHA_TO_MORSE.get(word.substring(i, i + 1).toLowerCase());
                builder.append(morse).append(" ");
            }

            builder.append("  ");
        }
        builder = new StringBuilder(builder.substring(0, builder.length() - 3));

        return builder.toString();
    }

}


