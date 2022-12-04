package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DayTemplate {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day.txt";
        Scanner s1 = new Scanner(new File(path));
        Scanner s2 = new Scanner(new File(path));

        List<Integer> input = new ArrayList<>();

        while (s1.hasNextLine()) {
            String line = s1.nextLine();
        }

        System.out.printf("Part One: %s\n", partOne(input));
        System.out.printf("Part Two: %s\n", partTwo(input));
    }

    public static Object partOne(Object arr) {
        return null;
    }

    public static Object partTwo(Object arr) {
        return null;
    }
}