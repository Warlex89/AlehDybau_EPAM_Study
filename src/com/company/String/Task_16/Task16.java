package com.company.String.Task_16;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task16 {
    public static void main(String[] args) {
        /*
         Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
         выполнять с текстом три различных операции: отсортировать абзацы по количеству
         предложений; в каждом предложении отсортировать слова по длине; отсортировать
         лексемы в предложении по убыванию количества вхождений заданного символа,
         а в случае равенства – по алфавиту.
         */
    String text = """
            Первый абзац. Три предложения. Три!
            Второй абзац. Пять предложений. Это третье предложение. Это четвертое. И это пятое...
            Третий абзац и всего одно предложение.
            Четвертый абзац и семь предложений. Второе. Третье. Четвертое. Пятое. Шестое? Седьмое.
            Пятый абзац и снова одно предложение.
            Шестой абзац. Привет, приветы, приветули.""";
    out.println(text);
    withTextOperation(text);
    }

    public static void withTextOperation(String text){
        Scanner sc = new Scanner(in);
        int n = 4;
        out.println("Введите 1 для сортировки абзацев по количеству предложений");
        out.println("Введите 2 для сортировки слов по длине в каждом предложении");
        out.println("Введите 3 для сортировки лексем в предложениях по убыванию");
        out.println("Для выхода из программы нажмите 0");
        while (n != 0){
            out.println("Введите команду");
            n = sc.nextInt();
            switch (n) {
                case 1 -> sortParagraphs(text);
                case 2 -> sortToWords(text);
                case 3 -> sortLexemes(text);
                case 0 -> out.println("Закрытие программы");
                default -> out.println("Неверная команда. Повторите попытку.\n");
            }
        }
    }

    public static void sortParagraphs(String text){
        String[] paragraphs = text.split("\n");
        int[] countSentences = new int[paragraphs.length];
        int maxLength = 0;
        for (int i = 0; i < paragraphs.length; i++){
            String[] sentences = splitSentences(paragraphs[i]);
            countSentences[i] = sentences.length;
            if (maxLength < sentences.length) maxLength = sentences.length;
        }
        for (int i = 0; i <= maxLength; i++){
            for (int j = 0; j < countSentences.length; j ++){
                if (i == countSentences[j]) out.println(paragraphs[j]);
            }
        }
        out.println();
    }

    public static void sortToWords(String text){
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs){
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences){
                String [] words = splitWord(sentence);
                for (int i = words.length - 1; i >= 0; i--){
                    for (int j = 0; j < i; j++){
                        if (words[j].length() > words[j+1].length()){
                            String tmp = words[j];
                            words[j] = words[j+1];
                            words[j+1] = tmp;
                        }
                    }
                }
                for (String word : words){
                    out.println(word+" ");
                }
                out.println("\b. ");
            }
            out.println();
        }
        out.println();
    }

    private static void sortLexemes(String text) {
        Scanner sc = new Scanner(in);
        System.out.print("Введите символ для сортировки лексем по убыванию: ");
        String letter = sc.nextLine();
        String [] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWord(sentence);
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String [] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String[] splitSentences(String sentences){
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(sentences);
    }

    public static String[] splitWord(String words){
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(words);
    }
}


