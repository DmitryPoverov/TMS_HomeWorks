//Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока.
//Они по очереди вводят координаты клетки в которую хотят сделать ход.
//После каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
//Игра продолжается до победы одного из игроков или ничьи.

package HW_Tic_Tac_Toe;
import java.util.Scanner;
public class HW_TTT1 {
    public static void main(String[] args) {

        int userString;
        int userCoLimn;

        boolean gameCont = true;

        char[][] ticTac = new char[3][3];

        for (int i=0; i< ticTac.length; i++) {
            if (i==0) {
                System.out.println("\t0\t1\t2");
            }
            for (int j=0; j<ticTac[i].length; j++) {
                ticTac[i][j] = '.';
                if (j==0) {
                    System.out.print(i + "\t");
                }
                System.out.print(ticTac[i][j] + "\t");
            }
            System.out.println("\n");
        }

        Scanner sc = new Scanner(System.in);

        do {





            System.out.print("Enter a number of o string: ");
            userString = sc.nextInt();

            System.out.print("Enter a number of a column: ");
            userCoLimn = sc.nextInt();

            System.out.println(userString + "\t" + userCoLimn);

            for (int i=0; i< ticTac.length; i++) {
                for (int j=0; j<ticTac[i].length; j++) {



                }
                System.out.println("\n");
            }



        } while (gameCont);
    }
}
