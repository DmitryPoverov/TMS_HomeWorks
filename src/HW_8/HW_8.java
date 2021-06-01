package HW_8;

public class HW_8 {

    public static void main(String[] args) {

        int space = 0;
        int include = 5;

        for (int i=include; i>0; i-=2) {

            for (int l=0; l<space+1; l++) {
                System.out.print(" ");
            }

            for (int k=include-space*2; k>0; k--) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }

        space--;
        include-=2;

        for (int i=0; i<=space; i++) {

            for (int l=space; l>0; l--) {
                System.out.print(" ");
            }

            for (int k=1; k<include+1; k++) {
                System.out.print("*");
            }
            System.out.println();
            include+=2;
            space--;
        }
    }
}