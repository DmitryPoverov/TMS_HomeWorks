package HW9.Task1_2_3;

public class Running {

    public static void main(String[] args) {

// 1) Вырезать подстроку из строки начиная с первого вхождения символа (А) до,
// последнего вхождения сивола(B).

        String s = "iT'Ti Aц tsEsT STriNG, which waw WRIщTING WIHiw different seCes";

        Cutter newCut = new Cutter(s, 'a', 'd');

        System.out.println("1) Here is the cut string: '" + newCut.returnString() + "'");

// 2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
// позиции 0.

        newCut = new Cutter(s);
        System.out.println("2) Here is the changed string: " + newCut.change3to0());

// 3) В исходном файле находятся слова, каждое слово на новой стороке. После
// запуска программы должен создать файл, который будет содержать в себе
// только палиндромы.

/*         s = s.replace(' ', '\n');
         System.out.println(s);*/
        newCut = new Cutter(s);
        System.out.println("3) Here is palindromes: " + newCut.palindromeSearch());

    }
}
