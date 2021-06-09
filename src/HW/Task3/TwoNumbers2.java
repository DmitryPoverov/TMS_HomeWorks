package HW.Task3;

public class TwoNumbers2 {

    private int a;
    private int b;
    private int temp;

    TwoNumbers2 (int a, int b) {

        if (a<b) {
            this.a = a;
            this.b = b+1;
            temp = this.b;
        } else if (a>b) {
            this.a = a;
            this.b = b-1;
            temp = this.b;
        } else if (a==b) {
            this.a = a;
            this.b = b;
        }
    }

    void numArray2 () {

        if (a<b) {
            if (a!=temp) {
                temp--;
                numArray2();
                System.out.print(temp++ + " ");
            }

        } else if (a>b) {
            if (a!=temp) {
                temp++;
                numArray2();
                System.out.print(temp-- + " ");
            }

        }  else if (a==b) {
            System.out.println(a);

        }
    }
}
