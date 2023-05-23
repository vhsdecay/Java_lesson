package HW.lesson5;
//
// Задание 1.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции: 1) Добавление номера, 2) Вывод всего
//
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Елена", List.of("706-29-66", "471-49-23"));
        phonBook.put("Алексей", List.of("557-20-98"));
        phonBook.put("Dash", List.of("599-35-27"));
        phonBook.put("Пётр", List.of("728-63-83"));
        phonBook.put("Дмитрий", List.of("422-70-26", "574-64-82"));
        menu(phonBook);
    }

    public static String scanner() {

        Scanner scanner = new Scanner(System.in, "Cp866");;
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void findContact(Map<String, List<String>> phonBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.printf("%s: %s \n",name, phonBook.get(name));
        System.out.println(
                "Введите команду для списка контактов: f - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, ex - выйти");
    }

    public static void allContacts(Map<String, List<String>> phonBook) {
        System.out.println("Список контактов:");
        ArrayList<String> keys = new ArrayList<>(phonBook.keySet());
        for(int i = 0; i< keys.size(); i++) {
            String key = keys.get(i);
            List<String> num = phonBook.get(key);
            System.out.printf("%s: %s \n", key, num);
         }
    }

    public static Map<String, List<String>> addContact(Map<String, List<String>> phonBook) {
        System.out.println("Если хотите выйте хотите перестать вводить номера введите 'stop'");
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        if (phonBook.containsKey(name) == true) {
            System.out.println("Такой контакт уже существует");
            System.out.println(
                    "Введите команду для списка контактов: f - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, ex - выйти");
        } else {
            while (true) {
                System.out.println("Введите номер: ");
                String phon = scanner();
                if (phon.equals("stop")) {
                    System.out.println(
                    "Введите команду для списка контактов: f - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, ex - выйти");
                    break;
                } else {
                    number.add(phon);
                }
            }
            phonBook.put(name, number);
        }
        return phonBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
        System.out.println(
                "Введите команду для списка контактов: f - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, ex - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("ex")) {
                break;
            } else {
                switch (comands) {
                    case "f":
                        findContact(phonBook);
                        break;
                    case "add":
                        addContact(phonBook);
                        break;
                    case "all":
                        allContacts(phonBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonBook;
    }
}
