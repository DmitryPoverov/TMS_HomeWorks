package HW.Task3;

public class TwoNumbers2 {

    private int a;
    private int b;
    private int temp;

    TwoNumbers2 (int a, int b) {

        this.a = a;

        if (a<b) {
            this.b = b+1;
            temp = this.b;

        } else if (a>b) {
            this.b = b-1;
            temp = this.b;

        } else if (a==b) {
            this.b = b;
        }
    }

    void numArray2 () {

        if (a!=temp) {
            temp = ((a < b)? --temp : ++temp);
            numArray2();
            System.out.print(((a < b) ? temp++ : temp--) + " ");
        } else if (a==b) {
            System.out.println(a);
        }
    }
}