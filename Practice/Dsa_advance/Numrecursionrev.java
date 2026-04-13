package Practice.Dsa_advance;

public class Numrecursionrev {
    static int rev=0;
        static int reverse(int x){
        if(x ==0)return rev;
        rev =rev *10 + x%10;
        return reverse(x/10);
        
    }
  public static void main(String[]args)
 {  
    int x= 12345;
   System.out.println(reverse(x));
 }
}
