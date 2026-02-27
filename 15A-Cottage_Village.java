import java.util.*;
import java.util.Map.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt(),t=sc.nextInt(),res=0;
        Map<Integer,Integer> plats=new TreeMap<>();
        for(int i=0;i<n;i++){
            plats.put(sc.nextInt(),sc.nextInt());
        }
        int running=0,runninga=0,houseNo=0,prev=0,preva=0;
        for(Entry<Integer,Integer> plat:plats.entrySet()){
            int currX=plat.getKey();
            int currA=plat.getValue();
            prev=running;
            preva=runninga;
            running=currX;
            runninga=currA;
            houseNo++;
            if(houseNo>=2){
                float gap=(running-((float)runninga/2))-(prev+((float)preva/2));
                if(gap>(float)t) res+=2;
                else if(gap==(float)t) res++;
            }
        }
        System.out.println(res+2);
    }
}
