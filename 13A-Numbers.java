import java.util.*;

public class Main{
    public static void main(String[] args){
        int n=new Scanner(System.in).nextInt();
        int denom=n-2,num=0;
        for(int i=2;i<n;i++){
            int temp=0,t=n;
            while(t>0){
                int rem=t%i;
                temp+=rem;
                t/=i;
            }
            num+=temp;
        }
        int divisor=gcd(num,denom);
        System.out.println((num/divisor)+"/"+(denom/divisor));
    }
    public static int gcd(int a,int b){
        if(a%b==0)return b;
        else return gcd(b,a%b);
    }
}
