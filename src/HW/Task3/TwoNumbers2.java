package HW.Task3;

public class TwoNumbers2 {

    int a;
    int b;

    TwoNumbers2 (int a, int b) {
        this.a = b+1;
        this.b = a;
    }

    void numArray2 () {

        if (a!=b) {         // работает только, если a<b
            b--;            // если a>b, то выдаст ошибку переполнения стека
            numArray2();
            System.out.print(b++ + " ");
        }
    }
}
