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

    public static int partOne(List<String> arr) {
        int processed = 4;
        for (int i = 0; i < arr.size() - 3; i++) {
            Set<String> currentFour = new HashSet<>(arr.subList(i,i + 4));
            if (currentFour.size() != 4) {
                processed++;
            } else {
                return processed;
            }
        }
        return processed;
    }

    public static Object partTwo(List<String> arr) {
        return null;
    }
}