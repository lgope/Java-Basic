package JavaBeginner;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {6, 4, 9, 8, 2};

        System.out.println("Before Sorting :");
        for (int array: a){
            System.out.print(array+" ");
        }

        selectionSort(a, a.length);
        printArray(a, a.length);

    }

    public static void selectionSort(int[] a, int size){

        int mid_index = 0;

        for (int i = 0; i < size-1; i++){

            mid_index = i;

            for (int j = i + 1; j < size; j++){
                if(a[j] < a[mid_index])
                    mid_index = j;
            }

            if (mid_index != i){

                int k = a[i];
                a[i] = a[mid_index];
                a[mid_index] = k;

            }
        }
    }

    public static void  printArray(int[] a, int len){
        System.out.println("\nAfter Sorting :");
        for (int i = 0; i < len; i++)
            System.out.print(a[i]+" ");
    }
}
