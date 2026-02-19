import java.util.*;
import java.util.Map.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> entries=new LinkedHashMap<>();
        List<Map<String,Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String entry[]=sc.nextLine().trim().split(" ");
            String player=entry[0];
            int marks=Integer.valueOf(entry[1]);
            Map<String,Integer> temp=new HashMap<>();
            temp.put(player,marks);
            list.add(temp);
            entries.put(player,entries.getOrDefault(player,0)+marks);
        }
        int max=Integer.MIN_VALUE;
        for(int marks:entries.values()){
            max=Math.max(max,marks);
        }
        Map<String,Integer> present=new HashMap<>();
        for(Map<String,Integer> entry:list){
            boolean isCompleted=false;
            for(String name:entry.keySet()){
                int marks=entry.get(name);
                present.put(name,present.getOrDefault(name,0)+marks);
                if(present.get(name)>=max && entries.get(name)==max){
                    System.out.println(name);
                    isCompleted=true;
                    break;
                }
            }
            if(isCompleted){
                
                break;
            }
        }
    }
}