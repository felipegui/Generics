package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many value? ");
        int values = sc.nextInt();

        for (int i = 0; i < values; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();

        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
