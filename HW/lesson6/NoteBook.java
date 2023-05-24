package HW.lesson6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
    
    // Создание класса
public class NoteBook {
    
    // Создание полей
    private String maker;
    private String model;
    private Double diagonal;
    private String processor;
    private int hardDisk;
    private int typeRAM;
    private String oS;
    private String color;
    private Boolean dvdRom;
    
    // Создание конструктора для создания экземпляров класса
    public NoteBook(String maker, String model, Double diagonal, String processor, int hardDisk, int typeRAM, String oS, String color, Boolean dvdRom) {
        this.maker = maker;
        this.model = model;
        this.diagonal = diagonal;
        this.processor = processor;
        this.hardDisk = hardDisk;
        this.typeRAM = typeRAM;
        this.oS = oS;
        this.color = color;
        this.dvdRom = dvdRom;
    }
    
    // Создание методов get\set Для работы с private полями
    public String getmaker() {return maker;}
    public String getModel() {return model;}
    public Double getDiagonal() {return diagonal;}
    public String getProcessor() {return processor;}
    public int getHardDisk() {return hardDisk;}
    public int getTypeRAM() {return typeRAM;}
    public String getOperatingSystem() {return oS;}
    public String getColor() {return color;}
    public String isDvdRom() {
        String good = "+";
        String notgood = "-";
        if (dvdRom == true) {
            return good;
        }
        return notgood;
    }

    // метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return "\nNoteBook -> [" + maker + " " + model + "]\nДиагональ : " + diagonal + "\nПроцессор : " + processor
                + "\nЖесткий диск : " + hardDisk + "\nОЗУ : " + typeRAM + "\nОС : " + oS + "\nЦвет : " + color
                + "\nDVD : " + isDvdRom() + "\n";
    }
    
    // создание метода фильтрации ноутбуков по выборочной критериям
    public static void sort(Set<NoteBook> noteBooks) {
        Scanner scanner = new Scanner(System.in);
        Set<NoteBook> temp = new HashSet<>(noteBooks);

        System.out.println(
                "Укажите тип подбора ноутбука. (1- Производитель), (2- Жёский диск), (3- ОЗУ), (4- ОС), (5- Цвет)");
        String userFilter = scanner.nextLine();

        for (int i = 0; i < userFilter.length(); i++) {
            if (1 == Character.getNumericValue(userFilter.charAt(i))) {
                var mr = new TreeSet<>();
                for (NoteBook notebook : noteBooks) {
                    mr.add(notebook.getmaker());
                }
                System.out.printf("Выбирите производителя: %s\n", mr);
                String userMaker = scanner.nextLine();
                for (NoteBook notebook : noteBooks) {
                    if (userMaker.equals(notebook.getmaker()) == false) {
                        temp.remove(notebook);
                    }
                }
            }
            if (2 == Character.getNumericValue(userFilter.charAt(i))) {
                var hD = new TreeSet<>();
                for (NoteBook notebook : noteBooks) {
                    hD.add(notebook.getHardDisk());
                }
                System.out.printf("Выберите жёсткий диск: %s\n", hD);
                String userMaker = scanner.nextLine();
                int intuserMaker = Integer.parseInt(userMaker);
                for (NoteBook notebook : noteBooks) {
                    if (intuserMaker != notebook.getHardDisk()) {
                        temp.remove(notebook);
                    }
                }
            }
            if (3 == Character.getNumericValue(userFilter.charAt(i))) {
                var oz = new TreeSet<>();
                for (NoteBook notebook : noteBooks) {
                    oz.add(notebook.getTypeRAM());
                }
                System.out.printf("Выберите ОЗУ: %s\n", oz);
                String userMaker = scanner.nextLine();
                int intuserMaker = Integer.parseInt(userMaker);
                for (NoteBook notebook : noteBooks) {
                    if (intuserMaker != notebook.getTypeRAM()) {
                        temp.remove(notebook);
                    }
                }
            }
            if (4 == Character.getNumericValue(userFilter.charAt(i))) {
                var os = new TreeSet<>();
                for (NoteBook notebook : noteBooks) {
                    os.add(notebook.getOperatingSystem());
                }
                System.out.printf("Выбирите ОС: %s\n", os);
                String userMaker = scanner.nextLine();
                for (NoteBook notebook : noteBooks) {
                    if (userMaker.equals(notebook.getOperatingSystem()) == false) {
                        temp.remove(notebook);
                    }
                }
            }
            if (5 == Character.getNumericValue(userFilter.charAt(i))) {
                var cr = new TreeSet<>();
                for (NoteBook notebook : noteBooks) {
                    cr.add(notebook.getColor());
                }
                System.out.printf("Выбирите цвет: %s\n", cr);
                String userMaker = scanner.nextLine();
                for (NoteBook notebook : noteBooks) {
                    if (userMaker.equals(notebook.getColor()) == false) {
                        temp.remove(notebook);
                    }
                }
            }
        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
         } else {
            System.out.println("Вот что мы можем предложить: \n" + temp.toString());
        }
        
    }
}