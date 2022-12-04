package year2022;

import year2022.days.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.print("Day: ");
        int input = scan.nextInt();

        System.out.printf("---- Day%s ----\n", input);

        while (input != 0) {
            switch (input) {
                case 1: Day1.run(); break;
                case 2: Day2.run(); break;
                case 3: Day3.run(); break;
                case 4: Day4.run(); break;
//                case 5: Day5.run(); break;
//                case 6: Day6.run(); break;
//                case 7: Day7.run(); break;
//                case 8: Day8.run(); break;
//                case 9: Day9.run(); break;
//                case 10: Day10.run(); break;
//                case 11: Day11.run(); break;
//                case 12: Day12.run(); break;
//                case 13: Day13.run(); break;
//                case 14: Day14.run(); break;
//                case 15: Day15.run(); break;
//                case 16: Day16.run(); break;
//                case 17: Day17.run(); break;
//                case 18: Day18.run(); break;
//                case 19: Day19.run(); break;
//                case 20: Day20.run(); break;
//                case 21: Day21.run(); break;
//                case 22: Day22.run(); break;
//                case 23: Day23.run(); break;
//                case 24: Day24.run(); break;
//                case 25: Day25.run(); break;
                default: System.out.println("not a day of christmas...");
            }
            System.out.print("--------------\n");
            System.out.print("Day: ");
            input = scan.nextInt();
        }
    }
}
