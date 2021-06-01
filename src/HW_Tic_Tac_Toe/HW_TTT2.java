package HW_Tic_Tac_Toe;

import java.util.Scanner;

public class HW_TTT2 {

    public static void main(String[] args) {

        int userString;
        int userColumn;
        int gameOver = 0;
        boolean gameCont = true;
        boolean whomMotion = true;
        Scanner sc = new Scanner(System.in);
        char[][] arrTTT =   {{'-', '-', '-'},
                             {'-', '-', '-'},
                             {'-', '-', '-'}};

        for (char[] i: arrTTT) {
            for (char j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        do {
            System.out.print("\nEnter a line number (from 1 to 3): ");
            userString = sc.nextInt()-1;
            System.out.print("Enter a column number (from 1 to 3): ");
            userColumn = sc.nextInt()-1;

            for (int i=0; i<arrTTT.length; i++) {
                for (int j=0; j<arrTTT[i].length; j++) {
                    if (i==userString && j==userColumn) {
                        if (whomMotion) {
                            arrTTT[userString][userColumn] = 'X';
                        } else {
                            arrTTT[userString][userColumn] = 'O';
                        }
                    }
                    System.out.print(arrTTT[i][j] + " ");
                }
                System.out.println();
            }

            if (whomMotion) {
                if ((arrTTT[0][0]=='X' && arrTTT[0][1]=='X' && arrTTT[0][2]=='X') ||
                        (arrTTT[1][0]=='X' && arrTTT[1][1]=='X' && arrTTT[1][2]=='X') ||
                        (arrTTT[2][0]=='X' && arrTTT[2][1]=='X' && arrTTT[2][2]=='X') ||
                        (arrTTT[0][0]=='X' && arrTTT[1][1]=='X' && arrTTT[2][2]=='X') ||
                        (arrTTT[0][2]=='X' && arrTTT[1][1]=='X' && arrTTT[2][0]=='X') ||
                        (arrTTT[0][0]=='X' && arrTTT[1][0]=='X' && arrTTT[2][0]=='X') ||
                        (arrTTT[0][1]=='X' && arrTTT[1][1]=='X' && arrTTT[2][1]=='X') ||
                        (arrTTT[0][2]=='X' && arrTTT[1][2]=='X' && arrTTT[2][2]=='X')) {
                    System.out.println("X is winner!");
                    gameCont = false;
                }
            } else if ((arrTTT[0][0]=='O' && arrTTT[0][1]=='O' && arrTTT[0][2]=='O') ||
                    (arrTTT[1][0]=='O' && arrTTT[1][1]=='O' && arrTTT[1][2]=='O') ||
                    (arrTTT[2][0]=='O' && arrTTT[2][1]=='O' && arrTTT[2][2]=='O') ||
                    (arrTTT[0][0]=='O' && arrTTT[1][1]=='O' && arrTTT[2][2]=='O') ||
                    (arrTTT[0][2]=='O' && arrTTT[1][1]=='O' && arrTTT[2][0]=='O') ||
                    (arrTTT[0][0]=='O' && arrTTT[1][0]=='O' && arrTTT[2][0]=='O') ||
                    (arrTTT[0][1]=='O' && arrTTT[1][1]=='O' && arrTTT[2][1]=='O') ||
                    (arrTTT[0][2]=='O' && arrTTT[1][2]=='O' && arrTTT[2][2]=='O')) {
                System.out.println("O is winner!");
                gameCont = false;
            }
            whomMotion = !whomMotion;
            gameOver++;
            if (gameOver==9) {
                System.out.println("Game Over!");
                break;
            }
            System.out.println("gameOver = " + gameOver);
        } while (gameCont);
    }
}