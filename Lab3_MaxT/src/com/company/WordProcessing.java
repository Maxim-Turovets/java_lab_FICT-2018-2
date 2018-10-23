package com.company;

public class WordProcessing {
    private String text;
    private int sum;

    public String getText() {
        return text;
    }

    public int getSum() {
        wordProcess(this.text);
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setText(String text) {
        this.text = text;
    }

    private void wordProcess (String localstr)
    {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int sum =0;
        // посимвольный перебор текста
        try {
            while (i < localstr.length()) {
                // проверка на принадлежность к цифрам
                if (Character.isDigit(localstr.charAt(i))) {

                   /* while (Character.isDigit(localstr.charAt(i)) || localstr.charAt(i) == '.') {

                        sb.append(localstr.charAt(i));
                        i++;
                        // защита от выхода счётчика i за пределы длины строки,если последний символ в тексте - это цифра
                        if (i == localstr.length())
                            break;
                    } // выходим из while, имея группу цифр в объекте sb
*/
                    sb.append(localstr.charAt(i));
                    int k = Integer.parseInt(sb.toString()); // парсинг sb в число
                    sum += k; // подсчёт
                 //   System.out.println(sum);
                    i++;

                    sb.delete(0, sb.length());
                }
                else
                    i++;
            }
        }
        catch (Exception e)
        {
            System.out.print("Text could not be read correctly!!!\n");
        }

        setSum(sum);
    }

}
