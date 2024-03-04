package java_lectures;

 import java.io.BufferedReader;
 import java.io.BufferedWriter;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;

 public class ZD2 {

     public static void main(String[] args) {
         String polynomial1File = "polynomial1.txt";
         String polynomial2File = "polynomial2.txt";
         String sumFile = "sum_polynomials.txt";
         try {
            String polynomial1 = readPolynomialFromFile(polynomial1File);
            String polynomial2 = readPolynomialFromFile(polynomial2File);
            String sum = sumPolynomials(polynomial1, polynomial2);
            writeSumToFile(sumFile, sum);
            System.out.println("Сумма полиномов успешно записана в файл " + sumFile);
 
         } catch (IOException e) {
            System.out.println("Произошла ошибка при обработке файлов: " + e.getMessage());
         }
     }
     private static String readPolynomialFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
         while ((line = reader.readLine()) != null) {
             stringBuilder.append(line.trim());
         }
 
         reader.close();
         return stringBuilder.toString();
     }
     private static String sumPolynomials(String polynomial1, String polynomial2) {
       return "";
     }
     private static void writeSumToFile(String filename, String sum) throws IOException {
 
         BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
         writer.write(sum);
         writer.close();
     }
 }

 
