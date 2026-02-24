import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stations=sc.nextLine().trim();
		StringBuilder sb=new StringBuilder(stations);
		String before=sc.next();
		String after=sc.next();
		boolean forward=false,backward=false;
		int n=stations.length(),beforeSleep,afterSleep;

		beforeSleep=stations.indexOf(before);
		if(beforeSleep!=-1) {
			afterSleep=stations.indexOf(after,beforeSleep+before.length());
			if(afterSleep!=-1) forward=true;
		}

		String oppStations=new StringBuilder(stations).reverse().toString();
    
		beforeSleep=oppStations.indexOf(before);
		if(beforeSleep!=-1){
		    afterSleep=oppStations.indexOf(after,beforeSleep+before.length());
		    if(afterSleep!=-1) backward=true;
		}
		if(forward && backward ) System.out.println("both");
		else if(forward) System.out.println("forward");
		else if(backward) System.out.println("backward");
		else System.out.println("fantasy");
	}
}
