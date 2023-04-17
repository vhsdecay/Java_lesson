package HW.lesson1;

//
// Задание 2.
// Вывести все простые числа от 1 до 1000 
//

public class task_2 {

    public static void main(String[] args) {

        int counter = 0;
        String result = "";
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == 1) {
                result += i + ", ";
            } 

            counter = 0;
        }

        System.out.println("Простые числа от 1 до 1000: " + result);
    }
}