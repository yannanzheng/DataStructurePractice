package sort;

/**
 * Created by jephy on 2018/3/19.
 */
public class TestSort {
    public static void selectSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args){
        int a[] = {5, 4, 9, 8, 7, 6, 0, 1, 3, 2};
        selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
