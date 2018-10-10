package com.company;

public class WordProcessing {
    private String text;
    private double sum;

    public String getText() {
        return text;
    }

    public double getSum() {
        wordProcess(this.text);
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setText(String text) {
        this.text = text;
    }

    private void wordProcess (String localstr)
    {
        // для группировки найденных цифр и парсинга каждой группы в число
        StringBuilder sb = new StringBuilder();
        // для вывода строки-списка найденных чисел
        StringBuilder sbout = new StringBuilder();
        int i = 0;
        double sum =0;
        // посимвольный перебор текста
        try {
            while (i < localstr.length()) {
                // проверка на принадлежность к цифрам
                if (Character.isDigit(localstr.charAt(i))) {

                    // если текущий символ это цифра, то добавляем его в строку;
                    // увеличиваем индекс и смотрим сразу следующий символ;
                    // если будет не_цифра, то выйдем из текущего while
                    while (Character.isDigit(localstr.charAt(i)) || localstr.charAt(i) == '.') {

                        sb.append(localstr.charAt(i));
                        i++;
                        // защита от выхода счётчика i за пределы длины строки,
                        // если последний символ в тексте - это цифра
                        if (i == localstr.length())
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
        }
        catch (Exception e)
        {
            System.out.print("Text could not be read correctly!!!\n");
        }

      /*  if (sbout.length() == 0) {
            // если список найденных чисел пуст
            //    System.out.println("Чисел в тексте не найдено");
        } else {

            System.out.println("The sum of the numbers in the given text = " + sum);
        }*/
        setSum(sum);
    }

}
