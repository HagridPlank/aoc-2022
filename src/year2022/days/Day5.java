package year2022.days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day5 {
    public static void run() throws FileNotFoundException {
        String path = "/Users/denistimofeev/Documents/M2/AdventOfCode/src/year2022/inputs/day5.txt";
        Scanner s1 = new Scanner(new File(path));
        Scanner s2 = new Scanner(new File(path));

        //List<Integer> input = new ArrayList<>();



        System.out.printf("Part One: %s\n", partOne(s1));
        System.out.printf("Part Two: %s\n", partTwo(s2));
    }

    public static Object partOne(Scanner s) {
        String result = "";

        for (int i = 0; i < 10; i++) {
            s.nextLine();
        }

        String[][] stringArrs = {
                {"N","C","R","T","M","Z","P"},
                {"D","N","T","S","B","Z"},
                {"M","H","Q","R","F","C","T","G"},
                {"G","R","Z"},
                {"Z","N","R","H"},
                {"F","H","S","W","P","Z","L","D"},
                {"W","D","Z","R","C","G","M"},
                {"S","J","F","L","H","W","Z","Q"},
                {"S","Q","P","W","N"},};

        List<Stack<String>> stacks = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Stack<String> currentStack = new Stack<String>();
            currentStack.addAll(Arrays.asList(stringArrs[i]));
            stacks.add(currentStack);
        }

        while (s.hasNextLine()) {
            s.next();
            int val1 = s.nextInt();
            s.next();
            int val2 = s.nextInt();
            s.next();
            int val3 = s.nextInt();

            for (int i = 0; i < val1; i++) {
                stacks.get(val3 - 1).add(stacks.get(val2 - 1).pop());
            }

            result = "";
            for (int i = 0; i < 9; i++) {
                if (stacks.get(i).size() > 0) {
                    result += stacks.get(i).peek();
                }
            }
        }
        return result;
    }

    public static Object partTwo(Scanner s) {
        String result = "";

        for (int i = 0; i < 10; i++) {
            s.nextLine();
        }

        String[][] stringArrs = {
                {"N","C","R","T","M","Z","P"},
                {"D","N","T","S","B","Z"},
                {"M","H","Q","R","F","C","T","G"},
                {"G","R","Z"},
                {"Z","N","R","H"},
                {"F","H","S","W","P","Z","L","D"},
                {"W","D","Z","R","C","G","M"},
                {"S","J","F","L","H","W","Z","Q"},
                {"S","Q","P","W","N"},};

        List<Stack<String>> stacks = new ArrayList<>();
        Stack<String> tempStack = new Stack<>();
        for (int i = 0; i < 9; i++) {
            Stack<String> currentStack = new Stack<>();
            currentStack.addAll(Arrays.asList(stringArrs[i]));
            stacks.add(currentStack);
        }

        while (s.hasNextLine()) {
            s.next();
            int val1 = s.nextInt();
            s.next();
            int val2 = s.nextInt();
            s.next();
            int val3 = s.nextInt();

            for (int i = 0; i < val1; i++) {
                tempStack.add(stacks.get(val2 - 1).pop());
            }
            for (int i = 0; i < val1; i++) {
                stacks.get(val3 - 1).add(tempStack.pop());
            }

            result = "";
            for (int i = 0; i < 9; i++) {
                if (stacks.get(i).size() > 0) {
                    result += stacks.get(i).peek();
                }
            }
        }
        return result;
    }
}