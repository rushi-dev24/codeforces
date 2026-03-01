import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        List<Integer> primes=new ArrayList<>();
        for(int i=2;i<=997;i++){
            int fac=0;
            for(int j=2;j<i;j++){
                if(i%j == 0) {
                    fac++;
                    break;
                }
            }
            if(fac == 0){
                primes.add(i);
            }
        }
        
        int i=0,j=i+1;
        while(j<primes.size()){
            if(k==0){
                System.out.println("YES");
                return;
            }
            int temp=primes.get(i)+primes.get(j)+1;
            if(isPrime(temp) && temp<=n && temp>=2) k--;
            i++;
            j++;
        }
        System.out.println("NO");
    }
    public static boolean isPrime(int n){
        int fac=0;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                fac++;
                break;
            }
        }
        return fac==0;
    }
}
