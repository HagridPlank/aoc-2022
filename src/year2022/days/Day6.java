package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day6 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day6.txt";
        Scanner s1 = new Scanner(new File(path));

        String line = s1.nextLine();
        List<String> input = Arrays.asList(line.split(""));

        System.out.printf("Part One: %s\n", partOne(input));
        System.out.printf("Part Two: %s\n", partTwo(input));
    }

    public static Object partOne(List<String> arr) {
        return arr;
    }

    public static Object partTwo(List<String> arr) {
        return null;
    }
}