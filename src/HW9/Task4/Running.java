package HW9.Task4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import HW9.Task1_2_3.*;

public class Running {

    public static void main(String[] args) {

// 4)Текстовый файл содержит текст. После запуска программы в другой файл
// должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
// предложении присутствует слово-палиндром, то не имеет значения какое кол-во
// слов в предложении, оно попадает в новый файл.
// Пишем все в ООП стиле. Создаём класс TextFormatter
// в котором два статических метода:
// 1. Метод принимает строку и возвращает кол-во слов в строке.
// 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
// есть возвращает true, если нет false

        String s = "Aquas rebel read. Fade the  feeders to a madam. Amber linen relation.";

        TextFormatter tf = new TextFormatter(s);

        tf.sentenceChecker();

        FileInputStream fileIS = null;
        InputStreamReader inputSR = null;
        String str = "";
        int b;

        try {                                       // попытка прочитать файл содержащий ту же строку, что и String s
            fileIS = new FileInputStream("C:/Users/PD/IdeaProjects/TMS_HomeWorks/src/HW9/Task4/TEst.txt");
            inputSR = new InputStreamReader(fileIS);
            while ((b = inputSR.read()) != -1) {
                str +=(char)b;
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Exception 1");
        } catch (IOException e2) {
            System.out.println("Exception 2");
        } finally {
            try {
                fileIS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputSR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(str);

        Cutter ctr1 = new Cutter(str);

        System.out.println("\nIs palindromes here: " + tf.isPalindromes(str));

        System.out.println(ctr1.palindromeSearch());
    }
}
