import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        char[][] flag=new char[n][m];
        for(int i=0;i<n;i++){
            String row=sc.nextLine();
            for(int j=0;j<m;j++){
                flag[i][j]=row.charAt(j);
            }
        }
        char curr=flag[0][0],prev=flag[0][0];
        for(int i=0;i<n;i++){
            if(i!=0) prev=curr;
            curr=flag[i][0];
            for(int j=0;j<m;j++){
                //Row check
                if(flag[i][j] != curr){
                    System.out.println("NO");
                    return;
                }
                //Prev row check
                if(i!=0 && prev==curr){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
