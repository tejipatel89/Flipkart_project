package Java_Excecise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ArrayLista implements List<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> obj1 = new ArrayList<Integer>();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int b = a.nextInt();		
	obj1.add(b);
	
	int c = a.nextInt();
	obj1.add(c);
	
	int d = a.nextInt();
	obj1.add(d);

		
//	for (Object abc:obj1) {
//		System.out.println(abc);
//	}
//	
	
	for (int i=0; i<obj1.size(); i++) {
		int K =obj1.get(i)%2;
		
		if ( K == 0) {
			
			System.out.println("Even number is" + obj1.get(i));
		}
		
	}
		
	}

}
