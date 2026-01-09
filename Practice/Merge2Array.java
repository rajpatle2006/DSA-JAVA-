package Practice;
class M {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        int[] c = new int[a.length + b.length];

        int i=0;
        for(int x : a) c[i++] = x;
        for(int x : b) c[i++] = x;

        for(int x : c)
            System.out.print(x+" ");
    }
}