package controlstatement;

import java.util.Scanner;

public class DistanceTra {
	public int distance(int t) {
		int u=10;
		int a=5;
		int dt=u*t+((a*t*t)/2);
		return dt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		DistanceTra d=new DistanceTra();
		System.out.println( d.distance(t1));
		System.out.println(d.distance(t2));

	}

}
