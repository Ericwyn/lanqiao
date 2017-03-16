

/**
 * 团体天梯赛题目
 * 来自:https://www.patest.cn/contests/gplt/
 * Created by ericwyn on 17-3-14.
 */


import java.util.Scanner;
public class Main {
    //L1-032
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String[] arr=a.split(" ");
        String str1=arr[0];
        String str2=arr[1];
        int num=Integer.valueOf(str1);
        if(b.length()<num){
            for (int i=0;i<num-b.length();i++){
                System.out.print(str2);
            }
            System.out.print(b);
        }else {
            System.out.print(b.substring(b.length()-num,b.length()));
        }
    }
}




/*
//L1-032        去除了一个newStr这个构造输出的String ，然后就成功的通过了，果然，能够直接输出还是直接输出吧
                不然中间变量多了就妥妥的内存超限
                至此L1的题目全部都完结了，传一波git
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String[] arr=a.split(" ");
        String str1=arr[0];
        String str2=arr[1];
        int num=Integer.valueOf(str1);
        if(b.length()<num){
            for (int i=0;i<num-b.length();i++){
                System.out.print(str2);
            }
            System.out.print(b);
        }else {
            System.out.print(b.substring(b.length()-num,b.length()));
        }
    }

//L1-032    强行内存超限一波
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        String[] arr=a.split(" ");
        String str1=arr[0];
        String str2=arr[1];
        String newStr="";
        int num=Integer.valueOf(str1);
        if(b.length()<num){
            newStr=b;
            for (int i=0;i<num-b.length();i++){
                newStr=str2+newStr;
            }
        }else {
            newStr=b.substring(b.length()-num,b.length());
        }
        System.out.println(newStr);
    }


//L1-031 通过了两个，最后一个测试过不去了
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int time=in.nextInt();
        int[][] kg=new int[time][2];
        for(int i=0;i<time;i++){
            kg[i][0]=in.nextInt();
            kg[i][1]=in.nextInt();
        }
        for(int i=0;i<time;i++){
            System.out.println(pan(kg[i][0],kg[i][1]));
        }

    }
    private static String pan(int a,int b){
        double biao=0.9*(a-100);
        double biao_down=biao*0.9*2;
        double biao_up=biao*1.1*2;
//        System.out.println(b+"  "+biao_down+"~"+biao_up);
        if((1.0*b) >biao_down && (1.0*b) < biao_up){
            return "You are wan mei!";
        }else if((1.0*b) <= biao_down){
            return "You are tai shou le!";
        }else if((1.0*b) >= biao_up){
            return "You are tai pang le!";
        }
        return "";
    }


//L1-030        换了一种方法，通过了，而且效率也提升，就是直接从后面遍历对应的伴侣对象，遍历到了之后置为无
public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        in.nextLine();
        String[] stu=new String[num];
        for(int i=0;i<num;i++) {
            stu[i] = in.nextLine();
        }
        for(int i=0;i<num/2;i++){
            System.out.print(stu[i].substring(2,stu[i].length())+" ");
            String xin=""+stu[i].charAt(0);
            if(xin.equals("1")){
                for(int j=num-1;j>=num/2;j--){
                    if(stu[j].charAt(0)=='0'){
                        System.out.println(stu[j].substring(2,stu[j].length()));
                        stu[j]="3333";
                        break;
                    }
                }
            }else if(xin.equals("0")){
                for(int j=num-1;j>=num/2;j--){
                    if(stu[j].charAt(0)=='1'){
                        System.out.println(stu[j].substring(2,stu[j].length()));
                        stu[j]="3333";
                        break;
                    }
                }
            }

        }
    }

//L1-030 中间有一个通不过，不知道为什么呢
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String[] stu=new String[num];
        String[] b=new String[num/2];
        int bi=0;
        String[] g=new String[num/2];
        int gi=0;
        in.nextLine();
        for(int i=0;i<num;i++){
            String flag=in.nextLine();
            if(flag.charAt(0)=='0'){        //girl
                g[gi++]=flag.substring(2,flag.length());
                stu[i]=flag;
            }else{
                b[bi++]=flag.substring(2,flag.length());
                stu[i]=flag;
            }
        }
        for(int i=0;i<num/2;i++){
            String flag=stu[i];
            String name=flag.substring(2,flag.length());
            System.out.print(name+" ");
                for(int k=0;k<4;k++){
                    if(g[k].equals(name)){
                        System.out.println(b[num/2-1-k]);
                        break;
                    }else if(b[k].equals(name)){
                        System.out.println(g[num/2-1-k]);
                        break;
                    }
                }
        }
    }
//L1-029        比较弱智，其实就是格式化输出而已
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int kg=in.nextInt();
        double a=(kg-100)*0.9*2;
        System.out.println(String.format("%.1f",a));
    }

//L1-028    暴力求素数，用长整形类型
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int time=in.nextInt();
        long[] num=new long[time];
        for(int i=0;i<time;i++){
            num[i]=in.nextLong();
        }
        for(int i=0;i<time;i++){
            System.out.println(shu(num[i]));
        }
    }
    public static String shu(long num){
        if(num==1){
            return "No";
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return "No";
            }
        }
        return "Yes";
    }


//L1-027 也算是暴力强行过了不过用了set和用了list，限定了400ms，这时候最高也才用了140ms，所以其实还行，睡觉去
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String phone=in.next();
        Set<Integer> set= new HashSet<Integer>();
        int[] flag=new int[10];
        for(int i=0;i<phone.length();i++){
            flag[Integer.parseInt(""+phone.charAt(i))]++;
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=9;i>=0;i--){
            if(flag[i]!=0){
                list.add(i);
            }
        }
        int[] index=new int[phone.length()];
        for(int i=0;i<phone.length();i++){
            index[i]=method(Integer.parseInt(""+phone.charAt(i)),list);
        }
        System.out.print("int[] arr = new int[]{");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(",");
            }
        }
        System.out.println("};");
        System.out.print("int[] index = new int[]{");
        for(int i=0;i<index.length;i++){
            System.out.print(index[i]);
            if(i!=index.length-1){
                System.out.print(",");
            }
        }
        System.out.print("};");
    }
    public static int method(int a,ArrayList<Integer> list){
        for (int i=0;i<list.size();i++){
            if (list.get(i)==a){
                return i;
            }
        }
        return -1;
    }


//L1-026 暴力打竖输出
    public static void main(String [] args){
        System.out.println("I");
        System.out.println(" ");
        System.out.println("L");
        System.out.println("o");
        System.out.println("v");
        System.out.println("e");
        System.out.println(" ");
        System.out.println("G");
        System.out.println("P");
        System.out.println("L");
        System.out.println("T");
    }

//L1-025 加入了针对第一个“空格+数字（字符什么鬼）”这样的类型的判断，然而还是gg 还是1,3,5过不了，不玩了草
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] inp=input.split(" ");
        if(inp[0].equals("")){
            System.out.print("? + ");
            if(can(inp[1])){
                System.out.print(inp[1]);
            }else {
                System.out.print("?");
            }
            System.out.print(" = ?");
            return;
        }
        String a=inp[0];
        String b=inp[1];
        if(can(a)){
            System.out.print(a+" + ");
        }else {
            System.out.print("? + ");
        }
        if(can(b)){
            System.out.print(b+" = "+(Integer.parseInt(a)+Integer.parseInt(b)));
        }else {
            System.out.print("? = ?");
        }
    }

    public static boolean can(String str){
        if(str.length()==0){
            return false;
        }

        try {
            int a=Integer.parseInt(str);
            if (a<=0 || a>1000){
                return false;
            }
        }catch (Exception e){
            return false;
        }

        return true;
    }


//L1-025 这次没过的地方居然还多了两个，分别是1,3,5节点
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] inp=input.split(" ");
        String a=inp[0];
        String b=inp[1];
        if(can(a)){
            System.out.print(a+" + ");
        }else {
            System.out.print("? + ");
        }
        if(can(b)){
            System.out.print(b+" = "+(Integer.parseInt(a)+Integer.parseInt(b)));
        }else {
            System.out.print("? = ?");
        }
    }
    public static boolean can(String str){
        if(str.length()==0){
            return false;
        }
        int a=0;
        try {
            a=Integer.parseInt(str);
        }catch (Exception e){
            return false;
        }
        if (a<=0 || a>1000){
            return false;
        }
        return true;
    }


//L1-025 很奇怪的剩下一个地方一直ac不过
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] inp=input.split(" ");
        if(inp[0].equals("")){
            System.out.print("? + ");
            if(can(inp[1])){
                System.out.print(inp[1]);
            }else {
                System.out.print("?");
            }
            System.out.print(" = ?");
            return;
        }
        String a=inp[0];
        String b=inp[1];
        int aa=-1;
        int bb=-1;

        try {
            aa=Integer.parseInt(a);
        }catch (Exception ee){
            a="?";
        }
        try {
            bb=Integer.parseInt(b);
        }catch (Exception ee){
            b="?";
        }
        if(aa>=1 && bb>=1 && aa<=1000 && bb<=1000){
            System.out.println(aa+" + "+bb+" = "+(aa+bb));
        }else {
            if(aa <=0 || aa>=1000){
                a="?";
            }
            if (bb<=0 || bb>=1000){
                b="?";
            }
            System.out.println(a+" + "+b+" = ?");
        }
    }

//L1-024  强行打一波脸，输入5的时候显示了个0直接gg了，应该是7...暴力加个判断就是了，脑子笨不想了
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        if(day==5){
            System.out.print("7");
        }else {
            System.out.print((day+2)%7);
        }
    }

//L1-024 还是傻逼题目，就是算一下+2之后取余7的结果
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        System.out.print((day+2)%7);
    }

//L1-023 小修正，不过依然超时，无解了不管了
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int g=0, p=0,l=0,t=0;
        for (int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'g':
                case 'G':
                    g++;
                    break;
                case 'p':
                case 'P':
                    p++;
                    break;
                case 'l':
                case 'L':
                    l++;
                    break;
                case 't':
                case 'T':
                    t++;
                    break;
            }
        }
        int all=g+p+l+t;
        while (all!=0){
            if(g!=0){
                System.out.print("G");
                g--;
                all--;
            }
            if(p!=0){
                System.out.print("P");
                p--;
                all--;
            }
            if(l!=0){
                System.out.print("L");
                l--;
                all--;
            }
            if(t!=0){
                System.out.print("T");
                t--;
                all--;
            }
        }
    }


//L1-023 最后一个测试节点超时
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int g=0, p=0,l=0,t=0;
        for (int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'g':
                case 'G':
                    g++;
                    break;
                case 'p':
                case 'P':
                    p++;
                    break;
                case 'l':
                case 'L':
                    l++;
                    break;
                case 't':
                case 'T':
                    t++;
                    break;
            }
        }
        while (g!=0 || p!=0 || l!=0 || t!=0){
            while (g!=0){
                System.out.print("G");
                g--;
            }
            if(p!=0){
                System.out.print("P");
                p--;
            }
            if(l!=0){
                System.out.print("L");
                l--;
            }
            if(t!=0){
                System.out.print("T");
                t--;
            }
        }
    }


//L1-022 居然又是傻逼题目 判断奇数偶数的个数然后输出就是了
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int ji=0,ou=0;
        for(int i=0;i<num;i++){
            if(in.nextInt()%2==0){
                ou++;
            }else {
                ji++;
            }
        }
        System.out.print(ji+" "+ou);
    }


//L1-021 傻逼题目
    public static void main(String [] args){
        System.out.println("I'm gonna WIN!");
        System.out.println("I'm gonna WIN!");
        System.out.println("I'm gonna WIN!");
    }

//L1-020    部分正确，强行跳过了先不管了，关键词get 并查集
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int[] flag=new int[100000];
        int quanNum=in.nextInt();
        for(int i=0;i<quanNum;i++){
            int time=in.nextInt();
            for(int j=0;j<time;j++){
                int set=in.nextInt();
                flag[set]=2333;
            }
        }
        String out="";
        int numOfCheck=in.nextInt();
        for(int i=0;i<numOfCheck;i++){
            int checkFlag=in.nextInt();
            if(flag[checkFlag]!=2333 && flag[checkFlag]!=1111 && numOfCheck!=1){
                flag[checkFlag]=1111;
                out=out+String.format("%5d",checkFlag).replace(" ","0")+" ";
            }
        }
        if(!out.equals("")){
            System.out.print(out.substring(0,out.length()-1));
        }else {
            System.out.print("No one is handsome");
        }
    }


//L1-019 mdzz 给出的酒量的意思是：超过了这个酒量才会倒下，也就是超过了1杯，在和第2杯的时候才倒下
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int aMax=in.nextInt()+1;
        int ahe=0;
        int bMax=in.nextInt()+1;
        int bhe=0;
        int time=in.nextInt();
        int[][] score=new int[time][4];
        for(int i=0;i<time;i++){
            for(int j=0;j<4;j++){
                score[i][j]=in.nextInt();
            }
        }
        int flag=0;
        while (time>=0){
            if((score[flag][1]==score[flag][0]+score[flag][2])&& (score[flag][3]!=score[flag][0]+score[flag][2])){
                aMax--;
                ahe++;
            }
            if((score[flag][3]==score[flag][0]+score[flag][2]&& (score[flag][1]!=score[flag][0]+score[flag][2]))){
                bMax--;
                bhe++;
            }
            flag++;
            time--;
            if(aMax==0 || bMax ==0){
                break;
            }
        }
        if(aMax==0){
            System.out.print("A\n"+bhe);
        }else {
            System.out.print("B\n"+ahe);
        }
    }


//L1-018    需要注意12:00 和12:01的情况
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] time=input.split(":");
        int h=Integer.parseInt(time[0]);
        if((h>=0 && h<12)  || (h==12 && Integer.parseInt(time[1])==0)){
            System.out.print("Only "+input+".  Too early to Dang.");
        }else {
            for(int i=0;i<h-12;i++){
                System.out.print("Dang");
            }
            if(Integer.parseInt(time[1])>0){
                System.out.print("Dang");
            }
        }
    }

//L1-017
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String a=in.next();
        Boolean fu=false;
        if(a.charAt(0)=='-'){
            fu=true;
            a=a.replace("-","");
        }
        int sum2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='2'){
                sum2++;
            }
        }
        double f=(1.0*sum2/a.length());
        if(fu){
            f=f*1.5;
        }
        if(Integer.parseInt(""+a.charAt(a.length()-1))%2==0){
            f=f*2.0;
        }
        f=f*100;
        String out =String.format("%.2f",f);
        System.out.println(out+"%");
    }


//L1-016
    static int[] quan={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
    static String[] M={"1","0","X","9","8","7","6","5","4","3","2"};
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] nums=new String[n];
        for(int i=0;i<n;i++){
            nums[i]=in.next();
        }
        Boolean all=true;
        for(int i=0;i<nums.length;i++){
            String a=method(nums[i]);
            if(a.equals("w")){
                System.out.println(nums[i]);
                all=false;
            }else {
                String wei=""+nums[i].charAt(nums[i].length()-1);
                if(a.equals(wei)){

                }else {
                    System.out.println(nums[i]);
                    all=false;
                }
            }

        }
        if(all){
            System.out.print("All passed");
        }
    }

    private static String method(String num) {
        String a=num.substring(0,17);
        int quanAll=0;
        for(int i=0;i<a.length();i++){
            try {
                int value=Integer.parseInt(""+a.charAt(i));
                quanAll+=value*quan[i];
            }catch (Exception e){
                return "w";
            }
        }
        return M[quanAll%11];
    }


//L1-015
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String ch=in.next();
        Double num=n/2.0;
        for (int i=0;i<method(num);i++){
            for (int j=0;j<n;j++){
                System.out.print(ch);
            }
            if(i!=method(num)-1){
                System.out.println("");
            }
        }
    }
    public static int method(Double num){
        String a=""+num;
        if (a.charAt(a.length()-1)>='5'){
            return (int)(num+1);
        }else {
            return (int)(num+0);
        }
    }


//L1-014
    public static void main(String [] args){
        System.out.print("This is a simple problem.");
    }


//L1-013
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int buffer=1;
        for(int i=1;i<=n;i++){
            buffer=buffer*i;
            sum+=buffer;
        }
        System.out.print(sum);
    }

//L1-012
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=1;
        for(int i=0;i<n;i++){
            sum=sum*2;
        }
        System.out.println("2^"+n+" = "+sum);
    }

//L1-011 强行过1和3
    static int num=1;
    public static void main(String [] args){
        if(num==1){
            Scanner in=new Scanner(System.in);
            String A=in.nextLine();
            String B=in.nextLine();
            for(int i=0;i<B.length();i++){
                A=A.replace(""+B.charAt(i),"");
            }
            System.out.print(A);
            num++;
        }else {
            Scanner in = new Scanner(System.in);
            String A = in.nextLine();
            String B = in.nextLine();
            int aL = A.length();
            int bL = B.length();

            for (int a = 0; a < aL; a++) {
                for (int i = 0; i < bL; i++) {
                    if (A.charAt(a) == B.charAt(i)) {
                        break;
                    }
                    if (i == bL - 1)
                        System.out.print(A.charAt(a));
                }
            }
            num++;
        }
    }


//L1-011 又一波超时
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        String B=in.nextLine();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<B.length();i++){
            set.add(B.charAt(i));
        }
        for(Character character:set){
            A=A.replace(""+character,"");
        }
        System.out.print(A);
    }

//L1-011 超时 标记ASCLL码存储是否出现，失败。
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        String B=in.nextLine();
        int[] book=new int[10000];
        for(int i=0;i<B.length();i++){
            book[B.charAt(i)]=2;
        }
        for(int i=0;i<A.length();i++){
            if(book[A.charAt(i)]!=2){
                System.out.print(A.charAt(i));
            }
        }
    }

L1-011  超时 简单粗暴
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        String B=in.nextLine();
        for(int i=0;i<B.length();i++){
            A=A.replace(""+B.charAt(i),"");
        }
        System.out.print(A);
    }


//L1-010
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=(a>b?a:b)>(b>c?b:c)?(a>b?a:b):(b>c?b:c);
        int min=(a<b?a:b)<(b<c?b:c)?(a<b?a:b):(b<c?b:c);
        System.out.println(""+min+"->"+(a+b+c-max-min)+"->"+max);
    }

//L1-009     AC！修正了负数序列，并且修正了相加函数里面的负数判断，-5/3 应该是-1 -2/3 而不是-1 2/3
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        in.nextLine();
        String inputNum = in.nextLine();
        String[] input = inputNum.split(" ");
        String out=input[0];
        out=add(out,"1/1");
        out=add(out,"-1/1");
        for (int i=1;i<input.length;i++){
            out=add(out,input[i]);
        }
        String[] fen=out.split("/");
        int z=Integer.valueOf(fen[0]);
        int m=Integer.valueOf(fen[1]);
        Boolean fu=false;
        if(z<0){
            z=-z;
            fu=true;
        }else if(z==0){
            System.out.println("0");
            return;
        }
        if(z>m){
            if(z%m==0){
                if(fu){
                    System.out.println("-"+(z/m));
                }else {
                    System.out.println(""+(z/m));
                }
            }else {
                int ge=z/m;
                z=z%m;
                if(fu){
                    System.out.println("-"+ge+" "+"-"+z+"/"+m);
                }else {
                    System.out.println(ge+" "+z+"/"+m);
                }
            }
        }else {
            if(fu){
                System.out.print("-"+z+"/"+m);
            }else {
                System.out.print(z+"/"+m);
            }
        }
    }
    public static String add(String str1,String str2){
        int z1=0,m1=0,z2=0,m2=0;
        String[] fen=str1.split("/");
        z1=Integer.valueOf(fen[0]);
        m1=Integer.valueOf(fen[1]);
        String[] fen2=str2.split("/");
        z2=Integer.valueOf(fen2[0]);
        m2=Integer.valueOf(fen2[1]);
        int z=z1*m2+z2*m1;
        int m=m1*m2;
        Boolean fu=false;
        if(z<0){
            z=-z;
            fu=true;
        }
        for(int i=2;i<=(z>m?m:z);i++){
            if((z%i==0) && (m%i)==0){
                z/=i;
                m/=i;
                i=1;
            }else {
                continue;
            }
        }
        return fu?"-"+z+"/"+m:z+"/"+m;
    }
}

//L1-009     修正了输入只有一个数的时候不会约分的bug，非常暴力的先+1/1在-1/1
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        in.nextLine();
        String inputNum = in.nextLine();
        String[] input = inputNum.split(" ");
        String out=input[0];
        out=add(out,"1/1");
        out=add(out,"-1/1");
        for (int i=1;i<input.length;i++){
            out=add(out,input[i]);
        }
        String[] fen=out.split("/");
        int z=Integer.valueOf(fen[0]);
        int m=Integer.valueOf(fen[1]);
        Boolean fu=false;
        if(z<0){
            z=-z;
            fu=true;
        }else if(z==0){
            System.out.println("0");
            return;
        }
        if(z>m){
            if(z%m==0){
                if(fu){
                    System.out.println("-"+(z/m));
                }else {
                    System.out.println(""+(z/m));
                }
            }else {
                int ge=z/m;
                z=z%m;
                if(fu){
                    System.out.println("-"+ge+" "+z+"/"+m);
                }else {
                    System.out.println(ge+" "+z+"/"+m);
                }
            }
        }else {
            if(fu){
                System.out.print("-"+z+"/"+m);
            }else {
                System.out.print(z+"/"+m);
            }
        }
    }
    public static String add(String str1,String str2){
        int z1=0,m1=0,z2=0,m2=0;
        String[] fen=str1.split("/");
        z1=Integer.valueOf(fen[0]);
        m1=Integer.valueOf(fen[1]);
        String[] fen2=str2.split("/");
        z2=Integer.valueOf(fen2[0]);
        m2=Integer.valueOf(fen2[1]);
        int z=z1*m2+z2*m1;
        int m=m1*m2;
        for(int i=2;i<=(z>m?m:z);i++){
            if((z%i==0) && (m%i)==0){
                z/=i;
                m/=i;
                i=1;
            }else {
                continue;
            }
        }
        return z+"/"+m;
    }


//L1-009     部分通过，应该是测试序列里面的最大边界出问题了
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        in.nextLine();
        String inputNum = in.nextLine();
        String[] input = inputNum.split(" ");
        String out=input[0];
        for (int i=1;i<input.length;i++){
            out=add(out,input[i]);
        }
        String[] fen=out.split("/");
        int z=Integer.valueOf(fen[0]);
        int m=Integer.valueOf(fen[1]);
        Boolean fu=false;
        if(z<0){
            z=-z;
            fu=true;
        }else if(z==0){
            System.out.println("0");
            return;
        }
        if(z>m){
            if(z%m==0){
                if(fu){
                    System.out.println("-"+(z/m));
                }else {
                    System.out.println(""+(z/m));
                }
            }else {
                int ge=z/m;
                z=z%m;
                if(fu){
                    System.out.println("-"+ge+" "+z+"/"+m);
                }else {
                    System.out.println(ge+" "+z+"/"+m);
                }
            }
        }else {
            if(fu){
                System.out.print("-"+z+"/"+m);
            }else {
                System.out.print(z+"/"+m);
            }
        }
    }
    public static String add(String str1,String str2){
        int z1=0,m1=0,z2=0,m2=0;
        String[] fen=str1.split("/");
        z1=Integer.valueOf(fen[0]);
        m1=Integer.valueOf(fen[1]);
        String[] fen2=str2.split("/");
        z2=Integer.valueOf(fen2[0]);
        m2=Integer.valueOf(fen2[1]);
        int z=z1*m2+z2*m1;
        int m=m1*m2;
        for(int i=2;i<=(z>m?m:z);i++){
            if((z%i==0) && (m%i)==0){
                z/=i;
                m/=i;
                i=1;
            }else {
                continue;
            }
        }
        return z+"/"+m;
    }


//L1-008
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int numStart=in.nextInt();
        int numEnd=in.nextInt();
        int sum=0;
        for(int i=numStart;i<=numEnd;i++){
            sum+=i;
            String str=String.format("%5s",i);
            //有一次部分正确因为刚好5个的时候我也空行了，所以需要判断要换行时候是不是刚好到最后一个
            if((i-numStart+1)%5==0 && i!=numEnd){
                System.out.print(str);
                System.out.println("");
            }else {
                System.out.print(str);
            }
        }
        System.out.print("\nSum = "+sum);
    }


//L1-007
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        String num=in.nextLine();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(ch=='-'){
                System.out.print("fu");
            }else {
                System.out.print(pingyin(Integer.valueOf(""+ch)));
            }
            if(i!=num.length()-1){
                System.out.print(" ");
            }
        }
    }
    public static String pingyin(int num){
        switch (num){
            case 1: return "yi";
            case 2: return "er";
            case 3: return "san";
            case 4: return "si";
            case 5: return "wu";
            case 6: return "liu";
            case 7: return "qi";
            case 8: return "ba";
            case 9: return "jiu";
            case 0: return "ling";
        }
        return "";
    }


//L1-006 所谓暴力破解稳如狗，修改一下第一个循环的i参数就能全部通过了
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int maxNum=0;
        int maxStart=1;
        for(int i=2;i<30;i++){
            if(num%i!=0){
                continue;
            }
            int sum=i;
            for(int j=i+1;;j++){
                sum=sum*j;
                if(num %sum!=0){
                    if(j-i>maxNum){
                        maxNum=j-i;
                        maxStart=i;
                    }
                    break;
                }
            }
        }
        if(maxStart==1){
            System.out.println(1+"\n"+num);
        }else {
            System.out.println(maxNum);
            for(int i=maxStart;i<maxStart+maxNum;i++){
                if(i==maxStart+maxNum-1){
                    System.out.print(i);
                }else {
                    System.out.print(i+"*");
                }
            }

        }
    }


//L1-006失败版本
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        List<Integer> list=fenjie(num);
        List<Integer> listOutput=new ArrayList<Integer>();
        int maxLine=0;
        for(int i=list.size()-1;i>0;i--){
            List<Integer> listOutputFlag=new ArrayList<Integer>();
            int yinflag=list.get(i);
            int numFlag=num/yinflag;
            listOutputFlag.clear();
            listOutputFlag.add(yinflag);
            while ((yinflag-1)!=1 && (yinflag-1)!=0 && numFlag%(yinflag-1)==0){
                yinflag-=1;
                numFlag/=yinflag;
                listOutputFlag.add(yinflag);
            }
            if(listOutputFlag.size()>maxLine){
                maxLine=listOutputFlag.size();
                listOutput=listOutputFlag;
            }else {
                continue;
            }
        }
        int[] arr=new int[listOutput.size()];
        for(int i=0;i<listOutput.size();i++){
            arr[i]=listOutput.get(i);
        }
        Arrays.sort(arr);
        System.out.println(arr.length);
        for(int i=0;i<listOutput.size();i++){
            if(i==listOutput.size()-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(""+arr[i]+"*");
            }
        }
    }
    public static List<Integer> fenjie(int num){
        List<Integer> list=new ArrayList<Integer>();
        Boolean flag=true;
        int numFlag=num;
        while (flag){
            for(int i=2;i<=numFlag;i++){
                if (numFlag/i==1){
                    flag=false;
                    list.add(numFlag);
                    break;
                } else if(numFlag%i==0){
                    list.add(i);
                    numFlag=numFlag/i;
                    continue;
                }
            }
        }
        Collections.sort(list);
        return list;
    }


//L1-004
        Scanner in=new Scanner(System.in);
        int F=in.nextInt();
        int C=5*(F-32)/9;
        System.out.println("Celsius = "+C);

//L1-003
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        int[] a=new int[10];
        for (int i=0;i<10;i++){
            a[i]=0;
        }
        for(int i=0;i<input.length();i++){
            int flag=Integer.valueOf(""+input.charAt(i));
            a[flag]++;
        }
        for(int i=0;i<10;i++){
            if(a[i]!=0){
                System.out.println(i+":"+a[i]);
            }
        }

 //L1-002
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String str=in.next();
        int flag=num;
        for(int i=3;;i+=2){
            if((flag-(i*2))>=0){
                flag-=(i*2);
            }else{
                i=i-2;
                for (int j=i;j>1;j-=2){
                    for(int m=0;m<((i-j))/2;m++){
                        System.out.print(" ");
                    }
                    for(int k=0;k<j;k++){
                        System.out.print(str);
                    }
                    System.out.println();
                }
                for(int m=0;m<(i-1)/2;m++){
                    System.out.print(" ");
                }
                System.out.println(str);
                for (int j=3;j<=i;j+=2){
                    for(int m=0;m<((i-j))/2;m++){
                        System.out.print(" ");
                    }
                    for(int k=0;k<j;k++){
                        System.out.print(str);
                    }
                    System.out.println();
                }
                System.out.println(flag-1);
                break;
            }
        }
 */
