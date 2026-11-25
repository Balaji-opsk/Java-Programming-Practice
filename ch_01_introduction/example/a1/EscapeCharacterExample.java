package core_java.basics.ch_01_introduction.example.a1;

public class EscapeCharacterExample {

	public static void main(String[] args) {
		// Escape Character Backslash "\"
		// backslash is called as escape character in java
		System.out.println(" \" ");
		System.out.println(" \\ ");
		System.out.println("\\\\");
		System.out.println("\\" + "\\");

		System.out.println(" ' ");

		// we can create a new line by using \n inside the string
		System.out.println("We are learning \nJava");

		// we can create a new line by using \r inside the string
		System.out.println("Hello \rWorld");

		// we can create a tab space by using \t inside the string
		System.out.println("Sun\tShine");

	}

}
