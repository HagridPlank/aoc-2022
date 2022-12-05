package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day1.txt";
        Scanner s = new Scanner(new File(path));
        String line = "";
        int calories = 0;
        int i = 0;
        int[] arr = new int[i];

        while (s.hasNextLine()) {
            line = s.nextLine();
            if (line.equals("")) {
                i += 1;
                arr = Arrays.copyOf(arr, i);
                arr[i - 1] = calories;
                calories = 0;
            } else {
                calories += Integer.parseInt(line);
            }
        }
        Arrays.sort(arr);

        System.out.printf("Part One: %s\n", partOne(arr));
        System.out.printf("Part Two: %s\n", partTwo(arr));
    }

    public static int partOne(int[] arr) {
        return arr[arr.length-1];
    }

    public static int partTwo(int[] arr) {
        return arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3];
    }
}