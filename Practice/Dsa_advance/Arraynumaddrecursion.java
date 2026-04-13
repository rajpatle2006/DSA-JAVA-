package Practice.Dsa_advance;
public class Arraynumaddrecursion {
    static boolean search(int[] arr, int key,int i){
        if(i==arr.length) return false;
        if(arr[i]== key) return true;
        return search(arr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        int key=5;
        int i=0;
        System.out.println(search(arr, key, i));
    }
}
