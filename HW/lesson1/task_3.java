package HW.lesson1;

//
// Задание 3.
// Реализовать простой калькулятор
//
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите операцию действия калькулятора(+, -, *, /): ");
        String operation = scan.next();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        scan.close();

        String res = "Результа = 2";
        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.out.println("Что - то ввели неправильное!)");
                break;
        }
        res += result;
        System.out.println(res);
    }
}
