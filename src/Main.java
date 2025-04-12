import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] one = new int[12];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        System.out.println(Arrays.toString(one));
        float[] two = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(two));
        int[] three = {3, 10, 16};
        System.out.println(Arrays.toString(three));

        for (int i = 0; i < one.length; i++) {
            if (i < one.length - 1) {
                System.out.print(one[i] + ", ");
            } else {
                System.out.print(one[i]);
            }
        }
        System.out.println();


        for (int i1 = 0; i1 < two.length; i1++) {
            if (i1 < two.length - 1) {
                System.out.print(two[i1] + ", ");
            } else {
                System.out.print(two[i1]);
            }
        }
        System.out.println();


        for (int i2 = 0; i2 < three.length; i2++) {
            if (i2 < three.length - 1) {
                System.out.print(three[i2] + ", ");
            } else {
                System.out.print(three[i2]);
            }
            for (int r = 0; r < three.length; r++) {
                System.out.print(three[r]);
                if (r < three.length - 1) {
                    System.out.print(", ");
                }


            }
        }
        System.out.println();
        for (int a = one.length - 1; a >= 0; a--) {
            if (a > 0) {
                System.out.print(one[a] + ", ");
            } else {
                System.out.print(one[a]);
            }
        }
        System.out.println();

        for (int b = two.length - 1; b >= 0; b--) {
            if (b > 0) {
                System.out.print(two[b] + ", ");
            } else {
                System.out.print(two[b]);
            }
        }
        System.out.println();

        for (
                int c = three.length - 1;
                c >= 0; c--) {
            if (c > 0) {
                System.out.print(three[c] + ", ");
            } else {
                System.out.print(three[c]);
            }
        }
        System.out.println();
        int[] box = {1, 2, 3};

        for (int d = 0; d < box.length; d++) {
            if (box[d] % 2 != 0) {
                box[d] += 1;
            }
        }

        System.out.println(Arrays.toString(box));

    }
}








