package HW.lesson3;
//
// Задание 2.
// Пусть дан произвольный список целых чисел, удалить из него чётные числа.
//
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class task_2 {
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
            System.out.printf("Произвольный список чисел размером (%s):", size_list);
            System.out.println("\n" + rand_list);

            for (int i = rand_list.size() - 1; i >= 0; i--) {
                int even = rand_list.get(i) % 2;
                if (even == 0) {
                    rand_list.remove(i);
                }
            }
            Collections.sort(rand_list);
            System.out.println("Список с удаленными четными числами:");
            System.out.println(rand_list);
        }
    }

}