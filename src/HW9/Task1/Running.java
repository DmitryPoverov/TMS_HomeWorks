package HW9.Task1;

public class Running {

    public static void main(String[] args) {

// 1) Вырезать подстроку из строки начиная с первого вхождения символа (А) до,
// последнего вхождения сивола(B).

        String test1 = "iT'S A tEsT STriNG, which was WRITING WITH different cases";

        char ch1 = 'Q';
        char ch2 = 'f';

        int a = test1.indexOf(ch1);
        int b = test1.lastIndexOf(ch2);

        if (a!=-1 && b!=-1) {
            System.out.println(test1.substring(a, b));
        } else if (a == -1) {
            System.out.println("There is no one the " + ch1 + " character here");
        } else if (b == -1) {
            System.out.println("There is no one the " + ch2 + " character here");
        }
    }
}