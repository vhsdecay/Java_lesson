package HW.lesson6;

/**
 * Задание 6 урока.
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * 2. Создать множество ноутбуков.
 * 3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
 */

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        // Создание объектов
        NoteBook asus_AL9 = new NoteBook("Asus", "AL9", 14.4, "Core i3", 500, 8, "Windows 10", "Red", false);
        NoteBook asus_ROG = new NoteBook("Asus", "ROG", 15.6, "AMD Ryzen7 ", 512, 16, "Windows 11", "Black", true);
        NoteBook apple_Air13 = new NoteBook("Apple", "MacBook Air_13", 13.3, "Apple M1", 256, 8, "macOS", "Grey", false);
        NoteBook xiaomi_RB15 = new NoteBook("Xiaomi", "RedmiBook 15", 15.6, "Core i3", 256, 8, "Windows 11", "Grey", false);
        NoteBook lenovo_IdeaPad = new NoteBook("Lenovo", "IdeaPad", 15.6, "AMD Ryzen5", 512, 16, "Windows 10", "Grey",true);
        NoteBook acer_air5 = new NoteBook("Asus", "air6", 19.0, "Core i3", 600, 8, "Windows 10", "Black", true);
        NoteBook acer_a313 = new NoteBook("Asus", "a313", 14.4, "Core i3", 500, 8, "Windows 10", "Black", true);
        // Создание множества
        Set<NoteBook> notebooks = new HashSet<>(
                List.of(asus_AL9, asus_ROG, apple_Air13, xiaomi_RB15, lenovo_IdeaPad, acer_air5, acer_a313));
        // Приветствие пользователя
        System.out.printf("Здравствуйте, в наличии имеется %s ноутбуков\n", notebooks.size());
        System.out.println("Для просмотра всех вариантов - all, для подбора по критерию - crt, ex - выйти");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String comands = scanner.nextLine();

            if (comands.equals("ex")) {
                break;
            } else {
                switch (comands) {
                    case "all":
                        System.out.println(notebooks);
                        System.out.println(
                                "Для просмотра всех вариантов - all, для подбора по критерию - crt, ex - выйти");
                        break;
                    case "crt":
                        NoteBook.sort(notebooks);
                        System.out.println(
                                "Для просмотра всех вариантов - all, для подбора по критерию - crt, ex - выйти");
                        break;
                    default:
                        break;
                }
            }
        }
        //

    }
}
