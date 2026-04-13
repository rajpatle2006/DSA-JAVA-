package Practice.Dsa_advance;
public class Digitalcountrecrsion {
    static int count(int n){
        if (n==0) return 0;
        return 1+ count(n/10);
    }
    public static void main(String[] args) {
        int num=1236789;
        if(num==0)
            System.out.println(1);
        else
            System.out.println(count(num));
        }
    }
