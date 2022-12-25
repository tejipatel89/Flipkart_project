package Java_Interview;

public class Convert_2_letters_to_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "tej IS giving Pen to";

		String out = "";
		String A = " " + input+ " ";
		
		
		
		for (int i = 0; i < A.length() - 2; i++) {

			if (A.charAt(i) == ' ' && A.charAt(i + 3) == ' ') {

				char temp2 = A.charAt(i + 1);
				char temp3 = A.charAt(i + 2);

				out = out + Character.toUpperCase(temp2);
				out = out + Character.toUpperCase(temp3);

			}
			else if (A.charAt(i - 1) == ' ') {
				out = out;

			} else {
				out += A.charAt(i);
			}
			

		}

		System.out.println(out);

	}

}
