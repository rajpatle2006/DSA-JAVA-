
package Practice;class G {
    public static void main(String[] args) {
        int[] a = {2,5,8,7};
        int c = 0;

        for(int i=0;i<a.length;i++)
            if(a[i] % 2 == 0) c++;

        System.out.print(c);
    }
}