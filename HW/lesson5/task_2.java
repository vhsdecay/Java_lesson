package HW.lesson5;
//
// Задание 2.
// Пусть дан список сотрудников:
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
//
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {

        List<String> workers = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Петр Лыков", "Павел Чернов", "Петр Чернышов","Мария Федорова", "Марина Светлова","Мария Савин", "Мария Рыкова", "Марина Лугова","Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        List<String> workersName = new ArrayList<String>();

        for(int i = 0; i < workers.size(); i++) {
            String [] name = workers.get(i).split(" ");
            workersName.add(name[0]);
        }
        System.out.println("Список работниов:");
        System.out.println(workers);
        System.out.printf("Повторяющиеся именна, по возростанию: %s\n", repeat(workersName));
    }

    public static Map<String, Integer> repeat(List<String> workers) {
        Map<String, Integer> repeatNameCount = new LinkedHashMap<>();
        for (int i = 0; i < workers.size(); i++) {
            if (repeatNameCount.containsKey(workers.get(i))) {
                repeatNameCount.put(workers.get(i), repeatNameCount.get(workers.get(i)) + 1);
            } else {
                repeatNameCount.put(workers.get(i), 1);
            }
        }
        ArrayList<String> keys = new ArrayList<>(repeatNameCount.keySet());
        for (int i = 0; i< keys.size(); i++) {
            String key = keys.get(i);
            if (repeatNameCount.get(key) == 1){
                repeatNameCount.remove(key);
            }
        }
        Map<String, Integer> sortedMap = repeatNameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }

}
