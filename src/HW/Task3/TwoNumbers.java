package HW.Task3;

public class TwoNumbers {

    int a;
    int b;
    int counter = 0;
    int[] array;

    TwoNumbers (int a, int b) {
        this.a = a;
        this.b = b;
        array = new int[(a<b)? b-a+1 : a-b+1];
    }

    void numArray() {

        if (a!=b) {
            array[counter] = a<b? a++: a--;
        } else {
            array[counter] = a;
        }

        System.out.print(array[counter++] + " ");

        if (counter != array.length) {
            numArray();
        }
    }
}