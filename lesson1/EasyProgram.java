import java.util.Scanner;
// -----------------------------------------------------------------
//
// Стркуктура простой проограммы
//
public class EasyProgram {
    public static void main(String[] args) {

        System.out.println("Goodbye world");
        
    }

}
// -----------------------------------------------------------------
//
// Основные типы данных
//
class DataTypes {
    public static void main(String[] args) {

        short age = 10;
        System.out.println(age); // 10

        int salary = 123456;
        System.out.println(salary); // 123456

        float e = 2.7f;
        System.out.println(e); // 2.7

        double pi = 3.1415;
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        
        // Не явная типизация 
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        
        // Примитив .. Обертка
        // int    .. Integer
        // short  .. Short
        // long   .. Long
        // byte   .. Byte
        // float  .. Float
        // double .. Double
        // char   .. Character
        // boolean . Boolean
    }
}
// -----------------------------------------------------------------
//
// Операции Java
//
// ● Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^
// -----------------------------------------------------------------
//
// Массивы
//
class Arrays {
    public static void main(String[] args) {

        // Одномерные
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        // Многомерные
        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }     
    }

}
// -----------------------------------------------------------------
//
// Преобразования
//
class Transformations {
    public static void main(String[] args) {

    int i = 123; double d = i;
    System.out.println(i); // 123
    System.out.println(d); // 123.0

    d = 3.1415; i = (int)d;
    System.out.println(d); // 3.1415
    System.out.println(i); // 3

    d = 3.9415; i = (int)d;
    System.out.println(d); // 3.9415
    System.out.println(i); // 3

    byte b = Byte.parseByte("123");
    System.out.println(b); // 123

    b = Byte.parseByte("1234");
    System.out.println(b); // NumberFormatException: Value out of range
    }
   }
// -----------------------------------------------------------------
//
// Получение данных из терминала
//
// import java.util.Scanner;
class GettingDataTerminal {
    public static void main(String[] args) {
        
        // Строки
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // // Некоторые примитивы
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Проверка на соответствие получаемого типа
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}
// -----------------------------------------------------------------
//
// Форматированный вывод
//
class Program {
    public static void main(String[] args) {

        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        int y = 1, z = 2;
        int n = y + z;
        String res2 = String.format("%d + %d = %d \n", y, z, n);
        System.out.printf("%d + %d = %d \n", y, z, n);
        System.out.println(res2);
        }
   }
// -----------------------------------------------------------------
//
//    Виды спецификаторов
//    %d: целочисленных значений
//    %x: для вывода шестнадцатеричных чисел
//    %f: для вывода чисел с плавающей точкой
//    %e: для вывода чисел в экспоненциальной форме,
//    например, 3.1415e+01
//    %c: для вывода одиночного символа
//    %s: для вывода строковых значений
//
// -----------------------------------------------------------------
//
// Виды спецификаторов
//
class TypesSpecifiers {
    public static void main(String[] args) {
   
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
    }
}
   