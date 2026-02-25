import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int p3=sc.nextInt();
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        List<int[]> al=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int[] temp = new int[2];
            temp[0]=sc.nextInt();
            temp[1]=sc.nextInt();
            al.add(temp);
        }
        
        int normal=0,saver=0,sleep=0;
        int start=al.get(0)[0],end=al.get(n-1)[1];
        for(int i=0;i<n;i++){
            int gap=0;
            if(i!=0){
                gap=al.get(i)[0]-al.get(i-1)[1];
            }
            int tempDiff=al.get(i)[1]-al.get(i)[0];
            normal+=tempDiff*p1;
            if(gap>0){
                if(gap<=t1) {
                    normal+=gap*p1;
                    gap=0;
                }
                else{
                    normal+=t1*p1;
                    gap-=t1;
                }
            }
            if(gap>0){
                if(gap<=t2){
                    saver+=gap*p2;
                    gap=0;
                }
                else{
                    saver+=t2*p2;
                    gap-=t2;
                }
            }
            if(gap>0) sleep+=gap*p3;
        }
        System.out.println(normal+saver+sleep);
    }
}
