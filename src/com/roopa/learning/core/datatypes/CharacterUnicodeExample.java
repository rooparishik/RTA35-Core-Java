package com.roopa.learning.core.datatypes;

public class CharacterUnicodeExample {
    public static void main(String[] args) {


        char ch = 55555;
        System.out.println("character :: "+ ch);

        char unicodech2 = '\u03A9';
        System.out.println("character :: "+ unicodech2);

        char unicodech3 = '\u2764';
        System.out.println("character :: "+ unicodech3);

        String smileEmoji = "\uD83D\uDE0A";
        String fireEmoji = "\uD83D\uDD25";
        String thumbsUpEmoji = "\uD83D\uDC4D";

        System.out.println("smileEmoji :: "+ smileEmoji);
        System.out.println("fireEmoji :: "+ fireEmoji);
        System.out.println("thumbsUpEmoji :: "+ thumbsUpEmoji);

    }
}
