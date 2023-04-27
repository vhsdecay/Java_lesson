package HW.lesson4;
//
// Задание 2.
// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue(), dequeue(), first()
//
import java.util.Random;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        LinkedList<Integer> rand_list_10 = randLinkList(10);
        System.out.printf("Произвольный массив из 10 элм.:\n" + rand_list_10 + "\n"); 

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите элемент, для добавления в список: ");
        int act = sc.nextInt();
        sc.close();
        enqueue(rand_list_10, act);
        System.out.println(rand_list_10);

        System.out.printf("Первый элемент (%s) из списка, удалён.\n", dequeue(rand_list_10));
        System.out.println(rand_list_10);
        System.out.printf("Теперь первый элемент в списке (%s).\n", first(rand_list_10));
        System.out.println(rand_list_10);
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

    public static void enqueue(LinkedList<Integer> ls, int element){
        ls.add(element);
    }
    public static int dequeue(LinkedList<Integer> ls){
        int a = ls.getFirst();
        ls.removeFirst();
        return a;

    }
    public static int first(LinkedList<Integer> ls){
        return ls.getFirst();
    }
    
}
