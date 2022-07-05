package com.company;

public class Lab3 {
    public static void main(String[] args) {

        String myText = "London is the capital of Great Britain, its political, economic, and commercial centre. It is one of the largest cities in the world and the largest city in Europe.";
        String[] words = myText.split(" ");
        String vowel = "A a E e I i O o U u";
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index > 0) {
                    count[i] = count[i] + 1;
                }
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < count.length - 1; i++) {
            for (int j = i + 1; j < count.length; j++) {
                if (count[i] > count[j]) {
                    int x = count[i];
                    count[i] = count[j];
                    count[j] = x;
                    String y = words[i];
                    words[i] = words[j];
                    words[j] = y;
                }
            }
        }
        for (int i = 0; i < words.length; i++)
            System.out.print(words[i] + " ");
    }
}
