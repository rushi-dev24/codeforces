import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        List<List<Integer>> triples=new ArrayList<>();
        List<Integer> t1=Arrays.asList(a,b,c);
        List<Integer> t2=Arrays.asList(a,b,d);
        List<Integer> t3=Arrays.asList(a,c,d);
        List<Integer> t4=Arrays.asList(b,c,d);
        triples.add(t1);
        triples.add(t2);
        triples.add(t3);
        triples.add(t4);
        
        boolean tri=false,seg=false;
        for(List<Integer> triple:triples){
            String status=checkStatus(triple);
            if(status.equals("TRIANGLE")) tri=true;
            else if(status.equals("SEGMENT")) seg=true;
        }
        if(tri){
            System.out.println("TRIANGLE");
        }else if(seg){
            System.out.println("SEGMENT");
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }
    
    public static int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
    public static String checkStatus(List<Integer> triple){
        int l1=triple.get(0),l2=triple.get(1),l3=triple.get(2);
        int maxLen=max(l1,l2,l3);
        if(2*maxLen<l1+l2+l3)return "TRIANGLE";
        else if(2*maxLen==l1+l2+l3)return "SEGMENT";
        else return "IMPOSSIBLE";
        
    }
}
