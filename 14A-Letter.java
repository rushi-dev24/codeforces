import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        char[][] sheet=new char[n][m];
        for(int i=0;i<n;i++){
            String row=sc.nextLine().trim();
            for(int j=0;j<m;j++){
                sheet[i][j]=row.charAt(j);
            }
        }
        int sti=Integer.MAX_VALUE,stj=Integer.MAX_VALUE,endi=Integer.MIN_VALUE,endj=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(sheet[i][j] == '*'){
                    sti=Math.min(i,sti);
                    stj=Math.min(j,stj);
                }
                if(sheet[n-i-1][m-j-1]=='*'){
                    endi=Math.max(n-i-1,endi);
                    endj=Math.max(m-j-1,endj);
                }
            }
        }
        for(int i=sti;i<=endi;i++){
            for(int j=stj;j<=endj;j++){
                System.out.print(sheet[i][j]);
            }
            if(i!=endi)
                System.out.println();
        }
    }
}
