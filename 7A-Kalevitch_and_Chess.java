import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<char[]> require=new ArrayList<>();
        for(int i=0;i<8;i++){
            require.add(sc.nextLine().toCharArray());
        }
        
        int res=0,counted=0;
        for(char[] hor:require){
            int tempCount=0;
            for(int i=0;i<8;i++){
                if(hor[i] == 'B') tempCount++;
            }
            if(tempCount == 8)res++;
            else if(tempCount<8 && counted == 0){
                res+=tempCount;
                counted++;
            }
        }
        System.out.println(res);
    }
}
