12-import java.util.*;
public class countd{
    public static int countd(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return 1+ countd(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(countd(n));
    }
}

