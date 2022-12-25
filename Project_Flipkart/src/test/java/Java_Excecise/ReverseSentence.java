package Java_Excecise;

public class ReverseSentence {

	public static void main(String[] args) {

		String a = "Today is Sunday";

		String[] b = a.split(" ");
		
		int c = a.length();
	
		
		System.out.println(c);

		for (int i = b.length - 1; i >= 0; i--) {

			System.out.print(" " + b[i]);
		}

		// note - split() and length
		// ma (clt+space) , syso, clt+shift+F
	}

}
