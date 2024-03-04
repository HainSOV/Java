package java_lectures;
import java.util.Random;
import java.util.Scanner;

public class zadacha {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // ввод новой переменной из терминала
        System.out.println("Input new a number:"); // вывести сообщение на экран
        int k = iScanner.nextInt(); // создание переменой 
        Random r = new Random(); // создание рандомазира
        int a = r.nextInt(100); // ввод переменной с рандомными значениями 
        int b = r.nextInt(100); // ввод переменной с рандомными значениями 
        int c = r.nextInt(100); // ввод переменной с рандомными значениями 
        if (c == 0 && b != 0 ) { // создание условий выбора формата вывода на экран многочилена 
            System.out.printf("%dX^%d + %dx = 0", a, k, b, c );    
        }else if (b == 0 && c != 0 ){
            System.out.printf("%dX^%d + %d = 0", a, k, c );
        }else if (b == 0 && c == 0){
            System.out.printf("%dX^%d = 0", a, k);
        }else{
            System.out.printf("%dX^%d + %dx + %d = 0", a, k, b, c );
        }   
        
}
    
}