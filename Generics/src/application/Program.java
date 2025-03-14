package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many value? ");
        int values = sc.nextInt();

        for (int i = 0; i < values; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
