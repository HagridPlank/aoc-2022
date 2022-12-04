package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day3.txt";
        Scanner s = new Scanner(new File(path));
        Scanner s2 = new Scanner(new File(path));

        System.out.printf("Part One: %s\n", partOne(s));
        System.out.printf("Part Two: %s\n", partTwo(s2));
    }

    public static int getPriority(String item) {
        String[] arrItemsLower = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] arrItemsUpper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int priority = 0;

        for (int i = 0; i < arrItemsLower.length; i++) {
            if (item.equals(arrItemsLower[i])) {
                priority = i + 1;
            }
        }
        for (int i = 0; i < arrItemsUpper.length; i++) {
            if (item.equals(arrItemsUpper[i])) {
                priority = i + 27;
            }
        }
        return priority;
    }

    public static int partOne(Scanner s) {
        int sum = 0;

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] allItems = line.split("");
            String[] items1 = Arrays.copyOfRange(allItems, 0, allItems.length / 2);
            String[] items2 = Arrays.copyOfRange(allItems, allItems.length / 2, allItems.length);

            boolean found = false;
            for (String item1 : items1) {
                if (Arrays.asList(items2).contains(item1) && !found) {
                    sum += getPriority(item1);
                    found = true;
                }
            }
        }
        return sum;
    }

    public static int partTwo(Scanner s) {
        int sum = 0;
        while (s.hasNextLine()) {
            String line1 = s.nextLine();
            String line2 = s.nextLine();
            String line3 = s.nextLine();
            String[] items1 = line1.split("");
            String[] items2 = line2.split("");
            String[] items3 = line3.split("");

            boolean found = false;
            for (String item1 : items1) {
                if (Arrays.asList(items2).contains(item1) && Arrays.asList(items3).contains(item1) && !found) {
                    sum += getPriority(item1);
                    found = true;
                }
            }
        }
        return sum;
    }
}