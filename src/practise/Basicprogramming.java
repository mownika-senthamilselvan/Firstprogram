package practise;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Basicprogramming {
    public static void main(String[] args) {
        int a=496,b=10;
        String str1="raca",
                str2= " care";
        //Scanner sc=new Scanner(System.in);
        //a=sc.nextInt();
        fabonacci(a);
      //  int result =gcd(a,b);
       // System.out.println(result);
        factors(a);
        anagram(str1,str2);
    }
    static void palindrom(String s1,String s2)
    {
        char[] ch= s1.toCharArray();
        char[] ch1=s2.toCharArray();
        for(int i=0; ch[i]!='\0';i++)
        {
            
        }
    }
    static void anagram(String s,String s1)
    {
        int count=0;
        char[] ch=s.toCharArray();
        char[] ch1=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch1.length;j++){
                if(ch[i]==ch1[j])
                {
                    count++;
                }
            }
           // System.out.println(count);
        }
        if(count==ch.length)
            System.out.println("Anagram");
        else
            System.out.println("Not a anagram");


    }
    static void factors(int n1){
        int i=1,sum=0,temp;
        temp=n1;
            while(i<n1)
            {
                if(n1%i==0)
                {
                  sum+=i;
                }
                i++;
            }
           // if(temp==sum)
               // System.out.println("Perfect number");
           // else
               // System.out.println("Not a perfect number");

    }

   static void  fabonacci(int a){
        int first=1,next=0,res=0;
      //  System.out.println(first);
        for(int i=1;i<a;i++)
        {
            res=first+next;
            //System.out.println(res);
            next=first;
            first=res;
        }
    }
  /*  static int gcd(int n1,int n2)
    {
        if(n2==0)
            return n1;
        else{
            return gcd(n2,n1%n2);
        }
    }*/

}
