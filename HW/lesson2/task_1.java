package HW.lesson2;
//
// Задание 1.
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
//
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_1 {

    
    public static int[] randomArr() {

        Scanner values_str = new Scanner(System.in);
        System.out.print("Введите значения через пробел: ");
        String values_string = values_str.nextLine();
        values_str.close();
        System.out.println(values_string);

        String[] values_st = values_string.split(" ");

        int[] values_int = Arrays.asList(values_st).stream().mapToInt(Integer::parseInt).toArray();

        return values_int;

    }

    public static int[] BabblSort(int arr[]) throws IOException {
        Logger loger = Logger.getLogger(task_1.class.getName());
        FileHandler fHandler = new FileHandler("task_1log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            loger.info(Arrays.toString(arr));
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

        print(BabblSort(randomArr()));
    }

}