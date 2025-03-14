package application;

import java.util.Scanner;

import services.PrintService;
import services.PrintServiceString;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PrintServiceString ps = new PrintServiceString();

        System.out.print("How many value? ");
        int values = sc.nextInt();

        for (int i = 0; i < values; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("First: " + ps.first());

        sc.close();
    }
}
