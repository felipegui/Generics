package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many value? ");
        int values = sc.nextInt();

        for (int i = 0; i < values; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("First: " + ps.first());

        sc.close();
    }
}
