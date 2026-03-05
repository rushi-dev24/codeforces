import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] x=new int[3];
        int[] y=new int[3];
        for (int i=0;i<3;i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        if (isRight(x[0],y[0],x[1],y[1],x[2],y[2])) {
            System.out.println("RIGHT");
            return;
        }
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        for (int i=0; i<3;i++){
            int originalX=x[i];
            int originalY=y[i];
            for (int j=0;j<4;j++) {
                x[i]=originalX+dx[j];
                y[i]=originalY+dy[j];
                if (isRight(x[0], y[0], x[1], y[1], x[2], y[2])) {
                    System.out.println("ALMOST");
                    return;
                }
            }
            x[i]=originalX;
            y[i]=originalY;
        }
        System.out.println("NEITHER");
    }

    public static boolean isRight(int x1, int y1, int x2, int y2, int x3, int y3) {
        int d12=distSq(x1,y1,x2,y2);
        int d23=distSq(x2,y2,x3,y3);
        int d31=distSq(x3,y3,x1,y1);
        if (d12==0||d23==0||d31==0)return false;
        if ((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))==0)return false;
        return (d12+d23==d31)||(d12+d31==d23)||(d23+d31==d12);
    }

    public static int distSq(int x1,int y1,int x2,int y2){
        return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    }
}
