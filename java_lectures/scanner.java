package java_lectures;

import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("name:");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();    
    }
    
    
}
