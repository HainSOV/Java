package Semenar1;

public class ZD2 {
    public static void main(String[] args) {
        int maxSequence = 0; // Переменная для хранения максимальной последовательности
        int currentSequence = 0; // Переменная для хранения текущей последовательности
        int[] array = {1, 1,1,1,1, 0, 1, 1, 1, 1};
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                currentSequence++; // Увеличиваем текущую последовательность
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence; // Обновляем максимальную последовательность, если текущая больше
                }
            } else {
                currentSequence = 0; // Сбрасываем текущую последовательность
            }
        }
        
        System.out.println("Максимальная последовательность единиц: " + maxSequence);
    }
}
