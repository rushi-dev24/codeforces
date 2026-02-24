import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt(),w=sc.nextInt();
        int max=Math.max(y,w);
        int remaining=6-max+1;
        
        int divisor=gcd(6,remaining);
        System.out.println((remaining/divisor)+"/"+(6/divisor));
    }
    
    public static int gcd(int x,int y){
        if(x%y == 0) return y;
        else return gcd(y,x%y);
    }
}
