package Semenar1;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class ZD1_1{
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        Scanner namScanner = new Scanner(System.in);
        System.out.printf("Ведите имя: ", "\n");
        String name = namScanner.nextLine();
        namScanner.close();
        Date date = new Date();
        System.out.println(date.toString());
        }
        
       
}

