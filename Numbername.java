package Task_4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Numbername {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Constant constant = new Constant();

        System.out.print(constant.Enter_NUM);

        try {
            int n = scanner.nextInt();

            String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
            String[] tens = { "none", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                    "ninety" };
            String[] hundreds = { "none", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                    "six hundred", "seven hundred", "eight hundred", "nine hundred" };

            if (n == 1000) {
                System.out.println("one Thousand");
            } else if (n < 10) {
                System.out.println(ones[n]);
            } else if (n >= 10 && n < 100) {
                int e = n / 10;
                String s2 = tens[e];
                int f = n % 10;
                String s1 = f > 0 ? ones[f] : "";
                System.out.println(s2 + (f > 0 ? " " + s1 : ""));
            } else if (n >= 100 && n < 1000) {
                int p = n / 100;
                String s3 = hundreds[p];
                int e = (n % 100) / 10;
                String s2 = e > 0 ? tens[e] : "";
                int f = n % 10;
                String s1 = f > 0 ? ones[f] : "";
                System.out.println(s3 + (e > 0 ? " " + s2 : " ") + (f > 0 ? " " + s1 : ""));
            }
        } catch (InputMismatchException e) {
            System.out.print("Input provided by you is not valid.");
        }

        scanner.close();
    }
}