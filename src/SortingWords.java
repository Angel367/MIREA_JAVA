import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingWords {

    public SortingWords() {
        Scanner scanner = new Scanner(System.in);
        String fileContent = "";
        System.out.println("Задание 6:\nВведите имя файла: ");
        try {
            fileContent = Files.readAllLines(Paths.get("C:/Users/1/IdeaProjects/MIREA_JAVA/src/" + scanner.nextLine())).get(0);
        } catch (IOException ignored) {}

        String[] words = fileContent.split(" ");
        StringBuilder resultWords = getLine(words);

        System.out.println("\nИтоговый порядок:\n" + resultWords);

    }

    public StringBuilder getLine(String[] words) {
        StringBuilder resultWords = new StringBuilder();

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));
        System.out.println("Исходный порядок: ");
        for (String word : wordList)
            System.out.print(word + " ");

        while(!checkingWords(wordList))
            Collections.shuffle(wordList);

        for (String word : wordList)
            resultWords.append(word).append(" ");
        return resultWords;
    }
    private boolean checkingWords(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size() - 1 ; i++) {
            if (wordList.get(i).toLowerCase().charAt(wordList.get(i).length()-1) !=
                    wordList.get(i+1).toLowerCase().charAt(0)) return false;
        }
        return true;
    }
}
