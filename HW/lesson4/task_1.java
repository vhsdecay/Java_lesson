package HW.lesson4;
//
// Задание 1.
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
//
import java.util.Scanner;
import java.util.Random;
import java.util.LinkedList;

public class task_1 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int size_list = iScanner.nextInt();
        iScanner.close();
        LinkedList<Integer> linked_list = randLinkList(size_list);

        System.out.printf("Произвольный список чисел размером (%s):", size_list);
        System.out.println("\n" + linked_list);
        System.out.printf("Перевёрнутый список: \n" + reverse(linked_list));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reverse_list = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse_list.add(list.get(i));
        }
        return reverse_list;
    }

    public static LinkedList<Integer> randLinkList(int size) {
        LinkedList<Integer> linked_list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int x = rand.nextInt(size);
            linked_list.add(x);
        }
        return linked_list;
    }
}
