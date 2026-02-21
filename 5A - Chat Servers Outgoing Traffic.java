import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int runningUsers=0;
        long noOfBytes=0;
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            if(input.isEmpty()) continue;
            char operator = input.charAt(0);
            if(operator == '+') runningUsers++;
            else if(operator == '-')runningUsers--;
            else{
                String msg=input.substring(input.indexOf(":")+1);
                noOfBytes+=(msg.length()*runningUsers);
            }
        }
        System.out.println(noOfBytes);
    }
}
