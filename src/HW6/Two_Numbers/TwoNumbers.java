package HW6.Two_Numbers;

public class TwoNumbers {

    int[] arr;

    int[] numArray(int n1, int n2) {

        if (n1 == 0 && n2 == 1) {           // 0 - 1
            int [] array = {0, 1};
            return array;

        } else if (n1 == 1 && n2 == 0) {    // 1 - 0
            int [] array = {1, 0};
            return array;

        } else if (n1<n2) {                 // n1 - n2
            

        } else if (n1>n2) {                 // n2 - n1


        }

        return arr;
    }
}
