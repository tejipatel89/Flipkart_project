package Java_Excecise;

import java.util.ArrayList;
import java.util.List;

public abstract class ArrayLista implements List<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Object> obj1 = new ArrayList<Object>();
		
	obj1.add("David");
	obj1.add("45");
	obj1.add("pune");
	obj1.add("BE Stuent");
		
	for (Object abc:obj1) {
		System.out.println(abc);
	}
	
		
	}

}
