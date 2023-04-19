package HW.lesson2;
//
// Задание 2.
// Дана строка (получение через обычный текстовый файл!!!)
//
import java.io.BufferedReader;
import java.io.FileReader;

public class task_2 {
    public static void main(String[] args) throws Exception {

        String dataFile = "task_2.txt";
        String[] infoBase;
        StringBuilder sb = new StringBuilder();

        System.out.println(dataFile.length());
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line; {
                while ((line = br.readLine()) != null) {
                    infoBase = line.replace("\"", "").split(":|,");
                    sb.append("Студент ").append(infoBase[1]).append(" получил ").append(infoBase[3])
                    .append(" по предмету ").append(infoBase[5]).append(".\n");
                }
                System.out.println(sb);
            }
            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}