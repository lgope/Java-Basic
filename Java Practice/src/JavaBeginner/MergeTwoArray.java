package JavaBeginner;

public class MergeTwoArray {

    public static void main(String[] args) {

        int[] a = {5, 7, 9, 11};
        int[] b = {4, 6, 8, 10};

        int[] c = new int[a.length + b.length];

        mmergeArrays(a, b, a.length, b.length, c);

        System.out.println("After merging two array : ");

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void mmergeArrays(int[] a, int[] b, int len1, int len2, int... c) {

        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {

            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while(i < len1)
            c[k++] = a[i++];

        while (j < len2)
            c[k++] = b[j++];
    }
}
