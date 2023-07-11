package Recursion;

public class Basic {
    public static void main(String[] args) {
//       int ans=fact(5);
//        System.out.println(ans);
        System.out.println(sumdigit(1342));
    }
    static void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);

    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);

    }
    static int sumdigit(int n){
        if(n%10==n){
            return n;
        }
        return sumdigit(n/10)*(n%10);
    }
}
