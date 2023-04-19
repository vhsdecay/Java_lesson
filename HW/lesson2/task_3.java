package HW.lesson2;
//
// Задание 3.
// К калькулятору из предыдущего дз добавить логирование.
//
import java.util.Scanner;
import java.io.FileWriter;

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

        String res = "Результат = ";
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

        StringBuilder newTask = new StringBuilder();
        newTask.append(num1).append(operation).append(num2).append("=").append(result).append("\n");

        try {
            FileWriter fw = new FileWriter("task_3.txt", true);
            fw.write(newTask.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }  
    }
}
