package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PuzzleOne {

    public static int getNumber(String input) {
        int first = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        for(char ch: input.toCharArray())
            if( (int) ch >= 48 && (int) ch <=57 ) {
                if(first == Integer.MIN_VALUE)
                    first = Character.getNumericValue(ch);
                last = Character.getNumericValue(ch);
            }
        return first * 10 + last;
    }

    public static void main(String[] args) throws IOException {

        List<String> liness = Files
                .readAllLines(Path.of("/Users/mukundmadhav/Downloads/input.txt"));

        int sumVal = liness
                .stream()
                .map(PuzzleOne::getNumber)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sumVal);


    }

}
