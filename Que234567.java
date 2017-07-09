package assignment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import java.util.Collections;
public class Que234567 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList al2 = new ArrayList();
		al2.add("prem");
		al2.add("Rajeev");
		al2.add(20);
		HashSet<Integer> hs = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers to find minimum of it and press any key to display minimum number");
		while(scan.hasNextInt()){
			int L = scan.nextInt();
			al.add(L);
			hs.add(L);
		}
			al.sort(null);
			System.out.println("Minimum of given number by ArrayList is : " + al.get(0));
			Collections.reverse(al2);
			
			System.out.println("Minimum of given number by Hash set is : " + Collections.min(hs));
			for(Object o : al2)
				System.out.println(o);
			
		}
	}


