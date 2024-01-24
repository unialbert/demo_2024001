package org.example;

import java.util.Scanner;

public class printPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個字符串：");
        String str = scanner.nextLine();
        int length = str.length();
        printPermutations(str, "", length);
    }

    private static void printPermutations(String str, String prefix, int length) {
        if (length == prefix.length()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newPrefix = prefix + str.charAt(i);
            printPermutations(str, newPrefix, length);
        }
    }
}
