import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double m=sc.nextDouble();
        double a=sc.nextDouble();
        double maxStones=(Math.ceil(n/a))*(Math.ceil(m/a));
        System.out.println((long)maxStones);
    }
}
