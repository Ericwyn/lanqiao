import java.util.Scanner;
import java.util.Stack;

/**
 *问题描述
 *　　输入一个只包含加减乖除和括号的合法表达式，求表达式的值。其中除表示整除。
 *输入格式
 *　　输入一行，包含一个表达式。
 *输出格式
 *　　输出这个表达式的值。
 *样例输入
 *    1-2+3*(4-5)
 *样例输出
 *    -4
 *数据规模和约定
 *　　表达式长度不超过100，表达式运算合法且运算过程都在int内进行。
 * Created by Ericwyn on 2017/2/26.
 */
public class Main {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        Stack<String> stack=new Stack<String>();
        Stack<String> result=new Stack<String>();
        String lastFlag="";
        for (int i=0;i<a.length();i++){
            String ai=""+a.charAt(i);
            if(ai.equals("+") || ai.equals("-") || ai.equals("*") || ai.equals("/")){
                if(stack.size()!=0){
                    lastFlag=stack.peek();
                }
                stack.push(""+ai);
                if(ai.equals("(")) {
                    stack.push(ai);
                    break;
                }else if((lastFlag.equals("+") || lastFlag.equals("-")) && (ai.equals("*") || ai.equals("/"))){
                    while (!(stack.peek().equals("*") || stack.peek().equals("/") || stack.peek().equals("("))){
                        result.push(stack.pop());
                    }
                }
            }else {
                result.push(""+ai);
            }
        }
        System.out.println(stack);
    }
}
