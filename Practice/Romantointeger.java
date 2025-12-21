package Practice;

public class Romantointeger {
    public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
 public static void main(String[] args) {
        Romantointeger obj = new Romantointeger();

        System.out.println(obj.romanToInt("III"));     // 3
        System.out.println(obj.romanToInt("IV"));      // 4
        System.out.println(obj.romanToInt("IX"));      // 9
        System.out.println(obj.romanToInt("MCMXCIV")); // 1994
    }
}
