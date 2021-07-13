package HW;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {

        String regex1 = "ox ";

        String input = "fox box pox";
//        //Crabapple
//        //The quick brown fox jumps over the lazy ox.
//        //The Java language language
//        //Therefore
//        //fox box pox
        try {
            Pattern p = Pattern.compile(regex1);
            Matcher m = p.matcher(input);
            while (m.find())
                System.out.println("Found [" + m.group() + "] starting at "
                        + m.start() + " and ending at " + (m.end() - 1));
        } catch (PatternSyntaxException pse) {
            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
            System.err.println("Описание: " + pse.getDescription());
            System.err.println("Позиция: " + pse.getIndex());
            System.err.println("Неправильный шаблон: " + pse.getPattern());
        }

        String regex2 = "^((0[0-9]?|00[0-9]?|[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])" +
                       "\\.(0[0-9]?|00[0-9]?|[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])" +
                       "\\.(0[0-9]?|00[0-9]?|[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])" +
                       "\\.(0[0-9]?|1[0-6]?|))$";

        String input2 = "255.255.255.16";
        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(input2);
//        System.out.println(m.find())
//        System.out.println(m.find())

        if (m.find()) {
            System.out.println("###### true #######");
            System.out.println(m.group());
            System.out.println(m.groupCount());
            System.out.println(m.start());
            System.out.println(m.end()-1);
        } else {
            System.out.println("Nope...");
        }
    }
}