import java.util.Scanner;

/**
 * ALGO-150   k
 * 递归求取  c n
 * Created by Ericwyn on 2017/2/27.
 */
public class Main {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=method(a,b);
        System.out.print(c);
    }
    public static int method(int a,int b){
        if(a==0 || a==b){
            return 1;
        }else {
            return method(a,b-1)+method(a-1,b-1);
        }
    }
}