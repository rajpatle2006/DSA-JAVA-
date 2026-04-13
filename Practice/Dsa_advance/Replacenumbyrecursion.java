  package Practice.Dsa_advance;
public class Replacenumbyrecursion {
    static void replace(int[] arr, int i) {
        if (i == arr.length) return;
        if (arr[i] == 2)arr[i] = 3;
        replace(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        replace(arr, 0);
        // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}