package HW.lesson3;
//
// Задание 3.
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class task_3 {
    public static void main(String[] args) throws Exception {

        System.out.print("Введите длину списка: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int size_list = iScanner.nextInt();
            ArrayList<Integer> rand_list = new ArrayList<Integer>();
            Random rand = new Random();
            for (int i = 0; i < size_list; i++) {
                int x = rand.nextInt(size_list);
                rand_list.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n" + rand_list);

            int min = rand_list.get(0);
            int max = rand_list.get(0);
            float sum = 0;
            for (int i = 0; i < rand_list.size(); i++) {
                int num = rand_list.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float average = sum / rand_list.size();

            System.out.printf("Мин. значение = %s \n", min);
            System.out.printf("Макс. значение = %s \n", + max);
            System.out.printf("Сред.арифм. значение = %s", average);
        }
    }
}
