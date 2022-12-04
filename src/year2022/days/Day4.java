package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day4 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day4.txt";
        Scanner s1 = new Scanner(new File(path));
        Scanner s2 = new Scanner(new File(path));

        List<Integer> input = new ArrayList<>();

        System.out.printf("Part One: %s\n", partOne(s1));
        System.out.printf("Part Two: %s\n", partTwo(s2));
    }

    public static Object partOne(Scanner s) {
        int count = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] ranges = line.split(",");

            int lower1 = Integer.parseInt(ranges[0].split("-")[0]);
            int upper1 = Integer.parseInt(ranges[0].split("-")[1]);
            int lower2 = Integer.parseInt(ranges[1].split("-")[0]);
            int upper2 = Integer.parseInt(ranges[1].split("-")[1]);

            if (lower1 >= lower2 && upper1 <= upper2 || lower2 >= lower1 && upper2 <= upper1) {
                count++;
            }
        }
        return count;
    }

    public static Object partTwo(Scanner s) {
        int count = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] ranges = line.split(",");

            int lower1 = Integer.parseInt(ranges[0].split("-")[0]);
            int upper1 = Integer.parseInt(ranges[0].split("-")[1]);
            int lower2 = Integer.parseInt(ranges[1].split("-")[0]);
            int upper2 = Integer.parseInt(ranges[1].split("-")[1]);

            if (upper1 >= lower2 && upper2 >= lower1) {
                count ++;
            }
        }
        return count;
    }
}