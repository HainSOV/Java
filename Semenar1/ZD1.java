package Semenar1;

import java.util.Scanner;

/**
 * ZD1
 */
public class ZD1 {

    public static void main(String[] args) {
        Scanner namScanner = new Scanner(System.in);
        System.out.printf("Ведите имя: ", "\n");
        String name = namScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        namScanner.close();
    }
}