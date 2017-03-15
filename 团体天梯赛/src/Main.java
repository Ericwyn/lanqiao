/**
 * 团体天梯赛题目
 * 来自:https://www.patest.cn/contests/gplt/
 * Created by ericwyn on 17-3-14.
 */

import java.util.Scanner;
public class Main {
    //L1-019
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int aMax=in.nextInt();
        int bMax=in.nextInt();
        int time=in.nextInt();
        int[][] score=new int[time][4];
        for(int i=0;i<time;i++){
            for(int j=0;j<4;j++){
                score[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<time;i++){
            for(int j=0;j<4;j++){
                System.out.println(score[i][j]);
            }
        }
    }
}




/*
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
