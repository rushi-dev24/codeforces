import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        String result="NO";
        if((w>=4) && (w & 1) == 0){
            int temp=w/2;
            result="YES";
        }
        System.out.println(result);
    }
}
