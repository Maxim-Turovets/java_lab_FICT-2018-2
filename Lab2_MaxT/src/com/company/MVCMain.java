package com.company;



import java.util.regex.*;
import java.io.IOException;
import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {
       /* int size;
        MatrixHandler model;
        try {
            System.out.println("Enter size matrix:");
            Scanner in = new Scanner(System.in);
            size = in.nextInt();
            model = new MatrixHandler(size);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            model = new MatrixHandler();
        }



    View view = new View();
    MatrixHandlerController  controller = new MatrixHandlerController(model,view);

    controller.updateView();
    System.out.print("===========================\n");
    model.rotatingMatrix();
    controller.updateView();*/

        // для группировки найденных цифр и парсинга каждой группы в число
        StringBuilder sb = new StringBuilder();
        // для вывода строки-списка найденных чисел
        StringBuilder sbout = new StringBuilder();
        int i = 0;
        double sum =0;
        String s = "вапувпг 12 8 10 5.5";
        // посимвольный перебор текста
        while (i < s.length()) {
            // проверка на принадлежность к цифрам
            if (Character.isDigit(s.charAt(i))) {

                // если текущий символ это цифра, то добавляем его в строку;
                // увеличиваем индекс и смотрим сразу следующий символ;
                // если будет не_цифра, то выйдем из текущего while
                while (Character.isDigit(s.charAt(i)) || s.charAt(i)=='.') {

                    sb.append(s.charAt(i));
                    i++;
                  System.out.print(sb);
                    // защита от выхода счётчика i за пределы длины строки,
                    // если последний символ в тексте - это цифра
                    if (i == s.length())
                        break;
                } // выходим из while, имея группу цифр в объекте sb

                double k = Double.parseDouble(sb.toString()); // парсинг sb в число
                sum += k; // подсчёт суммы
                sbout.append(k + ", "); // формирование строки-списка найденных
                // чисел
                sb.delete(0, sb.length()); // очистка sb для повторного
                // использования

            } else
                // если текущий символ - это не_цифра,
                // просто переходим к следующему
                i++;
        }

        if (sbout.length() == 0) {
            // если список найденных чисел пуст
        //    System.out.println("Чисел в тексте не найдено");
        } else {
            System.out.println("Найденные в тексте числа: ");
            // удаление лишних запятой и пробела, добавленных в конце списка
            System.out.println(sbout.delete(sbout.length() - 2,
                    sbout.length() - 1));
            System.out.println("Сумма чисел в заданном тексте = " + sum);
        }


      /*  Pattern pat=Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher=pat.matcher("45.5saf -fg123 -18+");
        while (matcher.find()) {
            System.out.println(matcher.group());
        };*/



    }
}
