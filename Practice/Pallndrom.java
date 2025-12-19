package Practice;

public class  Pallndrom {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false ;

        }
        int n =x;
        int rewNum =0;
        while(n>0){
            int d =n%10;
            rewNum = rewNum*10+d ;
            n=n/10;

        }
        if (rewNum ==x){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
       Pallndrom s = new  Pallndrom();
        System.out.println(s.isPalindrome(121)); // true
        System.out.println(s.isPalindrome(-121)); // false
        System.out.println(s.isPalindrome(10)); // false
    }
}

