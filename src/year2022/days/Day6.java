package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day6 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day6.txt";
        Scanner s1 = new Scanner(new File(path));

        String line = s1.nextLine();
        List<String> input = Arrays.asList(line.split(""));

        System.out.printf("Part One: %s\n", partOne(input));
        System.out.printf("Part Two: %s\n", partTwo(input));
    }

    public static int findProcessed(List<String> arr, int length) {
        int processed = length;
        for (int i = 0; i < arr.size() - length - 1; i++) {
            Set<String> currentFour = new HashSet<>(arr.subList(i,i + length));
            if (currentFour.size() != length) {
                processed++;
            } else {
                return processed;
            }
        }
        return processed;
    }

    public static int partOne(List<String> arr) {
        return findProcessed(arr, 4);
    }

    public static Object partTwo(List<String> arr) {
        return findProcessed(arr, 14);
    }
}
