package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day2.txt";
        Scanner s1 = new Scanner(new File(path));
        Scanner s2 = new Scanner(new File(path));
        System.out.printf("Part One: %s\n", partOne(s1));
        System.out.printf("Part Two: %s\n", partTwo(s2));
    }

    public static int partOne(Scanner s) {
        int points = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] pair = line.split("\\s+");

            switch (pair[1]) {
                case "X":
                    points += 1;
                    if (pair[0].equals("A")) {
                        points += 3;
                    } else if (pair[0].equals("C")) {
                        points += 6;
                    }
                    break;
                case "Y":
                    points += 2;
                    if (pair[0].equals("A")) {
                        points += 6;
                    } else if (pair[0].equals("B")) {
                        points += 3;
                    }
                    break;
                case "Z":
                    points += 3;
                    if (pair[0].equals("B")) {
                        points += 6;
                    } else if (pair[0].equals("C")) {
                        points += 3;
                    }
                    break;
            }
        }
        return points;
    }

    public static int partTwo(Scanner s) {
        int points = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] pair = line.split("\\s+");

            switch (pair[1]) {
                case "X":
                    if (pair[0].equals("A")) {
                        points += 3;
                    } else if (pair[0].equals("B")) {
                        points += 1;
                    } else {
                        points += 2;
                    }
                    break;
                case "Y":
                    points += 3;
                    if (pair[0].equals("A")) {
                        points += 1;
                    } else if (pair[0].equals("B")) {
                        points += 2;
                    } else {
                        points += 3;
                    }
                    break;
                case "Z":
                    points += 6;
                    if (pair[0].equals("A")) {
                        points += 2;
                    } else if (pair[0].equals("C")) {
                        points += 1;
                    } else {
                        points += 3;
                    }
                    break;
            }
        }
        return points;
    }
}