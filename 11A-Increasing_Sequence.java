import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long d=sc.nextLong();
        long[] seq=new long[(int)n];
        for(int i=0;i<n;i++){
            seq[i]=sc.nextLong();
        }
        Long count=0L,temp;
        for(int i=1;i<n;i++){
            if(seq[i]<=seq[i-1]){
                temp=0L;
                temp+=((seq[i-1]-seq[i])/d)+1;
                seq[i]+=temp*d;
                count+=temp;
            }
        }
        System.out.println(count);
    }
}
