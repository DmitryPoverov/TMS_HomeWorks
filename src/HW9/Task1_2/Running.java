package HW9.Task1_2;

public class Running {

    public static void main(String[] args) {

// 1) Вырезать подстроку из строки начиная с первого вхождения символа (А) до,
// последнего вхождения сивола(B).

        String s = "iT's A tsEsT STriNG, which waw WRITING WIHiw different seCes";

        Cutter newCut = new Cutter(s, 'a', 'd');

        System.out.println("Here is the cut string: '" + newCut.returnString() + "'");

// 2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
// позиции 0.

        newCut = new Cutter(s);
        System.out.println(newCut.change3to0());

// 3) В исходном файле находятся слова, каждое слово на новой стороке. После
// запуска программы должен создать файл, который будет содержать в себе
// только палиндромы.

/*         s = s.replace(' ', '\n');
         System.out.println(s);*/
        newCut = new Cutter(s);
        System.out.println(newCut.palindromeSearch());

    }
}
