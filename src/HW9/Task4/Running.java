package HW9.Task4;

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

        System.out.println(tf.isPalindromes("Aquas rebel read madam."));

    }
}
