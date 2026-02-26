import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[][] pw=new char[3][3];
        boolean isValid=true;
        for(int i=0;i<3;i++){
            String ip=sc.nextLine();
            pw[i][0]=ip.charAt(0);
            pw[i][1]=ip.charAt(1);
            pw[i][2]=ip.charAt(2);
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(pw[i][j] == pw[2-i][2-j]){
                    continue;
                }else{
                    isValid=false;
                    break;
                }
            }
            if(!isValid){
                break;
            }
        }
        if(isValid) System.out.println("YES");
        else System.out.println("NO");
    }
}
