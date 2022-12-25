package Java_Interview;

import java.util.Scanner;

public class FirstLetter {

	static String a = "";
	static String b = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter A String - ");

		a = sc.nextLine();

		firstletter(a);
		twoletter(b);

	}

	public static void firstletter(String A) {

		String C = " " + A;

		for (int i = 0; i < C.length(); i++) {

			if (C.charAt(i) == ' ') {

				b = b + C.charAt(i);
				char temp = C.charAt(i + 1);
				b = b + Character.toUpperCase(temp);

			} else if (C.charAt(i - 1) == ' ') {

				b = b;
			} else {
				b = b + C.charAt(i);

			}

		}

		System.out.println(b);

		b = b.trim();
		System.out.println(b);
	}

	public static void twoletter(String B) {

		String D = " " + B + " ";
		String E = "";

		for (int i = 0; i < D.length() - 3; i++) {

			if (D.charAt(i) == ' ' && D.charAt(i + 3) == ' ') {

				char temp1 = D.charAt(i + 1);
				char temp2 = D.charAt(i + 2);
				E = E + D.charAt(i);
				E = E + Character.toUpperCase(temp1);
				E = E + Character.toUpperCase(temp2);
				E = E + D.charAt(i + 3);

			}

			else if (D.charAt(i - 1) == ' ' && D.charAt(i + 2) == ' ') {

				E = E;

			} else if (D.charAt(i + 1) == ' ' && D.charAt(i - 2) == ' ') {

				E = E;

			}

			else {

				E = E + D.charAt(i);

			}

		}
 E= E.trim();
		System.out.println(E);

	}

}
