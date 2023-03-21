package lesson2;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(palindrom(string));
        in.close();
        FourthTask fourthTask = new FourthTask();
        fourthTask.writer();
    }
    //1. Напишите метод, который принимает на вход строку (String) и определяет является ли
    // строка палиндромом (возвращает boolean значение).
    public static boolean palindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }

}

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

class FourthTask {

    public StringBuilder composeString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

            fileOutputStream.write(composeString().toString().getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }
}


