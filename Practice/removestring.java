package Practice;


public class removestring {
    public static void main(String[] args) {
        String str1= "aabbccdeeff";
        String result = "";
        result += str1.charAt(0);
        for( int i=1;i<str1.length();i++){
            if(str1.charAt(i) != str1.charAt(i-1))
            {
                result += str1.charAt(i);
            }
        }
        System.out.println(result);

    }
}
