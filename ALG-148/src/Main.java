import java.util.Scanner;

/**
 * 求最小公倍数
 * 先用辗转相除法求出最大公约c，然后a/c * b/c * c就是答案了。
 * Created by Ericwyn on 2017/2/27.
 */
public class Main {
    //求最小公约数
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=lmc(a,b);
        System.out.print(c);
    }
    public static int lmc(int a,int b){
        int aTemp=a;
        int bTemp=b;
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a%b==0){
            System.out.println("111"+a);
            return a;
        }
        int yushu=1;
        while (a%b != 0){
            yushu=a%b;
            a=b;
            b=yushu;
        }
        return (aTemp/yushu)*(bTemp/yushu)*yushu;
    }
}
