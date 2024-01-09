package algorithm;
import java.util.*;

public class JunPack {
    static int num;
    public static boolean primeNumber(String n){
        int i;
        int a = Integer.parseInt(n);
        for(i = 2; i<a; i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
        
    }

    public static boolean reverseCheck(String n) {
        StringBuffer sb = new StringBuffer(n);
        if (n.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
    public static int recursive(int n){
        if (primeNumber(Integer.toString(n)) && reverseCheck(Integer.toString(n))){
            return n;
        } else {
            return recursive(n+1); 
        }
        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        num = Integer.parseInt(N);
        System.out.println(recursive(num));
        
    }
}
