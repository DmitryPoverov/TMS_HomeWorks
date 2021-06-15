package HW9.Task1_2;

public class Running {

    public static void main(String[] args) {

// 1) Вырезать подстроку из строки начиная с первого вхождения символа (А) до,
// последнего вхождения сивола(B).

        String s = "iT'S A tEsT STriNG, which was WRITING WITH different cases";

        Cutter newCut = new Cutter(s, 'a', 'd');

        System.out.println(newCut.returnString());
    }
}
