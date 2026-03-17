import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String path=sc.nextLine().trim();
        path=path.replace("/"," ").trim();
        if(path.length()==0){
            System.out.println("/");
            return;
        }
        for(String str:path.split(" ")){
            str=str.trim();
            if(str.length()!=0)
                System.out.print("/");
            System.out.print(str);
        }
    }
}
