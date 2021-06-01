package HW2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int AB, BC, CD;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AB = br.read();

        br = new BufferedReader(new InputStreamReader(System.in));
        BC = br.read();

        br = new BufferedReader(new InputStreamReader(System.in));
        CD = br.read();

        if ((AB+BC>CD) & (BC+CD>AB) & (AB+CD>BC)) {
            System.out.println("The such triangle exists" + AB + " " + BC + " " + CD);
        }
        else {
            System.out.println("The such triangle doesn't exist");
        }
    }
}