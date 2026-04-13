package Practice.Dsa_advance;
public class SumDigitrecursion{
    static int sum(int n){
    if (n==0) return 0;
    return (n%10) + sum(n/10);
 }
public static void main(String[] args) {
    int num =123456;
    System.out.println(sum(num));
 }
}